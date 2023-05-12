package com.botyware.uevent.repository;

import org.neo4j.driver.*;
import org.neo4j.driver.Record;
import org.neo4j.driver.types.Node;
import org.springframework.data.neo4j.core.Neo4jClient;
import com.botyware.uevent.Utility;

// ctrl + shift + f
//TODO 1 session nem biztos hogy elég , conn pool kéne ha alapból nem úgy működik
//relations:  booked, attend, requestedVoting




public final class Neo4jEventRepository implements IEventRepository {
    //---------------------------------------------
    //fields,props
    //---------------------------------------------
    private final Session session;

    //---------------------------------------------
    //constructors
    //---------------------------------------------
    public Neo4jEventRepository() {
        String connectionString = Utility.getEnvOrDefault("NEO4J_CONNECTION_STRING", "neo4j+s://68f9044e.databases.neo4j.io:7687");
        String username = Utility.getEnvOrDefault("NEO4J_USERNAME", "neo4j");
        String password = Utility.getEnvOrDefault("NEO4J_PASSWORD", "eWjweneXJ9imIFl0KPuQx8IqESScBuPnU4jDXgN4uTI");

        Driver driver = GraphDatabase.driver(connectionString, AuthTokens.basic(username, password));
        session = driver.session();
    }

    //---------------------------------------------
    //methods
    //---------------------------------------------
    public void createNodeForClass(Class<?> p_class) {
        String label = p_class.getSimpleName();
        this.session.run("CREATE (n:" + label + ")");
    }

    public void testQuery() {
        Result r = this.session.run("MATCH (eventNodes:event),(movies:Movie) return eventNodes, movies");
        while (r.hasNext()) {
            Record record = r.next();
            Node eventNode = record.get("eventNodes").asNode();
            Node movieNode = record.get("movies").asNode();
            System.out.println(eventNode.get("name").asString() + " " + movieNode.get("title").asString());
        }

    }

    @Override
    public Object readAll() {
        return null;
    }

    @Override
    public Object readOne(String uuid) {
        return null;
    }

    @Override
    public void create(Object e) {

    }

    @Override
    public void update(Object e) {

    }

//    public Event[] readAll() {}
//    public Event readOne(String uuid) {}
//    public void create(Event e) {}
//    public void update(Event e) {}
//    public Event[] readAllInSquare(Coordinate a, Coordinate b, Coordinate c, Coordinate d) {}
//    public Event[] readAllInRadius(Coordinate p_center, double p_radiusInKm) {}
//    public Event[] readAllWhereCapacityOver(int p_capacity) {}
//    public Event[] readAllHistoricByUserId(String uuid) {}
//    public Event[] readAllOngoingByUserId(String uuid) {}
//    public Event[] readAllYoungerThan(Time p_time) {}
//    public Event[] readOneByName(String p_name) {}
//    public Event[] readOneByDate(Time p_time) {}
}

//"""
//MATCH (eventNodes:event) return eventNodes LIMIT 5
//
//"""

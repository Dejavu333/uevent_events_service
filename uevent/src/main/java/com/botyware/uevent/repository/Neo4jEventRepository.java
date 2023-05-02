package com.botyware.uevent.repository;

import com.botyware.uevent.domain.Event;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.types.Coordinate;

import java.sql.Time;

public final class Neo4jEventRepository implements IEventRepository{
    private final Neo4jClient neo4jClient;

    public Neo4jEventRepository(Neo4jClient p_neo4jClient) {
        this.neo4jClient = p_neo4jClient;
    }

    public void createNodeForClass(Class<?> p_class) {
        String label = p_class.getSimpleName();
        neo4jClient.query("CREATE (n:" + label + ")");
    }

    public Event[] readAll() {}
    public Event readOne(String uuid) {}
    public void create(Event e) {}
    public void update(Event e) {}

    public Event[] readAllInSquare(Coordinate a, Coordinate b, Coordinate c, Coordinate d) {}
    public Event[] readAllInRadius(Coordinate p_center, double p_radiusInKm) {}
    public Event[] readAllWhereCapacityOver(int p_capacity) {}
    public Event[] readAllHistoricByUserId(String uuid) {}
    public Event[] readAllOngoingByUserId(String uuid) {}
    public Event[] readAllYoungerThan(Time p_time) {}
    public Event[] readOneByName(String p_name) {}
    public Event[] readOneByDate(Time p_time) {}



}

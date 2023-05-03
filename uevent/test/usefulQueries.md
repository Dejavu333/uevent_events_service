

//creates a node with properties, and returns it(optional)
Create (u:User{name:'szaruser', historicEventCount:10}) return u

//returns every node with label event and User
Match (e:event),(u:User) return e,u

//creates a relation between two nodes
MATCH (u:User), (e:Event)
        WHERE u.name = 'John' AND e.name = 'Event1'
        CREATE (u)-[:PARTICIPATED_IN]->(e)

//deletes a node
MATCH (n) WHERE id(n) = 123 DELETE n

//adds a new property to an existing relation
MATCH (u:User), (e:event)
        MATCH (u:User)-[r:PARTICIPATED_IN]->(e:event)
        SET r.newAttr = 'valami'
        return u,e
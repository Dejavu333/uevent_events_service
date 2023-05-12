package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.*;
import org.springframework.data.neo4j.types.Coordinate;

import java.util.List;

public class UEvent extends Entity {
    String name;
    Categories category;
    int capacity;
    String address;
    Coordinate location;
    List<String> userIds;


    public UEvent(String p_name, Categories p_category, int p_capacity, String p_address,
                  Coordinate p_location, List<String> p_userIds, Plug ...p_plugs) {
        this.name = p_name;
        this.category = p_category;
        this.capacity = p_capacity;
        this.address = p_address;
        this.location = p_location;
        this.userIds = p_userIds;
        this.registerPlugs(p_plugs);
    }
}
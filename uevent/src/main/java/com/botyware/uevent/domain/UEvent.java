package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.*;
import org.springframework.data.neo4j.types.Coordinate;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UEvent extends Entity {
    //--------------------------
    // properties, fields
    //--------------------------
    @Setter @Getter
    String name;
    @Setter @Getter
    Categories category;
    @Setter @Getter
    int capacity;
    @Setter @Getter
    String address;
    @Setter @Getter
    Coordinate location;
    @Setter @Getter
    List<String> userIds;

    //--------------------------
    // constructors
    //--------------------------
    public UEvent(String p_name, Categories p_category, int p_capacity, String p_address,
                  Coordinate p_location, List<String> p_userIds, Plug ...p_plugs) {
        // required
        this.name = p_name;
        this.category = p_category;
        this.capacity = p_capacity;
        this.address = p_address;
        this.location = p_location;
        this.userIds = p_userIds;
        // optional
        this.registerPlugs(p_plugs);
    }
}
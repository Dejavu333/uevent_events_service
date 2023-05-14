package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.Plug;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UUser extends Entity {
    //--------------------------
    // properties, fields
    //--------------------------
    @Setter @Getter
    String id;
    @Setter @Getter
    String description;
    @Setter @Getter
    List<String> imgRefs;

    //--------------------------
    // constructors
    //--------------------------
    public UUser(String p_id, String p_description, List<String> p_imgRefs, Plug ...p_plugs) {
        // required
        this.id = p_id;
        this.description = p_description;
        this.imgRefs = p_imgRefs;
        // optional
        this.registerPlugs(p_plugs);
    }
}

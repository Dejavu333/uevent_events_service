package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.Plug;

public class UUser extends Entity {
    //TODO fields

    String Id;
    String description;
    String imgRef;

    public UUser(Plug...p_plugs) {
        this.registerPlugs(p_plugs);
    }
}

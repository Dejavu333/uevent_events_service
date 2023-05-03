package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.NamePlug;

public class User extends Entity {
    //TODO fields

    NamePlug name;
    public User(Plug...p_plugs) {
        this.registerPlugs(p_plugs);
    }
}

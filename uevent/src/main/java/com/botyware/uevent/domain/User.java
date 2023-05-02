package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.Plug;

public class User extends Entity {

    public User(Plug...p_plugs) {
        super();
        this.registerPlugs(p_plugs);
    }
}

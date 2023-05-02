package com.botyware.uevent.domain;

public class User extends Entity {

    public User(Plug...p_plugs) {
        super();
        this.registerPlugs(p_plugs);
    }
}

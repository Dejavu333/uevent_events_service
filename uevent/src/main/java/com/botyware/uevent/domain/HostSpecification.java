package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.EventAborterPlug;
import com.botyware.uevent.domain.plugs.NullPlug;

public class HostSpecification implements ISpecification {

    @Override
    //if user has EventAborterPlug then is host;
    public boolean is(Entity p_entity) {
        boolean hasEventAborterPlug = !p_entity.plugByType(EventAborterPlug.class).getClass().equals(NullPlug.class);
        return hasEventAborterPlug;
    }
}
/*
* abort, rename, invite, boost
*
*
*
* */
package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.EventAborterPlug;
import com.botyware.uevent.domain.plugs.NullPlug;

public class HostSpecification implements ISpecification {

    @Override
    public boolean is(Entity p_entity) {
        return (p_entity.plugByType(EventAborterPlug.class).equals(NullPlug.class));
    }
}
/*
* abort, rename, invite, boost
*
*
*
* */
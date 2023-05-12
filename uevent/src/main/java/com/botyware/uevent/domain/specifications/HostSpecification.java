package com.botyware.uevent.domain.specifications;

import com.botyware.uevent.domain.Entity;
import com.botyware.uevent.domain.plugs.EventAborterPlug;

public final class HostSpecification implements ISpecification {

    @Override
    //if user has EventAborterPlug then is host;
    public boolean is(Entity p_entity) {
        boolean hasEventAborterPlug = p_entity.hasPlugByType(EventAborterPlug.class);
        return hasEventAborterPlug;
    }
}
/*
* abort, rename, invite, boost
*
*
*
* */
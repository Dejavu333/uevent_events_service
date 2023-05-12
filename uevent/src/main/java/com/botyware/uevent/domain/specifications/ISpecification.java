package com.botyware.uevent.domain.specifications;

import com.botyware.uevent.domain.Entity;

public interface ISpecification {
    public boolean is(Entity p_entity);
}

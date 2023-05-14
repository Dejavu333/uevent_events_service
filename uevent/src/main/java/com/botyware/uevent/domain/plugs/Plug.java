package com.botyware.uevent.domain.plugs;

import com.botyware.uevent.domain.Entity;
import lombok.Getter;
import lombok.Setter;

public abstract class Plug {
    @Getter @Setter
    Entity ownerEntity;
}

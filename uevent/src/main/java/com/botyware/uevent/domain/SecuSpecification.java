package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.EventAborterPlug;
import com.botyware.uevent.domain.plugs.NullPlug;
import com.botyware.uevent.domain.plugs.QRReader;

public class SecuSpecification implements ISpecification {
    @Override
    public boolean is(Entity p_entity) {
        return (p_entity.plugByType(QRReader.class).equals(NullPlug.class) &&
                !p_entity.plugByType(EventAborterPlug.class).equals(NullPlug.class));
    }
}

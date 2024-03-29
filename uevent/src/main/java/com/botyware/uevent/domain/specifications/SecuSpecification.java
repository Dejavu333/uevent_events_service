package com.botyware.uevent.domain.specifications;

import com.botyware.uevent.domain.Entity;
import com.botyware.uevent.domain.plugs.EventAborterPlug;
import com.botyware.uevent.domain.plugs.NullPlug;
import com.botyware.uevent.domain.plugs.QRReaderPlug;

public final class SecuSpecification implements ISpecification {
    @Override
    //if user has QRReaderPlug but does not have EventAborterPlug then is secu;
    public boolean is(Entity p_entity) {
        boolean hasQRReaderPlug = !p_entity.getPlugByType(QRReaderPlug.class).getClass().equals(NullPlug.class);
        boolean hasEventAborterPlug = !p_entity.getPlugByType(EventAborterPlug.class).getClass().equals(NullPlug.class);
        return (hasQRReaderPlug && !hasEventAborterPlug);
    }
}

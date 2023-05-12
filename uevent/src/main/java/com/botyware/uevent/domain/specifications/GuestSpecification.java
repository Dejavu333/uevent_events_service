package com.botyware.uevent.domain.specifications;

import com.botyware.uevent.domain.Entity;
import com.botyware.uevent.domain.plugs.EventAborterPlug;
import com.botyware.uevent.domain.plugs.QRReaderPlug;

public final class GuestSpecification implements ISpecification {
    @Override
    //if user does not have QRReaderPlug then is guest;
    public boolean is(Entity p_entity) {
        boolean hasEventAborterPlug = p_entity.hasPlugByType(EventAborterPlug.class);
        boolean hasQRReaderPlug = p_entity.hasPlugByType(QRReaderPlug.class);
        return (!hasQRReaderPlug && !hasEventAborterPlug);
    }
}

package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.EventAborterPlug;
import com.botyware.uevent.domain.plugs.NullPlug;
import com.botyware.uevent.domain.plugs.QRReaderPlug;

public class GuestSpecification implements ISpecification {
    @Override
    //if user does not have QRReaderPlug then is guest;
    public boolean is(Entity p_entity) {
        boolean hasEventAborterPlug = !p_entity.plugByType(EventAborterPlug.class).getClass().equals(NullPlug.class);
        boolean hasQRReaderPlug = !p_entity.plugByType(QRReaderPlug.class).getClass().equals(NullPlug.class);
        return (!hasQRReaderPlug && !hasEventAborterPlug);
    }
}

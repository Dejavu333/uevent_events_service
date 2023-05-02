package com.botyware.uevent.domain;
//if in plugins then not required

import com.botyware.uevent.domain.plugs.*;

public class Event extends Entity {
    NamePlug name;
    CategoryPlug category;
    CapacityPlug capacity;
    AddressPlug address;
    LocaitonPlug location;
    UserIdsPlug userIds;
    FlagsPlug flags;

    public Event(Plug ...p_plugs) {
        this.registerPlugs(p_plugs);
    }
}

//    users[]
//
//    //Plugins[] inherited
//}
//
//user addHostPreviliges(user) {
//    abortEvent -> hostrole
//    qr but not abort -> secu
//    no qr and no abort -> guest
//
//         host:   musthave[abort,valami]
//         secu:   musthave[qr] mustnothave[abort]
//         guest:  musthave[ownsqr] mustnothave[abort,qr]
//
//}
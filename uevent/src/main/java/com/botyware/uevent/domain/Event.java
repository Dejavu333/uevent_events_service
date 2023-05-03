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

    public Event(NamePlug p_name, CategoryPlug p_category, CapacityPlug p_capacity, AddressPlug p_address,
                 LocaitonPlug p_location, UserIdsPlug p_userIds, FlagsPlug p_flags, Plug ...p_plugs) {
        this.name = p_name;
        this.category = p_category;
        this.capacity = p_capacity;
        this.address = p_address;
        this.location = p_location;
        this.userIds = p_userIds;
        this.flags = p_flags;
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
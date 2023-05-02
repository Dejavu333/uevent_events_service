package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.NullPlug;
import com.botyware.uevent.domain.plugs.Plug;

import java.util.LinkedList;

public class Entity {
    private LinkedList<Plug> plugins = new LinkedList<>();

    public void registerPlugs(Plug[] p_plugs) {
        for (Plug plug : p_plugs) {
            plug.ownerEntity = this;
            this.plugins.add(plug);
        }
    }

    public void registerPlug(Plug p_plug) {
            p_plug.ownerEntity = this;
            this.plugins.add(p_plug);
    }

    public Plug PlugByType(Class<?> p_plugClass) {
        for (Plug plug : plugins) {
            if (plug.getClass().equals(p_plugClass)) {
                return plug;
            }
        }
        return new NullPlug();
    }

    public Plug plugByType(Class<?> plugClass) {
        for (Plug plug : plugins) {
            if (plug.getClass().equals(plugClass)) {
                return plug;
            }
        }
        return new NullPlug();
    }
}

//enum{}
//
//ISpecifaction {is}
//
//HostSpec {
//    bool is()
//    abort
//}
//
//SecuSpec {
//
//}

package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.NullPlug;
import com.botyware.uevent.domain.plugs.Plug;

import java.util.LinkedList;

public abstract class Entity {
    //plugs vector contains the optional plugs which can be added at runtime too
    private LinkedList<Plug> plugs = new LinkedList<>();

    public void registerPlugs(Plug[] p_plugs) {
        for (Plug plug : p_plugs) {
            plug.ownerEntity = this;
            this.plugs.add(plug);
        }
    }

    public void registerPlug(Plug p_plug) {
            p_plug.ownerEntity = this;
            this.plugs.add(p_plug);
    }

    public Plug PlugByType(Class<?> p_plugClass) {
        for (Plug plug : plugs) {
            if (plug.getClass().equals(p_plugClass)) {
                return plug;
            }
        }
        return new NullPlug();
    }

    public Plug plugByType(Class<?> plugClass) {
        for (Plug plug : plugs) {
            if (plug.getClass().equals(plugClass)) {
                return plug;
            }
        }
        return new NullPlug();
    }

    public boolean hasPlugByType(Class<?> plugClass) {
       return !NullPlug.class.equals(this.plugByType(plugClass).getClass());
    }
}

package com.botyware.uevent.domain;

import com.botyware.uevent.domain.plugs.NullPlug;
import com.botyware.uevent.domain.plugs.Plug;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public abstract class Entity {
    //--------------------------
    // properties, fields
    //--------------------------
    //plugs contains optional plugins which can be added at runtime too
    private LinkedList<Plug> plugs = new LinkedList<>();
    
    //--------------------------
    // methods
    //--------------------------
    public void registerPlugs(Plug[] p_plugs) {
        for (Plug plug : p_plugs) {
            plug.setOwnerEntity(this);
            this.plugs.add(plug);
        }
    }

    public void registerPlug(@NotNull Plug p_plug) {
            p_plug.setOwnerEntity(this);
            this.plugs.add(p_plug);
    }

    public Plug getPlugByType(@NotNull Class<?> p_plugClass) {
        for (Plug plug : plugs) {
            if (plug.getClass().equals(p_plugClass)) {
                return plug;
            }
        }
        return new NullPlug();
    }

    public boolean hasPlugByType(Class<?> p_plugClass) {
       return !NullPlug.class.equals(this.getPlugByType(p_plugClass).getClass());
    }
}

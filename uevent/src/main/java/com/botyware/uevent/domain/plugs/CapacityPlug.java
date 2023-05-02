package com.botyware.uevent.domain.plugs;

import com.botyware.uevent.domain.Plug;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CapacityPlug extends Plug {
    private long capacity;
}

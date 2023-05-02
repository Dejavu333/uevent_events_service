package com.botyware.uevent.repository;

import com.botyware.uevent.domain.Event;

public final class ProxyUserRepository implements IUserRepository{
    public Event[] readAll() {}
    public Event readOne(String uuid) {}
    public void create(Event e) {}
    public void update(Event e) {}
}

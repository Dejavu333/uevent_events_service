package com.botyware.uevent.repository;

import com.botyware.uevent.domain.Event;

public interface IRepository {
    public Event[] readAll();
    public Event readOne(String uuid);
    public void create(Event e);
    public void update(Event e);
}

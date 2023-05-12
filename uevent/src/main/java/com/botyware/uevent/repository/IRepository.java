package com.botyware.uevent.repository;

import com.botyware.uevent.domain.UEvent;

public interface IRepository {
    public Object readAll();
    public Object readOne(String uuid);
    public void create(Object e);
    public void update(Object e);
}

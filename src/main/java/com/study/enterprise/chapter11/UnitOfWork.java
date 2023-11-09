package com.study.enterprise.chapter11;

import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {
    private List newObjects = new ArrayList();
    private List dirtyObjects = new ArrayList();
    private List removedObjects = new ArrayList();
    private static ThreadLocal current = new ThreadLocal();

    public static void newCurrent() {
        setCurrent(new UnitOfWork());
    }

    public static UnitOfWork getCurrent() {
        return (UnitOfWork) current.get();
    }

    public static void setCurrent(UnitOfWork unitOfWork) {
        current.set(unitOfWork);
    }

    public void registerNew(DomainObject domainObject) {
        Assert.notNull("id not null", domainObject.get);
    }

    public void registerClean(DomainObject domainObject) {
    }

    public void registerDirty(DomainObject domainObject) {
    }

    public void registerRemoved(DomainObject domainObject) {
    }
}

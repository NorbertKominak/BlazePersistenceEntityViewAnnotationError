package com.example.demo.domain;

import java.util.UUID;

abstract public class DomainObject<ROOT> implements BlazeDomain<ROOT> {

    public String id = UUID.randomUUID().toString();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + getId();
    }
}
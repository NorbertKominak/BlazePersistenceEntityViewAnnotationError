package com.example.demo.dated;

import com.example.demo.domain.DomainObject;

import java.time.Instant;


abstract public class DatedObject<ROOT> extends DomainObject<ROOT> implements BlazeDated<ROOT> {

    protected Instant created;

    protected Instant updated;

    protected Instant deleted;
}

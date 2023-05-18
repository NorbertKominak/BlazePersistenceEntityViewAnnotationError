package com.example.demo.domain;

import com.blazebit.persistence.view.IdMapping;

public interface BlazeDomain<ROOT> {

    /**
     * Returns the id of an object.
     */
    @IdMapping
    String getId();
}

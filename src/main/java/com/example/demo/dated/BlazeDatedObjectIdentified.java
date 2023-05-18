package com.example.demo.dated;

import com.blazebit.persistence.view.EntityView;
import com.example.demo.domain.BlazeDomainObjectIdentified;

import java.time.Instant;

@EntityView(DatedObject.class)
public abstract class BlazeDatedObjectIdentified<ROOT> extends BlazeDomainObjectIdentified<ROOT> {

    public abstract Instant getCreated();

    public abstract Instant getDeleted();
}

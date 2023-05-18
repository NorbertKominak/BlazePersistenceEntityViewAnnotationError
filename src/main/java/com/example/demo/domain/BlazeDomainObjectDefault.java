package com.example.demo.domain;

import com.blazebit.persistence.view.EntityView;


@EntityView(DomainObject.class)
public abstract class BlazeDomainObjectDefault<ROOT> implements BlazeDomain<ROOT> {

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + getId();
    }
}

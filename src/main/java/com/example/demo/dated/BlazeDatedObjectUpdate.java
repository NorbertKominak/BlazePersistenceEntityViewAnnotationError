package com.example.demo.dated;

import com.blazebit.persistence.view.EntityView;
import com.example.demo.domain.BlazeDomainObjectUpdate;

@EntityView(DatedObject.class)
public abstract class BlazeDatedObjectUpdate<ROOT> extends BlazeDomainObjectUpdate<ROOT> {
}

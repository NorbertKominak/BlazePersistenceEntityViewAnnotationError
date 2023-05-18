package com.example.demo.dated;

import com.blazebit.persistence.view.EntityView;
import com.example.demo.domain.BlazeDomainObjectDefault;

@EntityView(DatedObject.class)
public abstract class BlazeDatedObjectDefault<ROOT> extends BlazeDomainObjectDefault<ROOT> implements BlazeDated<ROOT> {
}

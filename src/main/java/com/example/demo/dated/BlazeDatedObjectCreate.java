package com.example.demo.dated;

import com.blazebit.persistence.view.EntityView;
import com.example.demo.domain.BlazeDomainObjectCreate;

@EntityView(DatedObject.class)
public abstract class BlazeDatedObjectCreate<Y> extends BlazeDomainObjectCreate<Y> {
}

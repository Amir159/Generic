package com.syncretis.handlers;

import com.syncretis.container.*;
import com.syncretis.material.Glass;

public class GlassHandler extends Handler<Glass> {

    @Override
    public ProductContainer<Glass> handle(RecyclableMaterialContainer container) {
        System.out.println("Glass handler");
        return new ProductContainer<Glass>(container.getMass() * 0.55, container.getType());
    }
}


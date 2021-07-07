package com.syncretis.handlers;

import com.syncretis.container.*;
import com.syncretis.material.Plastic;

public class PlasticHandler extends Handler<Plastic> {
    @Override
    public ProductContainer<Plastic> handle(RecyclableMaterialContainer container) {
        System.out.println("Plastic handler");
        return new ProductContainer<Plastic>(container.getMass() * 0.66, container.getType());
    }
}

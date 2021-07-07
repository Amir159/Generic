package com.syncretis.handlers;

import com.syncretis.container.*;
import com.syncretis.material.Paper;

public class PaperHandler extends Handler<Paper> {
    @Override
    public ProductContainer<Paper> handle(RecyclableMaterialContainer container) {
        System.out.println("Paper handler");
        return new ProductContainer<Paper>(container.getMass() * 0.74, container.getType());
    }
}
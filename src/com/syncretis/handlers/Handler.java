package com.syncretis.handlers;

import com.syncretis.container.ProductContainer;
import com.syncretis.container.RecyclableMaterialContainer;
import com.syncretis.material.Material;

public abstract class Handler<MATERIAL extends Material> {

    public abstract ProductContainer<MATERIAL> handle(RecyclableMaterialContainer<? extends Material> container);
}

package com.syncretis.handlers;

import com.syncretis.container.*;
import com.syncretis.material.Material;

public abstract class Handler<MATERIAL extends Material> {

    public abstract ProductContainer<MATERIAL> handle(RecyclableMaterialContainer<? extends Material> container);
}

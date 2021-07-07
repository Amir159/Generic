package com.syncretis.container;

import com.syncretis.material.Material;

public class ProductContainer<MATERIAL extends Material> extends Container {
    Class<MATERIAL> type;

    public ProductContainer(double mass, Class<MATERIAL> type) {
        super(mass);
        this.type = type;
    }

    public Class<MATERIAL> getType() {
        return type;
    }
}

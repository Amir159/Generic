package com.syncretis.container;

import com.syncretis.material.Material;

public class RecyclableMaterialContainer<MATERIAL extends Material> extends Container<MATERIAL> {
    Class<MATERIAL> type;

    public RecyclableMaterialContainer(double mass, Class<MATERIAL> type) {
        super(mass);
        this.type = type;
    }

    public Class<MATERIAL> getType() {
        return type;
    }
}

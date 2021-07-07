package com.syncretis.container;

import com.syncretis.material.Material;

public abstract class Container<MATERIAL extends Material> {
    private final double mass;

    public Container(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }
}

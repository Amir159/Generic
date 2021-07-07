package com.syncretis.distributor;

import com.syncretis.container.*;
import com.syncretis.handlers.Handler;
import com.syncretis.material.Material;

import java.util.ArrayList;
import java.util.Map;

public class Distributor {
    private final Map<Class<? extends Material>, Handler<? extends Material>> handlerMap;

    public Distributor(Map<Class<? extends Material>, Handler<? extends Material>> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public ArrayList<ProductContainer<? extends Material>> distribute(ArrayList<RecyclableMaterialContainer<? extends Material>> arr) {
        ArrayList<ProductContainer<? extends Material>> newArr = new ArrayList<>();
        for (RecyclableMaterialContainer<? extends Material> recyclableMaterial : arr) {
            newArr.add(handlerMap.get(recyclableMaterial.getType()).handle(recyclableMaterial));
        }

        return newArr;
    }
}
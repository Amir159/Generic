package com.syncretis.distributor;

import com.syncretis.container.ProductContainer;
import com.syncretis.container.RecyclableMaterialContainer;
import com.syncretis.handlers.GlassHandler;
import com.syncretis.handlers.Handler;
import com.syncretis.handlers.PaperHandler;
import com.syncretis.handlers.PlasticHandler;
import com.syncretis.material.Glass;
import com.syncretis.material.Material;
import com.syncretis.material.Paper;
import com.syncretis.material.Plastic;

import java.util.ArrayList;
import java.util.Map;

public class Distributor {
    private Map<Class<? extends Material>, Handler<? extends Material>> handlerMap;

    public Distributor(/*Map*/) {

    }

    public ArrayList<ProductContainer<? extends Material>> distribute(ArrayList<RecyclableMaterialContainer<? extends Material>> arr) {
        ArrayList<ProductContainer<? extends Material>> newArr = new ArrayList<>();
        for (RecyclableMaterialContainer<? extends Material> recyclableMaterial : arr) {
            if (recyclableMaterial.getType().equals(Glass.class)) {
                Handler<Glass> handler = new GlassHandler();
                newArr.add(handler.handle(recyclableMaterial));
            } else if (recyclableMaterial.getType().equals(Paper.class)) {
                Handler<Paper> handler = new PaperHandler();
                newArr.add(handler.handle(recyclableMaterial));
            } else if (recyclableMaterial.getType().equals(Plastic.class)) {
                Handler<Plastic> handler = new PlasticHandler();
                newArr.add(handler.handle(recyclableMaterial));
            }
        }

        return newArr;
    }
}

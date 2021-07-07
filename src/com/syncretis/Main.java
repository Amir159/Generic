package com.syncretis;

import com.syncretis.container.*;
import com.syncretis.distributor.Distributor;
import com.syncretis.handlers.*;
import com.syncretis.material.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        RecyclableMaterialContainer<Plastic> pl = new RecyclableMaterialContainer<>(1200, Plastic.class);
        RecyclableMaterialContainer<Paper> pa = new RecyclableMaterialContainer<>(3050, Paper.class);
        RecyclableMaterialContainer<Glass> gl = new RecyclableMaterialContainer<>(1330, Glass.class);

        ArrayList<RecyclableMaterialContainer<? extends Material>> arr = new ArrayList<>();
        arr.add(pl);
        arr.add(pa);
        arr.add(gl);

        for (RecyclableMaterialContainer<? extends Material> recyclableMaterialContainer : arr) {
            System.out.println(recyclableMaterialContainer.getType() + " Weight = " + recyclableMaterialContainer.getMass());
        }

        Map<Class<? extends Material>, Handler<? extends Material>> handlerMap = new HashMap<>();
        handlerMap.put(Glass.class, new GlassHandler());
        handlerMap.put(Paper.class, new PaperHandler());
        handlerMap.put(Plastic.class, new PlasticHandler());

        Distributor distributor = new Distributor(handlerMap);
        ArrayList<ProductContainer<? extends Material>> newArr = distributor.distribute(arr);

        for (ProductContainer<? extends Material> product : newArr) {
            System.out.println(product.getType() + " Weight = " + product.getMass());
        }
    }
}

package com.syncretis;

import com.syncretis.container.ProductContainer;
import com.syncretis.container.RecyclableMaterialContainer;
import com.syncretis.distributor.Distributor;
import com.syncretis.material.Glass;
import com.syncretis.material.Material;
import com.syncretis.material.Paper;
import com.syncretis.material.Plastic;

import java.util.ArrayList;

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

        Distributor distributor = new Distributor();
        ArrayList<ProductContainer<? extends Material>> newArr = distributor.distribute(arr);

        for (ProductContainer<? extends Material> product : newArr) {
            System.out.println(product.getType() + " Weight = " + product.getMass());
        }
    }
}

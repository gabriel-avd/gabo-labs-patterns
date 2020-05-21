package com.gabo.labs.structural.flyweight;

import java.util.HashMap;

public class NubeFactory {
    HashMap nubesMap;

    public NubeFactory() {
        this.nubesMap = new HashMap<TipoNube, Nube>();
    }

    public Nube getNube(TipoNube tipoNube) {
        Nube nube = (Nube) this.nubesMap.get(tipoNube);

        if (nube == null) {
            nube = new Nube(tipoNube, "nube.png", 100, 100);
            this.nubesMap.put(tipoNube, nube);
        }
        return nube;
    }

    public int countNubesMap(){
        return this.nubesMap.size();
    }

}

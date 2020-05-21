package com.gabo.labs.structural.flyweight;

public class Main {
    /*
        FLYWEIGHT
            -Gestiona la creacion de objetos para Ahorrar memoria.
            -Solo crea los objetos que son requeridos
            -Recicla objetos
     */
    public static void main(String[] args) {
        NubeFactory nubeFactory = new NubeFactory();

        for(int i = 0; i< 100; i++){
            Nube nube = nubeFactory.getNube(TipoNube.CHICA);
        }

        for(int i = 0; i< 200; i++){
            Nube nube = nubeFactory.getNube(TipoNube.MEDIANA);
        }

        for(int i = 0; i< 300; i++){
            Nube nube = nubeFactory.getNube(TipoNube.GRANDE);
        }

        System.out.println(nubeFactory.countNubesMap());
    }
}

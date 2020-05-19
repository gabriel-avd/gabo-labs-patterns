package com.gabo.labs.creational.abstractFactory;

public interface AbstractFactory {

    /*
        ABSTRACT FACTORY
            -Un factory permite crear grupos de objetos similares
            -Para que los objetos puedan ser creados requieren heredar de alguna clase en comun
     */

    Computadora crearComputadora();
    Tablet crearTablet();
}

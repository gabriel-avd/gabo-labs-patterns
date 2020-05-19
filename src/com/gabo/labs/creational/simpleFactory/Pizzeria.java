package com.gabo.labs.creational.simpleFactory;

public class Pizzeria {
    /*
        SIMPLE FACTORY.
            -Patron que esconde la generacion de nuevas instancias en metodos.
            -La creacion de ciertas instancias puede ser compleja y mandar llamar distintos servicios
            -Pueden recibir parametros para crear el mismo objeto con diferentes valores
     */

    public Pizza crearPizzaChica(){
        return new Pizza(6);
    }

    public Pizza crearPizzaMediana(){
        return new Pizza(8);
    }

    public Pizza crearPizzaGrande(){
        return new Pizza(10);
    }
}

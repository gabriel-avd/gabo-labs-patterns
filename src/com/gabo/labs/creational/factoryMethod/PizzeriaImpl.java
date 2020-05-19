package com.gabo.labs.creational.factoryMethod;

public class PizzeriaImpl implements Pizzeria {

    /*
        FACTORY METHOD
            -La clase factory decide que instancia regresar
            -En este ejemplo podemos ver que un mismo metodo puede regresar dos instancias distintas
            -Hace uso de Herencia para llevar esto a cabo
     */

    @Override
    public Pizza crearPizza(String especialidad) {
        switch (especialidad){
            case "Hawaiana":
                return new Pizza(8, "Hawaiana");
            case "Pepperoni":
                return new Pizza(8, "Pepperoni");
            case "Pepperoni orilla rellena":
                return new PizzaOrillaRellena(8, "Pepperoni");
            default:
                return null;
        }
    }
}

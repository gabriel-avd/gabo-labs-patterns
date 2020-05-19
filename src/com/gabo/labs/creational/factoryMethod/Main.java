package com.gabo.labs.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new PizzeriaImpl();

        Pizza pizzaPepperoni = pizzeria.crearPizza("Pepperoni");
        Pizza pizzaHawaiana = pizzeria.crearPizza("Hawaiana");
        Pizza pizzaPepperoniOrillaRellena = pizzeria.crearPizza("Pepperoni orilla rellena");

        System.out.println(pizzaPepperoni);
        System.out.println(pizzaHawaiana);
        System.out.println(pizzaPepperoniOrillaRellena);
    }
}

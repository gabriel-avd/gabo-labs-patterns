package com.gabo.labs.creational.simpleFactory;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

        Pizza pizzaChica = pizzeria.crearPizzaChica();
        Pizza pizzaMediana = pizzeria.crearPizzaMediana();

        System.out.println(pizzaChica);
        System.out.println(pizzaMediana);

    }
}

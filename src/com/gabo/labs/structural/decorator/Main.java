package com.gabo.labs.structural.decorator;

public class Main {

    public static void main(String[] args) {

        /*
            DECORATOR
                -Agrega funcionalidad adicional a sus objetos
                -Utiliza composicion para agregar la funcionalidad
                -Las clases necesitan implementar una interfaz en comun
         */
        Pizza pizzaPepperoni = new OrillaRellena(new QuesoExtra(new PizzaPepperoni()));

        System.out.println(pizzaPepperoni.descripcion());
        System.out.println(pizzaPepperoni.precio());
    }
}

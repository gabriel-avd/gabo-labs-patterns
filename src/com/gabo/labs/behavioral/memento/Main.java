package com.gabo.labs.behavioral.memento;

public class Main {

    /*
        MEMENTO
            -Permite crear copias de seguridad y restaurarlas en un momento dado.
            -No tiene una forma especifica de implementarse, puede ser de cualquier manera.
     */
    public static void main(String[] args) {
        Usuario codi = new Usuario("Codi", 16);

        Usuario memento = codi.getMemento();

        codi.setEdad(35);

        codi.restartMemento(memento);

        System.out.println(codi.getName());
        System.out.println(codi.getEdad());
    }
}

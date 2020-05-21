package com.gabo.labs.behavioral.iterator;

public class Main {
    /*
        ITERADOR
            -Permite ocultar los metodos propios de la clase
            -Crea una clase con los metodos para iterar un listado

     */
    public static void main(String[] args) {
        GuiaTelefonica guia = new GuiaTelefonica();

        guia.add("123");
        guia.add("124");
        guia.add("125");
        guia.add("126");
        guia.add("127");

        Iterador iterador = new IteradorGuia(guia);

        while(iterador.contieneSiguiente()){
            System.out.println(iterador.siguiente());
        }
    }
}

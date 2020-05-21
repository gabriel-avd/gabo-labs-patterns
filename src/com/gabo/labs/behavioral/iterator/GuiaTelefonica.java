package com.gabo.labs.behavioral.iterator;

import java.util.ArrayList;

public class GuiaTelefonica {
    private ArrayList<String> numeros;

    public GuiaTelefonica() {
        this.numeros = new ArrayList<>();
    }

    public void add(String numero) {
        this.numeros.add(numero);
    }

    public ArrayList<String> getNumeros(){
        return this.numeros;
    }
}

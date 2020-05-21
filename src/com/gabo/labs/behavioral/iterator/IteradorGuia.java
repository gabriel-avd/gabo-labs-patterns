package com.gabo.labs.behavioral.iterator;

public class IteradorGuia implements Iterador {

    private GuiaTelefonica guia;
    private int posicion;

    public IteradorGuia(GuiaTelefonica guia) {
        this.guia = guia;
    }

    @Override
    public String siguiente() {
        System.out.println("Posicion antes: " + posicion);
        return this.guia.getNumeros().get(this.posicion++);
    }

    @Override
    public boolean contieneSiguiente() {
        System.out.println("Posicion en contiene: " + posicion);
        return this.posicion < this.guia.getNumeros().size()
                && this.guia.getNumeros().get(this.posicion) != null;
    }
}

package com.gabo.labs.structural.proxy;

public class Usuario {
    private int nivelUsuario;

    public Usuario(int nivelUsuario){
        this.setNivelUsuario(nivelUsuario);
    }

    public int getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(int nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }
}

package com.gabo.labs.behavioral.memento;

public class Usuario {
    private String name;
    private int edad;

    public Usuario(String name, int edad){
        this.setName(name);
        this.setEdad(edad);
    }

    public Usuario getMemento(){
        return new Usuario(this.getName(), this.getEdad());
    }

    public void restartMemento(Usuario memento){
        this.setName(memento.getName());
        this.setEdad(memento.getEdad());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

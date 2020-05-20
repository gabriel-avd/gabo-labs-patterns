package com.gabo.labs.structural.proxy;

public class ServicioProxy implements Servicio {
    Servicio servicio;
    Usuario usuario;

    public ServicioProxy(
            Servicio servicio,
            Usuario usuario
    ) {
        this.servicio = servicio;
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        servicio.leer();
    }

    @Override
    public void escribir() {
        if (usuario.getNivelUsuario() == 5)
            servicio.escribir();
        else
            throw new UnsupportedOperationException("Permisos no suficientes");
    }

    @Override
    public void actualizar() {
        if (usuario.getNivelUsuario() == 5)
            servicio.actualizar();
        else
            throw new UnsupportedOperationException("Permisos no suficientes");

    }

    @Override
    public void eliminar() {
        if (usuario.getNivelUsuario() == 5)
            servicio.eliminar();
        else
            throw new UnsupportedOperationException("Permisos no suficientes");

    }
}

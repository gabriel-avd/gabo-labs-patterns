package com.gabo.labs.structural.proxy;

public class Main {
    /*
        PROXY
            -Se utiliza para restringir funcionalidad
            -Un buen ejemplo es en la adicion de permisos a funcionalidades ya creadas
     */
    public static void main(String[] args) {
        Servicio servicio = new ServicioProxy(
                new ServicioImpl(),
                new Usuario(5));

        servicio.leer(); //Todos
        servicio.actualizar();
        servicio.eliminar();
        servicio.escribir();
    }
}

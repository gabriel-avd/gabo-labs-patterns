package com.gabo.labs.structural.flyweight;

public class Nube {
    TipoNube tipoNube;
    String ubicacioImagen;
    int ejeX;
    int ejeY;

    public Nube(
            TipoNube tipoNube,
            String ubicacioImagen,
            int ejeX,
            int ejeY
    ) {
        this.tipoNube = tipoNube;
        this.ubicacioImagen = ubicacioImagen;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }
}

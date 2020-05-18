package com.gabo.labs.solid;

import com.gabo.labs.solid.InterfaceSegregation.FelinoSalvaje;
import com.gabo.labs.solid.InterfaceSegregation.Jaguar;
import com.gabo.labs.solid.dependencyInversion.Computadora;
import com.gabo.labs.solid.dependencyInversion.MouseImpl;
import com.gabo.labs.solid.dependencyInversion.TecladoImpl;

public class SolidMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(10, 5);

        Presentation presentation = new Presentation();

        presentation.area(rectangle);
        presentation.area(triangle);

        /*
            LISKOV SUSTITUTION - Principle
            Every subtype should be only replaced by his base/parent type

            INTERFACE SEGREGATION - Principle
            We divided our Felino into three interfaces to have only the methods important to the abstraction.

         */

        FelinoSalvaje yagua = new Jaguar();
        yagua.rugir();

        /*
            DEPENDENCY INVERSION - Principle
            Computadora class receives Mouse and Teclado interfaces not its implementations. Thats correct.
            Entities depends on abstractions not concretions
         */

        Computadora computadora = new Computadora(new MouseImpl(), new TecladoImpl());
        computadora.encender();

    }
}

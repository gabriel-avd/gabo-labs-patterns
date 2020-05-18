package com.gabo.labs.solid;

public class Presentation {

    /*
        SINGLE RESPONSIBILITY - Princile
        this class is created to leave Rectangle class with only its values, it doesn't have logic to print values,
        that belongs to this class
     */

    /*
        OPEN / CLOSED - Principle
        We create an interface which have area() method (GeometricForm), so we can have n shapes and we don't need to
        add new methods to print the Area in Presentation class, because the print method receives an interfaces and
        use its implementation.
     */

    public void area(GeometricForm geometricForm){
        System.out.println(geometricForm.area());
    }
}

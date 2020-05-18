package com.gabo.labs.solid;

public class Triangle implements GeometricForm{
    private float length;
    private float width;

    public Triangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public Triangle setLength(float length) {
        this.length = length;
        return this;
    }

    public float getWidth() {
        return width;
    }

    public Triangle setWidth(float width) {
        this.width = width;
        return this;
    }

    public float area() {
        return (this.getLength() * this.getWidth()) / 2;
    }

    public String toString() {
        return "Length: " + this.getLength() + " Width: " + this.getWidth();
    }
}

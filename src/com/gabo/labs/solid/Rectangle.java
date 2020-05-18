package com.gabo.labs.solid;

public class Rectangle implements GeometricForm{
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public Rectangle setLength(float length) {
        this.length = length;
        return this;
    }

    public float getWidth() {
        return width;
    }

    public Rectangle setWidth(float width) {
        this.width = width;
        return this;
    }

    public float area() {
        return this.getLength() * this.getWidth();
    }

    public String toString() {
        return "Length: " + this.getLength() + " Width: " + this.getWidth();
    }
}

package ru.dlts;

public abstract class Shape {
    public void draw() {
        System.out.println("The " + this.getClass().getName() + " is drawn");
    }

    @Override
    public String toString() {
        return "Shape{ "+ this.getClass().toString() +"}";
    }
}

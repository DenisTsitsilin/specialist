package ru.dlts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Circle {
    private int r;
    @Autowired
    @Qualifier("coords")
    Coords centerCoords;

    public Coords getCenterCoords() {
        return centerCoords;
    }

    public void setCenterCoords(Coords centerCoords) {
        this.centerCoords = centerCoords;
    }

    public Circle() {
    }

    public Circle(int r, Coords centerCoords) {
        this.r = r;
        this.centerCoords = centerCoords;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", centerCoords=" + centerCoords +
                '}';
    }
}

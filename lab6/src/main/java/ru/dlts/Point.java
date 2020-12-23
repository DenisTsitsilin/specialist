package ru.dlts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myPoint")
public class Point extends Shape {
    @Autowired
    @Qualifier("coords")
    Coords coords;

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public Point() {
    }

    public Point(Coords coords) {
        this.coords = coords;
    }

    @Override
    public String toString() {
        return "Point{" +
                "coords=" + coords +
                '}';
    }
}

package ru.dlts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Circle extends Shape{
    @Value("#{T(java.lang.Math).sqrt(T(java.lang.Math).pow(coords.x,2)+T(java.lang.Math).pow(coords.y,2))}")
    private double r;
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

    public Circle(double r, Coords centerCoords) {
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

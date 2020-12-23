package ru.dlts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Scene {
    @Value("blue")
    String color;
    List<Shape> shapes;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "color='" + color + '\'' +
                ", shapes=" + shapes +
                '}';
    }
}

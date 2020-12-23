package ru.dlts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ShapeConfig {

    @Bean("circle")
    @Scope("prototype")
    public Circle circle (){return new Circle();};

    @Bean("point")
    @Scope("prototype")
    public Point point (){return new Point();}

    @Bean
    @Scope("prototype")
    public Coords coords (){return new Coords();}

    @Bean
    public Scene scene (){
        Scene scene = new Scene();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(point());
        shapes.add(point());
        shapes.add(circle());
        scene.setShapes(shapes);
        return scene;
    }

}

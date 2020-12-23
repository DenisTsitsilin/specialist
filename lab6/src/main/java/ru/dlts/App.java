package ru.dlts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShapeConfig.class);

        Scene scene = context.getBean(Scene.class);
        System.out.println(scene);
        scene.shapes.get(1).draw();
    }
}

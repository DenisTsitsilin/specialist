package ru.dlts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        Circle circle = context.getBean(Circle.class);
        Point point = context.getBean(Point.class);

        System.out.print(circle);
        System.out.println(" coords hashCode: " + circle.centerCoords.hashCode());
        System.out.print(point);
        System.out.println(" coords hashCode: " + point.coords.hashCode());
    }
}

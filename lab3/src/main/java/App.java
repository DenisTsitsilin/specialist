import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShapeConfig.class);

        Circle circle = context.getBean(Circle.class);
        Point point1 = context.getBean(Point.class);
        Point point2 = context.getBean(Point.class);

        circle.draw();
        point1.draw();
        point2.draw();

        System.out.println(circle);
        System.out.println("point1 hashCode = " + point1.hashCode());
        System.out.println("point2 hashCode = " + point2.hashCode());
    }
}

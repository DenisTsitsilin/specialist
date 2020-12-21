import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        interactWithShape(context, "circleBean");
        interactWithShape(context, "pointBean");

        context.close();
    }

    public static Shape interactWithShape(ClassPathXmlApplicationContext context, String name){
        Shape shape = context.getBean(name, Shape.class);
        shape.draw();
        System.out.println(shape);
        return shape;
    }
}

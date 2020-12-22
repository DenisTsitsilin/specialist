import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ShapeConfig {
    @Bean("point")
    @Scope("prototype")
    //@Scope("singleton") //For test singleton scope
    public Point point (){ return new Point(); }

    @Bean("circle")
    public Circle circle (){ return new Circle(5,7,11); }
}

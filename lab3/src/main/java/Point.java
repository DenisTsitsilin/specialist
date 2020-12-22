import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pointBean")
@Scope("prototype")
public class Point  extends Position implements Shape {
    public Point() {
    }

    public Point(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return toStr(super.toString());
    }
}

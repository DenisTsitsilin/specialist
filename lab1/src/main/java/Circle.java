public class Circle extends Position implements Shape {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle() {
    }

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public String toString() {
        return toStr(super.toString() +" r= " + r);
    }
}

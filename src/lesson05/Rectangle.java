package lesson05;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public int square() {
        return a * b;
    }
}

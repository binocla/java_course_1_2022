package lesson05;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("Красный", 10);
        Rectangle rectangle = new Rectangle("Зеленый", 10, 20);
        System.out.println(square.square());
        System.out.println(rectangle.square());
        square.printSquare();
        rectangle.printSquare();
    }
}

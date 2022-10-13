package lesson05;


// Square extends Rectangle extends Shape (extends Object)
public class Square extends Rectangle {
    private int a;

    public Square(String color, int a) {
        super(color, a, a);
        this.a = a;
    }


//    @Override
//    public int square() {
//        return a * a;
//    }
}

package lesson05;

// abstract - абстрактный класс или метод
// abstract class - класс, который не может быть создан (проинициализирован)
// abstract class - класс, который может содержать абстрактные методы
// abstract class - класс, который может содержать обычные методы
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    // abstract - абстрактный метод
    // abstract method - метод, который не имеет реализации
    // abstract method - метод, который должен быть переопределен в классе-наследнике
    public abstract int square();

    public void printSquare() {
        System.out.println("Площадь фигуры: " + square());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

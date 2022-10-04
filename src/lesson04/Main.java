package lesson04;

public class Main {
    // Object (Наследование)
    // Getter, Setter (Инкапсуляция)
    // toString
    // Наследование в Java - extends - перенимает все поля и методы
    // Наследование в Java не множественное
    public static void main(String[] args) {
        Human human = new Human("Sergey", 20);
        Woman woman = new Woman("Vladimir", 35, true);
        human.setAge(10);
        human.sayHello();
        woman.sayHello();
        System.out.println(human);
        woman.whatAreYouDoing();
    }
}

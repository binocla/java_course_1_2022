package lesson04;

public class Human {
    public String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }


    // Getter
    public String getName() {
        return name; // Суть геттера - получить значение
    }

    public int getAge() {
        return age;
    }

    // ----
    // Setters
    public void setName(String name) {
        this.name = name; // Суть сеттера - установить значение
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            System.out.println("У вас неправильный возраст!");
            System.exit(0); // Завершает программу
        }
        this.age = age;
    }
    // ---

    @Override
    public String toString() { // Пример переопределения метода toString класса Object
        return "Имя: " + name + ", Возраст: " + age;
    }
}

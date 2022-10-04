package lesson03;

public class Person {

    public String firstName;
    public String lastName;
    public int age;
//    public static int age;


    public Person(String firstName, String lastName, int age, String text) {
//        super();
        if (age > 100 || age < 0) {
            System.out.println("У вас неправильный возраст!");
            System.exit(0); // Завершает программу
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println(text);
    }

    public Person() {}

    public void sayWhoYouAre() {
        System.out.println("Меня зовут: " + firstName);
    }

//    public static void sayYourAge() {
//        System.out.println("Мой возраст: " + age);
//    }
    public void sayYourAge() {
        System.out.println("Мой возраст: " + age);
    }

    public String toString() {
        return "Имя: " + firstName + ", Фамилия: " + lastName + ", Возраст: " + age;
    }
}

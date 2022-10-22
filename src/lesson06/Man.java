package lesson06;

public class Man extends Human {
    private int age;

    public Man(String name, int age) {
        super(name);
        this.age = age;
    }

    public void iAmMan() {
        System.out.println("M");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String saySmthing() {
        return "Man";
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                '}';
    }
}

package lesson06;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void iAmHuman() {
        System.out.println("H");
    }

    public String saySmthing() {
        return "Human";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return """
                Я человек!
                """ + "Имя: " + name;
    }
}

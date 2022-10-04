package lesson04;

public class Woman extends Human { // class Woman extends Object, Human
    public boolean isWashing;

    public Woman(String name, int age, boolean isWashing) {
        super(name, age);
        this.isWashing = isWashing;
        // super - вызов конструктора родителя
        // super.age - вызов поля родителя
    }

    public void whatAreYouDoing() {
        if (isWashing) {
            System.out.println("I'm washing");
        } else {
            System.out.println("I'm not washing");
        }
    }

    @Override // Аннотация. Переопределение метода
    // При переопределении метода, возвращаемый тип и параметры должны быть такими же как и в родительском классе
    // Переопределять поведение метода можно только если он non-static. Если метод static, то переопределить его нельзя
    public void sayHello() {
        System.out.println("Hi! I'm overriden method");
    }
}

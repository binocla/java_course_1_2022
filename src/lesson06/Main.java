package lesson06;

public class Main {
    // Интерфейс - высший уровень абстракции в Java
    // Интерфейс - это набор методов, которые должны быть реализованы в классе, который его реализует
    public static void main(String[] args) {
//        CalcImpl calc = new CalcImpl();
//        System.out.println(calc.sum(1, 2));
//        System.out.println(calc.sub(1, 2));
//        System.out.println(Calc.mul(1, 2));
//        sum1(1, 2);
//        sum1(1, 2, 3);
//        sum1(1, "Hi!");
        Man man = new Man("Binocla", 20);
        Woman woman = new Woman("Lena", "blue");
        Human h = ((Human) man); // Приведение типов, восходящее преобразование
        Human human1 = new Man("Binocla", 20); // Восходящее преобразование
        Man m = ((Man) (human1)); // Нисходящее преобразование
        System.out.println(m.getAge());
        System.out.println(m);

//        int x = 10;
//        Integer q = (Integer) x; // Автоупаковка
////        int b = (int) q; // Автораспаковка
//        String num = q.toString();
//        System.out.println(num);


    }

    private static void sum1(int a, int b) {
        System.out.println(a + b);
    }

    private static void sum1(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    private static void sum1(int a, String b) {
        System.out.println(b + " " + a);
    }
}

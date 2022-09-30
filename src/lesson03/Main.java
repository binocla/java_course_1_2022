package lesson03;

public class Main {
    public static void main(String[] args) {
//        int result = sum(1, 3);
//        System.out.println(result);
//        helloWorld();
//        Person p = new Person();
//        p.firstName = "Sergey";
//        p.lastName = "Binocla";
//        p.age = 20;  // p.age = 20; так делать можно, но не рекомендуется
//        p.sayWhoYouAre();
//        p.sayYourAge();
//        Person p1 = new Person();
//        p.firstName = "qweqwe";
//        p.lastName = "asdasdsad";
//        p1.age = 123;
//
//        System.out.println(p.age);
//        System.out.println(p1.age);
//        p1.sayYourAge();

        Person p2 = new Person("Sergey", "Binocla", 20, "Hello World");
        System.out.println("1Имя: " + p2.firstName + ", Фамилия: " + p2.lastName + ", Возраст: " + p2.age);
        System.out.println("2" + p2); // sout(.toString())
        p2.sayYourAge();
        p2.sayWhoYouAre();
    }
    // ООП - Объектно-Ориентированное Программирование
    // Класс - это шаблон, по которому создаются объекты
    // Методы - это функции, которые принадлежат классу; методы это то, что умеет делать класс
    // Методы, функции и процедуры. Методы = функция, но присуще ООП + находятся внутри класса
    // Функции - это набор инструкций, которые выполняют какую-то задачу
    // Процедуры - ничего не возвращают, но выполняют какую-то задачу

    // Поля (атрибуты) - это переменные, которые принадлежат классу
    String name = "Binocla";
    int age = 20;
    int height; // Поле класса, которое не инициализировано, будет иметь значение по умолчанию

    // Модификаторы доступа
    // public - доступен везде | public class Q
    // protected - доступен внутри унаследованных классов и внутри пакета | protected class Q
    // default - доступен внутри пакета | class Q
    // private - доступен только внутри класса | private class Q

    // Декларация методов
    // модификатор доступа (public, protected, default, private) + модификатор статичности (static, -)
    // + тип возвращаемого значения (void, int, String, ...) + имя метода (с маленькой буквы... lowerCamelCase)
    // + параметры (int a, String b, -) + список исключений (throws Exception, -) + тело метода {...}

    // Сигнатура метода - это имя метода + параметры


    public static void helloWorld(){
        System.out.println("Hello World!");
    }
    // Сигнатура метода выше: helloWorld()

    public static int sum(int a, int b) {
        return a + b;
        // return -> возращает значение из метода
        // после return ничего не выполняется
    }
    // Сигнатура метода выше: sum(int, int)


    // static и non-static
    // static - ключевое слово, которое позволяет вызывать метод без создания объекта класса
    // Blabla.method(); или Blabla.age;
    // Применим к полям, методам, классам, блокам

    // non-static - ключевое слово, которое позволяет вызывать метод только через объект класса
    // Blabla q = new Blabla();
    // q.method(); или q.age;

    // Из static пространства можно вызывать только static методы и static поля
    // Из non-static пространства можно вызывать static и non-static методы и static и non-static поля

    // Конструкторы
    // Конструкторы - это методы, которые вызываются при создании объекта класса
    // Они есть всегда, даже если их не объявляли
    // Конструкторы не имеют типа возвращаемого значения
}



package lesson01.variables;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Примитивные типы данных
        // Хранятся в стэке (stack) [RAM] -> доступ к ней быстрый, но место уже зарезервировано и не подлежит изменению
        // Пишутся с маленькой буквы
        // Целочисленные
        // Signed values
        // byte - 1 байт (8 бит) -128 по 127 (от -2^7 до 2^7 - 1) | int8 = 0
        // short - 2 байта (16 бит) -32768 по 32767 (от -2^15 до 2^15 - 1) | int16 = 0
        // int - 4 байта (32 бит) -2147483648 по 2147483647 (от -2^31 до 2^31 - 1) || int32 [default] = 0
        // long - 8 байт (64 бит) -9223372036854775808 по 9223372036854775807 (от -2^63 до 2^63 - 1) | int64 = 0

        // Дробные
        // float - 4 байта (32 бит) 1.4e-45 по 3.4e+38 (6-7 знаков после запятой) = 0.0
        // double - 8 байт (64 бит) 4.9e-324 по 1.8e+308 (12-13 знаков после запятой) [default] = 0.0

        // Символьные
        // char - 2 байта (16 бит) 0 по 65535 (от 0 до 2^16 - 1) | uint16 = символ под номером 0
        // Unicode (UTF-16), ASCII, UTF-8...

        // Логический
        // boolean - 1 байт (8 бит) true или false = false

        // Ссылочные типы данных
        // Хранятся в куче (heap) [HDD] -> доступ к ней медленный
        // Пишутся с большой буквы
        // String, Scanner, Main, ...
        // Часто фигурирует конструкция Scanner blablabla = new Scanner(...);
        // По умолчанию значение у всех ссылочных типов данных null

        // Примеры
//        byte a = 127; // 1 байт
//        byte b = (byte) -129;
//        System.out.println(a);
//        System.out.println(b);
//        int q = 1000;
//        q = 200;
//        System.out.println(q);

        // Математические операции
        // +, -, *, /, %, ++, --, += [a = a + 2 -> a += 2], -=, *=, /=, %=, ...

        // Операторы сравнения
        // >, <, >=, <=, ==, !=, &&, ||, !, &, |, ^, ~, <<, >>, >>>
        // && - логическое И (Lazy)
        // || - логическое ИЛИ (Lazy)
        Scanner in = new Scanner(System.in); // System.in -> ввод с клавиатуры
//        in.next() // Считывает слово (String) до пробела или отступа
        // in.nextLine() // Считывает строку (String) до переноса строки
        // in.nextInt() -> int
        // in.nextDouble() -> double
        // in.nextBoolean() -> boolean
        // ...
        int a = in.nextInt();
        int b = in.nextInt();
//        System.out.println(a + b); // вывод с отступом на следующую строку
//        System.out.println(a + b); // вывод с отступом на следующую строку
//        System.out.print(a + b); // вывод без отступа на следующую строку
//        System.out.print(a + b); // вывод без отступа на следующую строку
//        if (a > b && a == b) {
//            System.out.println("Yes");
//        } else if (a == b) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("No");
//    }
//        if (a > b && a == b) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        a > b && a == b ? System.out.println("yes") : System.out.println("No"); // тернарный оператор условие ? если true : если false
//        while (a > b) {
//            System.out.println(a);
//            a--; // a = a - 1
//        }

//        do {
//            System.out.println(a);
//            a--; // a = a - 1
//        } while (a > b);

//        for (int i = 0; i < b; i++) { // for (инициализация; условие; шаг) { тело цикла }
//            System.out.println(i);
//        }
//
//        int i = 0;
//        while (i < b) { // for (инициализация; условие; шаг) { тело цикла }
//            System.out.println(i);
//            i++;
//        }


    }
}
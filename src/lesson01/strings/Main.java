package lesson01.strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println(in.next());
//        System.out.println(in.nextLine());
//        String s1 = new String("Hello");
        String s2 = "Hello";
        System.out.println(s2.charAt(0));
        System.out.println(s2.length());
        System.out.println(s2.substring(1, 2)); // [1, 2)
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.equals("HELLO"));
        System.out.println(s2.equals("Hello"));
        System.out.println(s2.replace('l', 'X'));
        System.out.println(s2.replace("lo", "QQ"));
        System.out.println(s2.contains("el"));
        System.out.println((int) 'a');
        System.out.println((int) 'A');
        char x = 'A' + 'a'; // 65 + 97 = 162
        System.out.println(x);
        // Строки выделяются "
        // Символы в Java выделяются '
//        String s3 = "Hello"; // immutable объект
//        s2.charAt(0); // Символ по индексу в строке
//        s2.length(); // Длина строки
//        s2.substring(0, 3); // Подстрока
//        s2.toUpperCase(); // Приведение к верхнему регистру
//        s2.toLowerCase(); // Приведение к нижнему регистру
//        s2.equals("Hello"); // Сравнение строк
//        s2.replace('l', 'Q'); // Замена символов
//        s2.replace("ll", "QQ"); // Замена подстрок
//        s2.contains("ll"); // Проверка на вхождение подстроки

    }
}

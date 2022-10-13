package lesson05.regex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static Pattern pattern = Pattern.compile("[a-z]+");
    public static void main(String[] args) {
        // RegEx -> Regular Expression
        // Литералы
        // \n -> перевод строки
        // \t -> табуляция
        // \s -> пробел
        // \b -> граница слова
        // ...
        // RegEx
        // \\s -> пробел
        // \\s+ -> один или более пробелов
        // \\s* -> ноль или более пробелов
        // \\s? -> ноль или один пробел
        // \\S -> не пробел
        // \\S+ -> один или более не пробелов
        // \\S* -> ноль или более не пробелов
        // \\S? -> ноль или один не пробел
        // \\w -> буква или цифра
        // \\W -> не буква и не цифра
        // \\d -> цифра
        // \\D -> не цифра
        // \\d{} -> цифра в количестве {}
        // ^ -> начало строки
        // $ -> конец строки
        // | -> или
        // . -> любой символ
        // [0-9] или [A-Za-z] или [А-Яа-я] -> диапазон
        String s = "Hel13 s1235v";
//        String[] ar = s.replaceAll("\\s+", "").split("[0-9]+|\\s+");
        String[] ar = s.split("\\d{4}");
//        Matcher matcher = pattern.matcher(s);
//        System.out.println(matcher.find()); // true, если pattern найден
//        System.out.println(matcher.start()); // индекс начала найденного pattern
//        System.out.println(matcher.end()); // индекс конца найденного pattern
        System.out.println(Arrays.toString(ar));
//        System.out.println(s.replaceAll("\\s?", ""));

//        String date = "22.03.2002";
        Scanner in = new Scanner(System.in);
        String date = in.next();
        // Если хотим просто '.' то нужно писать '\\.'
        // [] - диапазон [a-z]
        // () - группа (\\d{2}) - группа из двух цифр
        // {} - количество символов
        // IVXCLM - римские цифры
        // [IVXCLM]+ - одна или более римских цифр
        Pattern patternForDate = Pattern.compile("(\\d{2}\\.\\d{2}\\.\\d{4})|(\\d{2}\\.\\d{2}\\.\\d{2})");
        // RegEx for 1600-2999 Years YYYY-MM-DD: ^((?:(?:1[6-9]|2[0-9])\d{2})(-)(?:(?:(?:0[13578]|1[02])(-)31)|((0[1,3-9]|1[0-2])(-)(29|30))))$|^(?:(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00)))(-)02(-)29)$|^(?:(?:1[6-9]|2[0-9])\d{2})(-)(?:(?:0[1-9])|(?:1[0-2]))(-)(?:0[1-9]|1\d|2[0-8])$
        System.out.println(patternForDate.matcher(date).matches());

    }
}

package lesson01.strings;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        int cnt = 0;
        // a, i, e, u, o, y, A, I, E, U, O, Y
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == 97 ||
                    c == 'i' ||
                    c == 'e' ||
                    c == 'u' ||
                    c == 'o' ||
                    c == 'y' ||
                    c == 65 ||
                    c == 'I' ||
                    c == 'E' ||
                    c == 'U' ||
                    c == 'O' ||
                    c == 'Y') {
                cnt++;
            }
        }
        // Строки можно складывать (конкатенация)
//        String s = "Hello" + "World"; // "HelloWorld"
        System.out.println("Гласных в строке: " + cnt);

    }
}

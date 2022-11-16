package lesson07;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TestHex {
    public static void main(String[] args) {
        String s = "Hello";
        byte[] arr = s.getBytes();

        System.out.println(Arrays.toString(arr));

        String res = Hex.encode(arr);

        System.out.println(res);

        String out = new String(Hex.decode(res), StandardCharsets.UTF_8);

        System.out.println(out);
    }
}


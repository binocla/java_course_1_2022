package lesson07;

public class Hex {

    public static String encode(byte[] inp) {
        int n = inp.length;
        char[] out = new char[n * 2];

        for (int i = 0; i < n; ++i) {
            int low = inp[i] & 0xF;
            int hi = (inp[i] & 0xF0) >> 4;

            out[2 * i] = int2char(hi);
            out[2 * i + 1] = int2char(low);
        }

        return new String(out);
    }

    public static byte[] decode(String hex) {
        /* Проверяем используемый алфавит (0-9 a-f A-F)
            с помощью регулярного выражения,
        *  количество символов - четное
            Если проверка не пройдена возвращаем null
        * */
        if (!hex.matches("[0-9a-fA-F]+") || hex.length() % 2 != 0) {
            return null;
        } else {
            int n = hex.length() / 2;
            byte[] out = new byte[n];

            for (int i = 0; i < n; ++i) {
                int hi = char2int(hex.charAt(2 * i));
                int low = char2int(hex.charAt(2 * i + 1));

                out[i] = (byte) ((hi << 4) | low);
            }

            return out;
        }
    }

    private static int char2int(char charAt) {
        if (charAt >= '0' && charAt <= '9') {
            return charAt - '0';
        } else if (charAt >= 'a' && charAt <= 'f') {
            return charAt - 'a' + 10;
        } else if (charAt >= 'A' && charAt <= 'F') {
            return charAt - 'A' + 10;
        } else {
            return -1;
        }
    }

    private static char int2char(int a) {
        switch (a) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                return '-';
        }
    }
}


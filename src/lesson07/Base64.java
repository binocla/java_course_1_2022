package lesson07;

public class Base64 {
    private static final char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public static void main(String[] args) {
        String s = "A";

        System.out.println(new String(java.util.Base64.getEncoder().encode(s.getBytes())));

        System.out.println(new String(encodeBase64(s.getBytes())));
    }

    private static byte[] encodeBase64(byte[] data) {
        int length = data.length;
        int length2 = (length / 3) * 3;
        int length3 = length % 3;
        int length4 = length3 > 0 ? (length2 / 3 + 1) * 4 : length2 / 3 * 4;
        byte[] result = new byte[length4];
        int i = 0;
        int j = 0;
        while (i < length2) {
            int b0 = data[i++] & 0xFF;
            int b1 = data[i++] & 0xFF;
            int b2 = data[i++] & 0xFF;
            result[j++] = (byte) ALPHABET[b0 >> 2];
            result[j++] = (byte) ALPHABET[(b0 << 4 | b1 >> 4) & 0x3F];
            result[j++] = (byte) ALPHABET[(b1 << 2 | b2 >> 6) & 0x3F];
            result[j++] = (byte) ALPHABET[b2 & 0x3F];
        }
        if (length3 == 1) {
            int b0 = data[i] & 0xFF;
            result[j++] = (byte) ALPHABET[b0 >> 2];
            result[j++] = (byte) ALPHABET[(b0 << 4) & 0x3F];
            result[j++] = (byte) '=';
            result[j] = (byte) '=';
        } else if (length3 == 2) {
            int b0 = data[i++] & 0xFF;
            int b1 = data[i] & 0xFF;
            result[j++] = (byte) ALPHABET[b0 >> 2];
            result[j++] = (byte) ALPHABET[(b0 << 4 | b1 >> 4) & 0x3F];
            result[j++] = (byte) ALPHABET[(b1 << 2) & 0x3F];
            result[j] = (byte) '=';
        }
        return result;
    }


}

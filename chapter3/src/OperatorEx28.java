public class OperatorEx28 {
    public static void main(String[] args) {
        int x = 0xAB, y = 0XF;

        System.out.printf("x = %#X \t\t\t\t\t%s\n", x, toBinaryString(x));
        System.out.printf("y = %#X \t\t\t\t\t%s\n", y, toBinaryString(y));
        System.out.printf("%#X | %#X = %#X \t\t\t%s\n", x, y, x | y, toBinaryString(x | y));
        System.out.printf("%#X & %#X = %#X \t\t\t%s\n", x, y, x & y, toBinaryString(x & y));
        System.out.printf("%#X ^ %#X = %#X \t\t\t%s\n", x, y, x ^ y, toBinaryString(x ^ y));
        System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s\n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));
    }

    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String temp = zero + Integer.toBinaryString(x);
        return temp.substring(temp.length() - 32);
    }
    /*
    result
    x = 0XAB 					00000000000000000000000010101011
    y = 0XF 					00000000000000000000000000001111
    0XAB | 0XF = 0XAF 			00000000000000000000000010101111
    0XAB & 0XF = 0XB 			00000000000000000000000000001011
    0XAB ^ 0XF = 0XA4 			00000000000000000000000010100100
    0XAB ^ 0XF ^ 0XF = 0XAB 	00000000000000000000000010101011
     */
}

public class OperatorEx05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        System.out.printf("%d / %f = %f\n", a, (float)b, a/(float)b);
        System.out.printf("%d + %d = %d\n", a, b, a%b);
    }
    /*
    result
    10 + 4 = 14
    10 - 4 = 6
    10 * 4 = 40
    10 / 4 = 2
    10 / 4.000000 = 2.500000
    10 + 4 = 2
     */
}

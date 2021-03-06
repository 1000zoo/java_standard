public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b\n", "abc"=="abc");
        System.out.printf(" str1==\"abc\" ? %b\n", str1=="abc");
        System.out.printf(" str2==\"abc\" ? %b\n", str2=="abc");
        System.out.printf(" str1.equals(\"abc\") ? %b\n", str1.equals("abc"));
        System.out.printf(" str2.equals(\"abc\") ? %b\n", str2.equals("ABC"));
        System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b\n", str2.equalsIgnoreCase("ABC"));
    }
    /*
    result
    "abc"=="abc" ? true
     str1=="abc" ? true
     str2=="abc" ? false
     str1.equals("abc") ? true
     str2.equals("abc") ? false
     str2.equalsIgnoreCase("ABC") ? true
     */
}

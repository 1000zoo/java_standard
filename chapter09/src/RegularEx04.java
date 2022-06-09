import java.util.regex.*;

public class RegularEx04 {
    public static void main(String[] args) {
        String source = "A broken hand works, but not a broken heart.";
        String pattern = "broken";
        StringBuffer sb = new StringBuffer();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);
        System.out.println(source);

        int i = 0;
        while (m.find()) {
            System.out.println(++i + ": " + m.start() + "-" + m.end());
            m.appendReplacement(sb, "drunken");
        }
        m.appendTail(sb);
        System.out.println(i);
        System.out.println(sb.toString());
    }
}

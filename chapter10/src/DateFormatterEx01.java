import java.time.*;
import java.time.format.*;

public class DateFormatterEx01 {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();

        String[] patternArr = {
                "yyyy-MM-dd HH:mm:ss",
                "''yy년 MMM dd일 E",
                "yyyy-MM-dd HH:mm:ss.SSS Z VV",
                "yyyy-MM-dd hh:mm:ss a",
                "올해 D번쨰 날",
                "이달 d번쨰 날",
                "올해 w번째 주",
                "이달 W번째 주",
                "이달 W번째 E요일"
        };

        for (String p : patternArr) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
            System.out.println(dateTime.format(formatter));
        }
    }
}

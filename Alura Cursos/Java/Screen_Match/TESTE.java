import java.util.Date;
import java.util.Calendar;

public class TESTE {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}

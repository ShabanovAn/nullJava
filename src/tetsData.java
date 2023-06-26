import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class tetsData {
    public static void main(String[] args) {

        System.out.println(findDay(8,14,2017));
    }

    public static String findDay(int month, int day, int year) {
        List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
            int y = Integer.parseInt(String.valueOf(year));
            int m = Integer.parseInt(String.valueOf(month));
            int d = Integer.parseInt(String.valueOf(day));

            Calendar c = Calendar.getInstance();
            c.set(y, m-1, d);

            int p = c.get(Calendar.DAY_OF_WEEK);
            String s = days.get(p-1);
            return s;
        }

}

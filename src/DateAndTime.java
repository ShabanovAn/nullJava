
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.Year;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {
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


public class DateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

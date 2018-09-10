package tdd.util;

//import org.joda.time.LocalDate;
//import org.joda.time.Period;
//import org.joda.time.format.DateTimeFormat;
//import org.joda.time.format.DateTimeFormatter;
//
//import java.util.ArrayList;
//import java.util.List;
//
/**
 * Created by Yohan on 2/11/14.
 */
public class DateUtils {
//    public static boolean before(String a, String b) {
//        try {
//            LocalDate first = new LocalDate(a);
//            LocalDate second = new LocalDate(b);
//            return first.compareTo(second) < 0;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static String nextDay(String date) {
//        LocalDate d = new LocalDate(date);
//        d = d.plus(Period.days(1));
//        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");
//        return fmt.print(d);
//    }
//
//    public static int maxDate(int month) {
//        LocalDate now = new LocalDate();
//        LocalDate date = new LocalDate(now.getYear(), month, 1);
//        return date.dayOfMonth().getMaximumValue();
//    }
//
//    public static List<String> datesInMonth(int month) {
//        List<String> dates = new ArrayList<String>();
//        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");
//        int year = new LocalDate().getYear();
//        LocalDate first = new LocalDate(year, month, 1);
//        for (int i = 1; i <= first.dayOfMonth().getMaximumValue(); i++) {
//            dates.add(fmt.print(new LocalDate(year, month, i)));
//        }
//        return dates;
//    }
//
}

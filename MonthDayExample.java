package JavaDateTime;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class MonthDayExample {

	public static void main(String[] args)
	{
			MonthDay month = MonthDay.now(); //current day and month fetch
			LocalDate date = month.atYear(2019);//assign to  2019 year with current day and month
			System.out.println(date);
			boolean a = month.isValidYear(2018);
			System.out.println(a);
			long b = month.get(ChronoField.MONTH_OF_YEAR);//returns which number is current month in year
			System.out.println(b);
			ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);//returns no of months in year
			System.out.println(r1);
			ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);//returns no of days in current month
			System.out.println(r2);
		}
}
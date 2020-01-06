package JavaDateTime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class JavaOffsetExample {

	public static void main(String[] args)
	{
		OffsetTime offset = OffsetTime.now();
		int  h = offset.get(ChronoField.HOUR_OF_DAY);//returns the total hour
		System.out.println(h);
		int  n = offset.get(ChronoField.MINUTE_OF_DAY);//returns total minutes in this day
		System.out.println(n);
		int  s = offset.get(ChronoField.SECOND_OF_DAY);//returns total seconds in this day
		
		//prints currentbtime in terms of hours,minutes and seconds
		System.out.println(s);
		int h1 = offset.getHour();
		System.out.println(h1+ "Hour");
		int n1 = offset.getMinute();
		System.out.println(n1+ "Minute");
		int s1 = offset.getSecond();
		System.out.println(s1+ "Second");
	}
}
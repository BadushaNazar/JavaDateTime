package JavaDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeExample3 {

	public static void main(String[] args) 
	{
		
		//ISO Date
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(localDate.format(dateFormatter));
		
		//yyyy/mm/dd pattern
		DateTimeFormatter dateFormatter1 = DateTimeFormatter
				.ofPattern("yyyy/MM/dd");
		System.out.println(localDate.format(dateFormatter1));
		
		//MMM,dd, yyyy pattern
		DateTimeFormatter dateFormatter2 = DateTimeFormatter
				.ofPattern("MMM dd, yyyy");
		System.out.println(localDate.format(dateFormatter2));
		
		
		//dd-MM-YYYY pattern
		DateTimeFormatter dateFormatter3 = DateTimeFormatter
				.ofPattern("dd-MM-yyyy");
		System.out.println(localDate.format(dateFormatter3));
	}

}

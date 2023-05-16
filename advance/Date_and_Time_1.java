package adv_java_classwork;

import java.time.LocalDate;
import java.time.*;

public class Date_and_Time_1 {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println("Today date is - "+date);
		LocalDateTime time2 = LocalDateTime.now();  
		System.out.println("Time right now is -"+time2);
	}
}

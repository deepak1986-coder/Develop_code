package java8.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateAndTime_dev {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		int day = ldt.getDayOfMonth();
		int mm = ldt.getMonthValue();
		int yy = ldt.getYear();
		System.out.printf("%d-%d-%d", day, mm, yy);
		int hr = ldt.getHour();
		int min = ldt.getMinute();
		int sec = ldt.getSecond();
		int naino = ldt.getNano();
		System.out.printf("\n%d-%d-%d-%d", hr, min, sec, naino);
		LocalDateTime ldt1 = LocalDateTime.of(2021, Month.JANUARY, 25, 12, 45);
		System.out.println(ldt1);
		System.out.println("After 3 month " + ldt1.plusMonths(3));
		System.out.println("----my age is-----");
		LocalDate birthday = LocalDate.of(1986, 12, 8);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Age is %d Year %d Month %d days", p.getYears(), p.getMonths(), p.getDays());
		System.out.println("-----Here is zone id---");
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		System.out.println("---America Time Zone---");
		ZoneId usZone = ZoneId.of("America/Los_Angeles");//America/Los_Angeles
		ZonedDateTime zdt = ZonedDateTime.now(usZone);
		System.out.println(zdt);

	}
}

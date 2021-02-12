package java8.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_dev {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalTime t = LocalTime.now();
		System.out.println(t);
		int mm = d.getDayOfMonth();
		int day = d.getMonthValue();
		int year = d.getYear();
		System.out.printf("%d-%d-%d", mm, day, year);
		System.out.println("--------");
		int hr = t.getHour();
		int min = t.getMinute();
		int sec = t.getSecond();
		int naino = t.getNano();
		System.out.printf("%d-%d-%d-%d", hr, min, sec, naino);
		System.out.println("--------------dddd");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}
}

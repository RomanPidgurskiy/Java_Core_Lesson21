package ua.lviv.lgs.max;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;



public class Main_DateTaim {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("DateTime:  " +date);
		
		
		Instant instant = date.toInstant();
		
		ZonedDateTime Zone_Date_Time = instant.atZone(ZoneId.systemDefault());
		LocalDate Local_Date = Zone_Date_Time.toLocalDate();
		System.out.println("LocalDate:  " + Local_Date);
		LocalTime Local_Time  = Zone_Date_Time.toLocalTime();
		System.out.println("LocalTime:  " + Local_Time);
		LocalDateTime Local_Date_Time = Zone_Date_Time.toLocalDateTime();
		System.out.println("LocalDateTime:  " +Local_Date_Time);
		
	}

}

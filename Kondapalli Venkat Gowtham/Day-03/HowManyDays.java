package j4g03.day03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HowManyDays {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("u");
		int dt = Integer.parseInt(dateFormat.format(today));
		System.out.println(7 - dt +" Dyas ledt for Sunday");
	}
}

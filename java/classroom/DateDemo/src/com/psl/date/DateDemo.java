package com.psl.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.UK);

		String strd = sdf.format(d);
		System.out.println(strd);

		sdf.setLenient(false);

		Date d1 = null;
		try {
			d1 = sdf.parse("12/07/2007");
			System.out.println(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Calendar c1 =Calendar.getInstance();
		Calendar c = new GregorianCalendar();
		c.setTime(d1);

		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));

		c.set(Calendar.DAY_OF_MONTH, 22);

		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));

		c.add(Calendar.DAY_OF_MONTH, 10);

		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));

		c.add(Calendar.DAY_OF_MONTH, -7);

		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));

	
	java.util.Date d2=c.getTime();
	System.out.println(d2);


	java.sql.Date sqld = new java.sql.Date(d2.getTime());
	System.out.println(sqld);
	
	}

}

package chapter7;

import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		System.out.println(df.format(now));
		df=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,Locale.KOREA);
		System.out.println(df.format(now));
		System.out.println();
		
		Date when =new Date(100_000_000_000L);
		System.out.println(when.before(now));
		System.out.println(when.equals(now));
		System.out.println(when.compareTo(now));
	}

}

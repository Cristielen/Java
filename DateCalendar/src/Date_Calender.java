import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Date_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2008-06-25T15:42:07Z"));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4 );
		
		System.out.println(sdf.format(d));
		
		System.out.println("------------------------------------");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date e = Date.from(Instant.parse("2008-06-25T15:42:07Z"));
		
		Calendar cale = Calendar.getInstance();
		cale.setTime(e);
		int minutes = cale.get(Calendar.MINUTE);
		
		System.out.println("Minutes: " + minutes);
		
System.out.println("------------------------------------");
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date f = Date.from(Instant.parse("2008-06-25T15:42:07Z"));
		
		Calendar calen = Calendar.getInstance();
		calen.setTime(e);
		int month = 1 + calen.get(Calendar.MONTH);
		
		System.out.println("Mês: " + month);
	}

}

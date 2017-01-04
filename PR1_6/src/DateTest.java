
public class DateTest {

	public static void main(String[] args) {
		Date d = new Date(11, 13, 2077);
		d.DisplayDate();
		d.setDay(d.getDay() + 1);
		d.setMonth(d.getMonth() + 1);
		d.setYear(d.getYear() + 1);
		System.out.println("\nOne year, one month, one day later:");
		d.DisplayDate();

	}

}


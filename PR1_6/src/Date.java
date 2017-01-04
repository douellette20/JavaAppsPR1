
public class Date{
	int month, day, year;
	
	Date(int m, int d, int y)
	{
		month = m;
		day = d;
		year = y;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setMonth(int m)
	{
		month = m;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void DisplayDate()
	{
		System.out.printf("%d/%d/%d", month, day, year);
	}
	
}
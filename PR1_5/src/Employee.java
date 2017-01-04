
public class Employee{
	String firstName;
	String lastName;
	double monthlySalary;
	
	Employee(String fN, String lN, double salary)
	{
		firstName = fN;
		lastName = lN;
		monthlySalary = salary;
	}
	
	public void SetFirstName(String name)
	{
		firstName = name;
	}
	
	public String GetFirstName()
	{
		return firstName;
	}
	
	public void SetLastName(String name)
	{
		lastName = name;
	}
	
	public String GetLastName()
	{
		return lastName;
	}
	
	public void setSalary(double salary)
	{
		if (salary > 0)
			monthlySalary = salary;
	}
	
	public double getSalary()
	{
		return monthlySalary;
	}
}

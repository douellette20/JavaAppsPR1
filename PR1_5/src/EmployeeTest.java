
public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] employees = {new Employee("Bob", "Jones", 700.61), new Employee("Deb", "Stone", 472.33)};
		for (Employee e : employees)
		{
			System.out.printf("%s makes $%f a year\n", e.GetFirstName(), e.getSalary() * 12);
			e.setSalary(e.getSalary() * 1.1);
		}
		for (Employee e : employees)
		{
			System.out.printf("%s now makes $%f a year\n", e.GetFirstName(), e.getSalary() * 12);
		}
	}

}
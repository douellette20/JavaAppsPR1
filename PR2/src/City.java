import java.util.ArrayList;

/**
 * Class to model a City, with Buildings and People
 * @author douellette20
 * @see Building
 * @see Person
 * @see CityHall
 * @see School
 * @see Teacher
 * @see Kid
 * @see Police
 * @version 1.00, Jan 10 2017
 */
public class City {
	
	public static void main(String[] args) {
		for (int i = 0; i <5; i++)
			people.add(new Police("p"+ i, 37));
		for (int i = 0; i <2; i++)
			people.add(new Teacher("t"+i, 42));
		for (int i = 0; i <4; i++)
			people.add(new Kid("k"+i, 7, "Crunch"));
		buildings.add(new CityHall("CHall", "100 W 52nd St.",
				new Police[]{(Police) people.get(1), (Police)people.get(3), 
						(Police) people.get(4)}));
		buildings.add(new School("Wellington elemental school", "296 E 12th Ave.",
				new Person[]{people.get(6), people.get(7), people.get(9), people.get(10)}));
		System.out.printf("Buildings: ");
		listBuildings();
		System.out.printf("People: ");
		listPeople();
		payEmployees();
		System.out.println("Paid employees");
		((CityHall)buildings.get(0)).outputOccupants();
		((School)buildings.get(1)).outputOccupants();
	}
	
	private static ArrayList<Building> buildings = new ArrayList<Building>();
	private static ArrayList<Person> people = new ArrayList<Person>();
	
	public static void payEmployees(){
		for(Person p : people){
			if(p instanceof Employee)
				((Employee) p).givePay();
		}
	}
	
	public static void listBuildings(){
		for(Building b : buildings)
			System.out.printf("%s ", b.getName());
		System.out.println();
	}
	
	public static void listPeople(){
		for(Person p : people)
			System.out.printf("%s ", p.getName());
		System.out.println();
	}

}

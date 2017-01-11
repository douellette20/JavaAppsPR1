import java.util.ArrayList;

/**
 * Class to model a school
 * @author douellette20
 * @see Building
 * @see Person
 * @see Teacher
 * @see Kid
 * @version 1.00, Jan 10 2017
 */
public class School extends Building{
	private ArrayList<Person> currOccupants = new ArrayList<Person>();
	
	/**
	 * Constructor for School
	 * @param name name of the School
	 * @param address address of the School
	 * @param people array of people currently inside the School
	 */
	public School(String name, String address, Person[] people){
		this.name = name;
		this.address = address;
		for(Person p: people){
			if (p instanceof Teacher || p instanceof Kid)
				currOccupants.add(p);
		}
	}
	
	/**
	 * outputs the names of all current occupants of the School
	 */
	public void outputOccupants(){
		System.out.printf("Teachers currently in school: ");
		for (Person p : currOccupants){
			if (p instanceof Teacher)
				System.out.printf("%s ", p.getName());
		}
		System.out.println();
		System.out.printf("Kids currently in school: ");
		for (Person p : currOccupants){
			if (p instanceof Kid)
				System.out.printf("%s ", p.getName());
		}
	}
}

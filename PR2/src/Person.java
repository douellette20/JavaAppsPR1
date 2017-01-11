/**
 * Class to model a person
 * @author douellette20
 * @version 1.00, Jan 10 2017
 */
public class Person {
	protected static int lastPhoneNumber = 1000000;
	protected String name;
	protected int age;
	protected int phoneNumber;
	
	/**
	 * default constructor for Person
	 */
	public Person(){
		name = "Charles";
		age = 42;
		phoneNumber = lastPhoneNumber;
		lastPhoneNumber++;
	}
	
	/**
	 * Constructor for Person
	 * @param name the person's name
	 * @param age the person's age
	 */
	public Person(String name, int age){
		this.name=name;
		this.age=age;
		phoneNumber = lastPhoneNumber;
		lastPhoneNumber++;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

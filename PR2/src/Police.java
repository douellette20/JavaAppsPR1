/**
 * Class to model a Police
 * @author douellette20
 * @see Person
 * @see Employee
 * @version 1.00, Jan 10 2017
 */
public class Police extends Person implements Employee{
	public enum Role{Patrol, Sargent, Captain, Chief};
	private Role role;
	private int EID;
	private static int lastEID = 100;
	
	/**
	 * default constructor for Police
	 */
	public Police(){
		name = "Joe";
		age = 34;
		EID = lastEID;
		lastEID++;
		phoneNumber = lastPhoneNumber;
		lastPhoneNumber++;
	}
	
	/**
	 * Constructor for Police
	 * @param name the Police's name
	 * @param age the Police'a age
	 */
	public Police(String name, int age){
		this.name = name;
		this.age = age;
		EID = lastEID;
		lastEID++;
		phoneNumber = lastPhoneNumber;
		lastPhoneNumber++;
	}
	
	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	
	/**
	 * method to pay the Police
	 */
	public void givePay(){}
	
	/**
	 * method to get the employee ID of the Police
	 * @return the Employee ID of the Police
	 */
	public int getEmployeeID(){
		return EID;
	}
}

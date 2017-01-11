/**
 * Class to model a Teacher
 * @author douellette20
 * @see Person
 * @see Employee
 * @version 1.00, Jan 10 2017
 */
public class Teacher extends Person implements Employee{
	private int gradeLevel;
	private String certification;
	private int EID;
	private static int lastEID = 100;
	
	/**
	 * default constructor for Teacher
	 */
	public Teacher(){
		name = "Gene";
		age = 42;
		EID = lastEID;
		lastEID++;
		certification = "Can teach all";
		phoneNumber = lastPhoneNumber;
		lastPhoneNumber++;
	}
	
	/**
	 * constructor for Teacher
	 * @param name the Teacher's name
	 * @param age the Teacher's age
	 */
	public Teacher(String name, int age){
		this.name = name;
		this.age = age;
		EID = lastEID;
		lastEID++;
		certification = "Can teach all";
		phoneNumber = lastPhoneNumber;
		lastPhoneNumber++;
	}
	
	/**
	 * @return the gradeLevel
	 */
	public int getGradeLevel() {
		return gradeLevel;
	}
	/**
	 * @param gradeLevel the gradeLevel to set
	 */
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	/**
	 * @return the certification
	 */
	public String getCertification() {
		return certification;
	}
	/**
	 * @param certification the certification to set
	 */
	public void setCertification(String certification) {
		this.certification = certification;
	}
	
	/**
	 * method to pay the Teacher
	 */
	public void givePay(){}
	
	/**
	 * method to get the Teacher's Employee ID
	 * @return the Employee ID of the Teacher
	 */
	public int getEmployeeID(){return EID;}
}

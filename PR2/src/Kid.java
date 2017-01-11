/**
 * Class to model a kid
 * @author douellette20
 * @see Person
 * @version 1.00, Jan 10 2017
 */
public class Kid extends Person{
	private String favoriteCandy;
	
	/**
	 * default constructor for Kid
	 */
	public Kid(){
		name = "Billy";
		age = 12;
		favoriteCandy = "Twix Right";
		phoneNumber = lastPhoneNumber;
		lastPhoneNumber++;
	}
	
	/**
	 * COnstructor for Kid
	 * @param name: the name of the Kid
	 * @param age the age of the Kid
	 * @param candy the favorite candy of the Kid
	 */
	public Kid(String name, int age, String candy){
		this.name = name;
		this.age = age;
		this.favoriteCandy = candy;
		phoneNumber = lastPhoneNumber;
		lastPhoneNumber++;
	}

	/**
	 * @return the favoriteCandy
	 */
	public String getFavoriteCandy() {
		return favoriteCandy;
	}

	/**
	 * @param favoriteCandy the favoriteCandy to set
	 */
	public void setFavoriteCandy(String favoriteCandy) {
		this.favoriteCandy = favoriteCandy;
	}
}

/**
 * This class models a Building
 * @author douellette20
 * @version 1.00, Jan 10 2017
 */
public class Building {
	protected String name;
	protected String address;
	
	/**
	 * Default constructor for Building
	 */
	public Building(){
		name = "place";
		address = "1000 42nd Ave, End of the Galaxy";
	}
	
	/**
	 * Constructor for Building
	 * @param name: the name of the building
	 * @param address: address of the building
	 */
	public Building(String name, String address){
		this.name = name;
		this.address = address;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}

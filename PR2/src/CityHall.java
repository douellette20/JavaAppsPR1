import java.util.ArrayList;

/**
 * This class models a City Hall, with Police inside it
 * @author douellette20
 * @see Building
 * @see Police
 * @version 1.00, Jan 10 2017
 */
public class CityHall extends Building{
	private ArrayList<Police> currOccupants = new ArrayList<Police>();
	
	/**
	 * Constructor for CityHall
	 * @param name: name of the city hall
	 * @param address: address of the city hall
	 * @param police: array of police inside city hall
	 */
	public CityHall(String name, String address, Police[] police){
		this.name = name;
		this.address = address;
		for (Police p : police)
			currOccupants.add(p);
	}
	
	/**
	 * Outputs the names of all police in this CityHall
	 */
	public void outputOccupants(){
		System.out.printf("Police currently in city hall: ");
		for (Police p : currOccupants){
			System.out.printf("%s ", p.getName());
		}
		System.out.println();
	}
	
	/**
	 * adds a policeman into CityHall
	 * @param p: the policeman to add
	 */
	public void addPolice(Police p){
		currOccupants.add(p);
	}
}

//-------------------------------
//Assignment #2
//Question: Part - 1; the class 
//defines the attributes of metro
//Written by: Jinchen Hu ID#40080398

package second_package;
/**
* 
* <p>Jinchen Hu ID#40080398</p>
* <p>COMP 249</p>
* <p>Assignment #2</p>
* <p>Due 11:59 PM - Wednesday, February 20, 2019</p>
*
*/
public class Metro extends CityBus {
	int numOfVehicles;
	String city;

	/**
	 * default constructor
	 */
	public Metro() {
	}

	/**
	 * parameterized constructor
	 * 
	 * @param ticketPrice        ticket price - double type
	 * @param numOfStops         number of stops - int type
	 * @param routeNum           route number - long type
	 * @param beginOperationYear begin operation year - int type
	 * @param lineName           line name - String type
	 * @param driverName         driver(s) name - String type
	 * @param numOfVehicles      number of vehicles - int type
	 * @param city               the name of city - String type
	 */
	public Metro(double ticketPrice, int numOfStops, long routeNum, int beginOperationYear, String lineName,
			String driverName, int numOfVehicles, String city) {
		super(ticketPrice, numOfStops, routeNum, beginOperationYear, lineName, driverName);
		this.numOfVehicles = numOfVehicles;
		this.city = city;
	}

	/**
	 * copy constructor
	 * 
	 * @param m passed object
	 */
	public Metro(Metro m) {
		if (m == null) {
			System.exit(0);
		}
		this.ticketPrice = m.ticketPrice;
		this.numOfStops = m.numOfStops;
		this.routeNum = m.routeNum;
		this.beginOperationYear = m.beginOperationYear;
		this.lineName = m.lineName;
		this.driverName = m.driverName;
		this.numOfVehicles = m.numOfVehicles;
		this.city = m.city;
	}

	/**
	 * accessor that returns the value of numOfVehicles
	 * 
	 * @return numOfVehicles the number of vehicles
	 */
	public int getNumOfVehicles() {
		return numOfVehicles;
	}

	/**
	 * mutator that assigns the received parameter to numOfVehicles of object
	 * 
	 * @param numOfVehicles the number of vehicles - int type
	 */
	public void setNumOfVehicles(int numOfVehicles) {
		this.numOfVehicles = numOfVehicles;
	}

	/**
	 * accessor that returns the value of city of the object
	 * 
	 * @return city the name of city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * mutator that sets a value to city when receiving the parameter
	 * 
	 * @param city the name of city - String type
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * method that displays the information of the metro
	 */
	public String toString() {
		return "This metro has " + numOfStops + " stops in " + city + ", and costs " + ticketPrice
				+ "$. Its vehicle number is " + numOfVehicles + ", route number is " + routeNum + ", line name is "
				+ lineName + ". it has been operated " + beginOperationYear + " year(s), and driver(s) name is "
				+ driverName;
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param m passed Metro object
	 * @return return true if all the attributes of two objects are equal
	 */
	public boolean equals(Metro m) {
		// if passed object is null, return false
		if (m == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != m.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.ticketPrice == m.ticketPrice && this.numOfStops == m.numOfStops && this.routeNum == m.routeNum
					&& this.beginOperationYear == m.beginOperationYear && this.lineName.equals(m.lineName)
					&& this.driverName.equals(m.driverName) && this.numOfVehicles == m.numOfVehicles);
	}

}

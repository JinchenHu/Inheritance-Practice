//-------------------------------
//Assignment #2
//Question: Part - 2; the class 
//defines the attributes of metro
//Written by: Jinchen Hu ID#40080398
/**
* 
* <p>@author Jinchen Hu ID#40080398</p>
* <p>COMP 249</p>
* <p>Assignment #2</p>
* <p>Due 11:59 PM - Wednesday, February 20, 2019</p>
*
*/
package part21;

public class Metro extends CityBus {
	// default to private
	private int numOfVehicles;
	private String city;

	
	/**
	 * default constructor
	 */
	Metro() {// public to default
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
	Metro(double ticketPrice, int numOfStops, long routeNum, int beginOperationYear, String lineName,
			String driverName, int numOfVehicles, String city) {	// public to default
		super(ticketPrice, numOfStops, routeNum, beginOperationYear, lineName, driverName);
		this.numOfVehicles = numOfVehicles;
		this.city = city;
	}

	/**
	 * copy constructor
	 * 
	 * @param m passed object
	 */
	Metro(Metro m) {	// public to default
		if (m == null) {
			System.exit(0);
		}
		this.setTicketPrice(m.getTicketPrice());
		this.setNumOfStops(m.getNumOfStops());
		this.setRouteNum(m.getRouteNum());
		this.setBeginOperationYear(m.getBeginOperationYear());
		this.setLineName(m.getLineName());
		this.setDriverName(m.getDriverName());
		this.numOfVehicles = m.numOfVehicles;
		this.city = m.city;
	}

	/**
	 * accessor that returns the value of numOfVehicles
	 * 
	 * @return numOfVehicles the number of vehicles
	 */
	int getNumOfVehicles() {	// public to default
		return numOfVehicles;
	}

	/**
	 * mutator that assigns the received parameter to numOfVehicles of object
	 * 
	 * @param numOfVehicles the number of vehicles - int type
	 */
	void setNumOfVehicles(int numOfVehicles) {	// public to default
		this.numOfVehicles = numOfVehicles;
	}

	/**
	 * accessor that returns the value of city of the object
	 * 
	 * @return city the name of city
	 */
	String getCity() {	// public to default
		return city;
	}

	/**
	 * mutator that sets a value to city when receiving the parameter
	 * 
	 * @param city the name of city - String type
	 */
	void setCity(String city) {	// public to default
		this.city = city;
	}

	/**
	 * method that displays the information of the metro
	 */
	public String toString() {
		return "This metro has " + getNumOfStops() + " stops in " + city + ", and costs " + getTicketPrice()
				+ "$. Its vehicle number is " + numOfVehicles + ", route number is " + getRouteNum() + ", line name is "
				+ getLineName() + ". it has been operated " + getBeginOperationYear() + " year(s), and driver(s) name is "
				+ getDriverName();
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param m passed Metro object
	 * @return return true if all the attributes of two objects are equal
	 */
	boolean equals(Metro m) {	// public to default
		// if passed object is null, return false
		if (m == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != m.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.getTicketPrice() == m.getTicketPrice() && this.getNumOfStops() == m.getNumOfStops() && this.getRouteNum() == m.getRouteNum()
					&& this.getBeginOperationYear() == m.getBeginOperationYear() && this.getLineName().equals(m.getLineName())
					&& this.getDriverName().equals(m.getDriverName()) && this.numOfVehicles == m.numOfVehicles);
	}

}

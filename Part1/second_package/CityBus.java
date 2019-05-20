//-------------------------------
//Assignment #2
//Question: Part - 1; the class 
//defines the attributes of city bus
//Written by: Jinchen Hu ID#40080398

package second_package;

import first_package.PublicTransportation;
/**
* 
* <p>Jinchen Hu ID#40080398</p>
* <p>COMP 249</p>
* <p>Assignment #2</p>
* <p>Due 11:59 PM - Wednesday, February 20, 2019</p>
*
*/
public class CityBus extends PublicTransportation {
	protected long routeNum;
	protected int beginOperationYear;
	protected String lineName;
	protected String driverName;

	/**
	 * default constructor
	 */
	public CityBus() {
	}

	/**
	 * arguments constructor
	 * 
	 * @param ticketPrice        ticket price - double type
	 * @param numOfStops         number of stops - int type
	 * @param routeNum           route number - long type
	 * @param beginOperationYear begin operation year - int type
	 * @param lineName           line name - String type
	 * @param driverName         driver(s) name - String type
	 */
	public CityBus(double ticketPrice, int numOfStops, long routeNum, int beginOperationYear, String lineName,
			String driverName) {
		super(ticketPrice, numOfStops);
		this.routeNum = routeNum;
		this.beginOperationYear = beginOperationYear;
		this.lineName = lineName;
		this.driverName = driverName;
	}

	/**
	 * copy constructor
	 * 
	 * @param c CityBus object
	 */
	public CityBus(CityBus c) {
		if (c == null) {
			System.exit(0);
		}
		this.ticketPrice = c.ticketPrice;
		this.numOfStops = c.numOfStops;
		this.routeNum = c.routeNum;
		this.beginOperationYear = c.beginOperationYear;
		this.lineName = c.lineName;
		this.driverName = c.driverName;
	}

	/**
	 * accessor that returns the value of route number
	 * 
	 * @return routeNum the value of route number - long type
	 */
	public long getRouteNum() {
		return routeNum;
	}

	/**
	 * mutator that sets the route number
	 * 
	 * @param routeNum received valued of route number - long type
	 */
	public void setRouteNum(long routeNum) {
		this.routeNum = routeNum;
	}

	/**
	 * accessor that returns the value of begainOperationYear
	 * 
	 * @return beginOperationYear begin operation year - int type
	 */
	public int getBeginOperationYear() {
		return beginOperationYear;
	}

	/**
	 * mutator that sets the value of begainOperationYear to the object
	 * 
	 * @param beginOperationYear received value of beginOperationYear - int type
	 */
	public void setBeginOperationYear(int beginOperationYear) {
		this.beginOperationYear = beginOperationYear;
	}

	/**
	 * accessor that returns the value of lineName
	 * 
	 * @return lineName line name - String type
	 */
	public String getLineName() {
		return lineName;
	}

	/**
	 * mutator that set the value of lineName to the object
	 * 
	 * @param lineName line name - String type
	 */
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	/**
	 * accessor that returns the value of driverName
	 * 
	 * @return driverName driver(s) name - String value
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * mutator that sets the value of driverName to the object
	 * 
	 * @param driverName diver(s) name - String value
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	/**
	 * method that displays the information of the city bus
	 */
	public String toString() {
		return "This city bus has " + numOfStops + " stops, and costs " + ticketPrice + "$. Its route number is "
				+ routeNum + ", line name is " + lineName + ". it has been operated " + beginOperationYear
				+ " year(s), and driver(s) name is " + driverName;
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param c passed CityBus object
	 * @return return true if all the attributes of two objects are equal
	 */
	public boolean equals(CityBus c) {
		// if passed object is null, return false
		if (c == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != c.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.ticketPrice == c.ticketPrice && this.numOfStops == c.numOfStops && this.routeNum == c.routeNum
					&& this.beginOperationYear == c.beginOperationYear && this.lineName.equals(c.lineName)
					&& this.driverName.equals(c.driverName));
	}

}

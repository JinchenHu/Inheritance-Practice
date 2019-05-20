//-------------------------------
//Assignment #2
//Question: Part - 2; the class 
//defines the attributes of ferry
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

public class Ferry extends PublicTransportation {
	// default to private
	private int buildYear;
	private String shipName;

	/**
	 * default constructor
	 */
	Ferry() {	// public to default
	}

	/**
	 * parameterized constructor
	 * 
	 * @param ticketPrice ticket price - double type
	 * @param numOfStops  number of stops - int type
	 * @param buildYear   - build year - int type
	 * @param shipName        - ship name - String type
	 */
	Ferry(double ticketPrice, int numOfStops, int buildYear, String shipName) {	// public to default
		super(ticketPrice, numOfStops);
		this.buildYear = buildYear;
		this.shipName = shipName;
	}

	/**
	 * copy constructor
	 * 
	 * @param f passed object
	 */
	Ferry(Ferry f) {	// public to default
		if (f == null) {
			System.exit(0);
		}
		this.setTicketPrice(f.getTicketPrice());;
		this.setNumOfStops(f.getNumOfStops());
		this.buildYear = f.buildYear;
		this.shipName = f.shipName;
	}

	/**
	 * accessor that returns the value of buildYear
	 * 
	 * @return buildYear
	 */
	int getBuildYear() {	// public to default
		return buildYear;
	}

	/**
	 * mutator that assigns the received value to buildYear
	 * 
	 * @param buildYear passed value - int type
	 */
	void setBuildYear(int buildYear) {	// public to default
		this.buildYear = buildYear;
	}

	/**
	 * accessor that returns the value of ship name
	 * 
	 * @return shipName ship name
	 */
	String getShipName() {	// public to default
		return shipName;
	}

	/**
	 * mutator that sets passed value to shipName
	 * 
	 * @param shipName ship name - String name
	 */
	void setShipName(String shipName) {	// public to default
		this.shipName = shipName;
	}

	/**
	 * method that display the information of the ferry
	 */
	public String toString() {
		return "the ferry name " + shipName + " has " + getNumOfStops() + " stops, and costs " + getTicketPrice()
				+ "$. It has been built for " + buildYear + " year(s)";
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param f passed Ferry object
	 * @return return true if all the attributes of two objects are equal
	 */
	boolean equals(Ferry f) {	// public to default
		// if passed object is null, return false
		if (f == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != f.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.getTicketPrice() == f.getTicketPrice() && this.getNumOfStops() == f.getNumOfStops()
					&& this.buildYear == f.buildYear && this.shipName.equals(f.shipName));
	}

}

//-------------------------------
//Assignment #2
//Question: Part - 1; the class 
//defines the attributes of ferry
//Written by: Jinchen Hu ID#40080398

package third_package;

import first_package.PublicTransportation;
/**
* 
* <p>Jinchen Hu ID#40080398</p>
* <p>COMP 249</p>
* <p>Assignment #2</p>
* <p>Due 11:59 PM - Wednesday, February 20, 2019</p>
*
*/
public class Ferry extends PublicTransportation {
	int buildYear;
	String shipName;

	/**
	 * default constructor
	 */
	public Ferry() {
	}

	/**
	 * parameterized constructor
	 * 
	 * @param ticketPrice ticket price - double type
	 * @param numOfStops  number of stops - int type
	 * @param buildYear   - build year - int type
	 * @param shipName        - ship name - String type
	 */
	public Ferry(double ticketPrice, int numOfStops, int buildYear, String shipName) {
		super(ticketPrice, numOfStops);
		this.buildYear = buildYear;
		this.shipName = shipName;
	}

	/**
	 * copy constructor
	 * 
	 * @param f passed object
	 */
	public Ferry(Ferry f) {
		if (f == null) {
			System.exit(0);
		}
		this.ticketPrice = f.ticketPrice;
		this.numOfStops = f.numOfStops;
		this.buildYear = f.buildYear;
		this.shipName = f.shipName;
	}

	/**
	 * accessor that returns the value of buildYear
	 * 
	 * @return buildYear
	 */
	public int getBuildYear() {
		return buildYear;
	}

	/**
	 * mutator that assigns the received value to buildYear
	 * 
	 * @param buildYear passed value - int type
	 */
	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}

	/**
	 * accessor that returns the value of ship name
	 * 
	 * @return shipName ship name
	 */
	public String getShipName() {
		return shipName;
	}

	/**
	 * mutator that sets passed value to shipName
	 * 
	 * @param shipName ship name - String name
	 */
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	/**
	 * method that display the information of the ferry
	 */
	public String toString() {
		return "the ferry name " + shipName + " has " + numOfStops + " stops, and costs " + ticketPrice
				+ "$. It has been built for " + buildYear + " year(s)";
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param f passed Ferry object
	 * @return return true if all the attributes of two objects are equal
	 */
	public boolean equals(Ferry f) {
		// if passed object is null, return false
		if (f == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != f.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.ticketPrice == f.ticketPrice && this.numOfStops == f.numOfStops
					&& this.buildYear == f.buildYear && this.shipName.equals(f.shipName));
	}

}

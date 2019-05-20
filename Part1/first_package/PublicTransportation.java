

package first_package;
/**
* 
* <p>Jinchen Hu ID#40080398</p>
* <p>COMP 249</p>
* <p>Assignment #2</p>
* <p>Due 11:59 PM - Wednesday, February 20, 2019</p>
*
*/
public class PublicTransportation {
	// declare a double instance variable
	public double ticketPrice;
	// declare an integer instance variable
	public int numOfStops;

	/**
	 * non-argument constructor
	 */
	public PublicTransportation() {
	}

	/**
	 * parameterized constructor which assign the values to object after receiving
	 * the arguments
	 * 
	 * @param ticketPrice double type
	 * @param numOfStops  int type - number of stops
	 */
	public PublicTransportation(double ticketPrice, int numOfStops) {
		this.ticketPrice = ticketPrice;
		this.numOfStops = numOfStops;
	}

	/**
	 * copy constructor
	 * 
	 * @param p PublicTransportation object
	 */
	public PublicTransportation(PublicTransportation p) {
		if (p == null) {
			System.exit(0);
		}
		this.ticketPrice = p.ticketPrice;
		this.numOfStops = p.numOfStops;
	}

	/**
	 * getter method to return the value of ticketPrice
	 * 
	 * @return ticketPrice the value of ticket price of calling object
	 */
	public double getTicketPrice() {
		return ticketPrice;
	}

	/**
	 * setter method to set the ticket number to the object when receiving parameter
	 * 
	 * @param ticketPrice double type
	 */
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	/**
	 * getter method to return the value of numOfStops
	 * 
	 * @return numOfStops the value of number of stops of calling object
	 */
	public int getNumOfStops() {
		return numOfStops;
	}

	/**
	 * setter method to set the number of stops to the object when receiving
	 * parameter
	 * 
	 * @param numOfStops int type
	 */
	public void setNumOfStops(int numOfStops) {
		this.numOfStops = numOfStops;
	}

	/**
	 * method that display the information of the object
	 */
	public String toString() {
		return "this public transportation has " + numOfStops + " stops, and costs " + ticketPrice + "$.";
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param p passed PublicTransportation object
	 * @return return true if all the attributes of two objects are equal
	 */
	public boolean equals(PublicTransportation p) {
		// if passed object is null, return false
		if (p == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != p.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.ticketPrice == p.ticketPrice && this.numOfStops == p.numOfStops);
	}

}

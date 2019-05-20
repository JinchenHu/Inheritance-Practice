
package part21;

public class PublicTransportation {
	//public to private
	// declare a double instance variable
	private double ticketPrice;
	// declare an integer instance variable
	private int numOfStops;

	/**
	 * non-argument constructor
	 */
	 PublicTransportation() {	// public to default
	}

	/**
	 * parameterized constructor which assign the values to object after receiving
	 * the arguments
	 * 
	 * @param ticketPrice double type
	 * @param numOfStops  int type - number of stops
	 */
	PublicTransportation(double ticketPrice, int numOfStops) {	// public to default
		this.ticketPrice = ticketPrice;
		this.numOfStops = numOfStops;
	}

	/**
	 * copy constructor
	 * 
	 * @param p PublicTransportation object
	 */
	PublicTransportation(PublicTransportation p) {	// public to default
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
	double getTicketPrice() {	// public to default
		return ticketPrice;
	}

	/**
	 * setter method to set the ticket number to the object when receiving parameter
	 * 
	 * @param ticketPrice double type
	 */
	void setTicketPrice(double ticketPrice) {	// public to default
		this.ticketPrice = ticketPrice;
	}

	/**
	 * getter method to return the value of numOfStops
	 * 
	 * @return numOfStops the value of number of stops of calling object
	 */
	int getNumOfStops() {	// public to default
		return numOfStops;
	}

	/**
	 * setter method to set the number of stops to the object when receiving
	 * parameter
	 * 
	 * @param numOfStops int type
	 */
	void setNumOfStops(int numOfStops) {	// public to default
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
	boolean equals(PublicTransportation p) {	// public to default
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

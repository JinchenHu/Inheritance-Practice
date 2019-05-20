
package part21;

public class Tram extends CityBus {
	// declare an integer value maxSpeed which indicates the maximum speed that this
	// city bus could reach
	// default to private
	private int maxSpeed;

	/**
	 * non-argument constructor
	 */
	public Tram() {
	}	// public to default

	/**
	 * arguments constructor
	 * 
	 * @param ticketPrice        ticket price - double type
	 * @param numOfStops         number of stops - int type
	 * @param routeNum           route number - long type
	 * @param beginOperationYear begin operation year - int type
	 * @param lineName           line name - String type
	 * @param driverName         driver(s) name - String type
	 * @param maxSpeed           maximum speed - int type
	 */
	Tram(double ticketPrice, int numOfStops, long routeNum, int beginOperationYear, String lineName,
			String driverName, int maxSpeed) {	// public to default
		super(ticketPrice, numOfStops, routeNum, beginOperationYear, lineName, driverName);
		this.maxSpeed = maxSpeed;
	}
	
	/**
	 * copy constructor
	 * @param t passed Tram object
	 */
	Tram(Tram t) {	// public to default
		if (t == null) {
			System.exit(0);
		}
		this.setTicketPrice(t.getTicketPrice());
		this.setNumOfStops(t.getNumOfStops());
		this.setRouteNum(t.getRouteNum());
		this.setBeginOperationYear(t.getBeginOperationYear());
		this.setLineName(t.getLineName());
		this.setDriverName(t.getDriverName());
		this.maxSpeed = t.maxSpeed;
	}

	/**
	 * accessor that returns the valued of maxSpeed
	 * 
	 * @return maxSpeed maximum speed
	 */
	int getMaxSpeed() {	// public to default
		return this.maxSpeed;
	}

	/**
	 * mutator that assign the passed value to maxSpeed of the object
	 * 
	 * @param maxSpeed received value of maxSpeed - int type
	 */
	void setMaxSpeed(int maxSpeed) {	// public to default
		this.maxSpeed = maxSpeed;
	}

	/**
	 * method that displays the information of the tram
	 */
	public String toString() {
		return "This Tram has " + getNumOfStops() + " stops, and costs " + getTicketPrice() + "$. Its maximum speed is "
				+ maxSpeed + "km/h, route number is " + getRouteNum() + ", line name is " + getLineName()
				+ ". it has been operated " + getBeginOperationYear() + " year(s), and driver(s) name is " + getDriverName();
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param t passed Tram object
	 * @return return true if all the attributes of two objects are equal
	 */
	boolean equals(Tram t) {	// public to default
		// if passed object is null, return false
		if (t == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != t.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.getTicketPrice() == t.getTicketPrice() && this.getNumOfStops() == t.getNumOfStops() && this.getRouteNum()== t.getRouteNum()
					&& this.getBeginOperationYear() == t.getBeginOperationYear() && this.getLineName().equals(t.getLineName())
					&& this.getDriverName().equals(t.getDriverName()) && this.maxSpeed == t.maxSpeed);
	}
}

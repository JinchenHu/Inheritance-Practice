

package second_package;

public class Tram extends CityBus {
	// declare an integer value maxSpeed which indicates the maximum speed that this
	// city bus could reach
	int maxSpeed;

	/**
	 * non-argument constructor
	 */
	public Tram() {
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
	 * @param maxSpeed           maximum speed - int type
	 */
	public Tram(double ticketPrice, int numOfStops, long routeNum, int beginOperationYear, String lineName,
			String driverName, int maxSpeed) {
		super(ticketPrice, numOfStops, routeNum, beginOperationYear, lineName, driverName);
		this.maxSpeed = maxSpeed;
	}

	/**
	 * copy constructor
	 * @param t passed Tram object
	 */
	public Tram(Tram t) {
		if (t == null) {
			System.exit(0);
		}
		this.ticketPrice = t.ticketPrice;
		this.numOfStops = t.numOfStops;
		this.routeNum = t.routeNum;
		this.beginOperationYear = t.beginOperationYear;
		this.lineName = t.lineName;
		this.driverName = t.driverName;
		this.maxSpeed = t.maxSpeed;
	}

	/**
	 * accessor that returns the valued of maxSpeed
	 * 
	 * @return maxSpeed maximum speed
	 */
	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	/**
	 * mutator that assign the passed value to maxSpeed of the object
	 * 
	 * @param maxSpeed received value of maxSpeed - int type
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * method that displays the information of the tram
	 */
	public String toString() {
		return "This Tram has " + numOfStops + " stops, and costs " + ticketPrice + "$. Its maximum speed is "
				+ maxSpeed + "km/h, route number is " + routeNum + ", line name is " + lineName
				+ ". it has been operated " + beginOperationYear + " year(s), and driver(s) name is " + driverName;
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param t passed Tram object
	 * @return return true if all the attributes of two objects are equal
	 */
	public boolean equals(Tram t) {
		// if passed object is null, return false
		if (t == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != t.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.ticketPrice == t.ticketPrice && this.numOfStops == t.numOfStops && this.routeNum == t.routeNum
					&& this.beginOperationYear == t.beginOperationYear && this.lineName.equals(t.lineName)
					&& this.driverName.equals(t.driverName) && this.maxSpeed == t.maxSpeed);
	}
}

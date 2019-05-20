//-------------------------------
//Assignment #2
//Question: Part - 2; the class 
//defines the attributes of aircraft
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

public class AirCraft extends PublicTransportation {
	// create a enumeration type that stores the class type of aircraft
	// public to default
	enum ClassType {
		Helicopter, Airline, Glider, Balloon;
//		H("Helicopter"),A("Airline"),G("Glider"),B("Balloon");
//		private String type;
//		private ClassType(String type) {
//			this.type = type;
//		}
//		public String getType() {
//			return type;
//		}
//		public void setType(String type) {
//			this.type = type;
//		}
	}

	// create a enumeration type that stores the maintenance type of aircraft
	// public to default
	enum maintenanceType {
		Weekly, Mothly, Yearly;
//		W("Weekly"),M("Monthly"),Y("Yearly");
//		private String maintenace;
//		private maintenanceType(String maintenance) {
//			this.maintenace = maintenance;
//		}
//		public String getMaintenace() {
//			return maintenace;
//		}
//		public void setMaintenace(String maintenace) {
//			this.maintenace = maintenace;
//		}
	}

	// default to private
	private ClassType c;
	private maintenanceType m;

	/**
	 * non-argument constructor
	 */
	AirCraft() {// public to default
	}

	/**
	 * parameterized constructor
	 * 
	 * @param ticketPrice ticket number - double type
	 * @param numOfStops  number of stops - int type
	 * @param c           class type - enumeration type
	 * @param m           maintenance type - enumeration type
	 */
	AirCraft(double ticketPrice, int numOfStops, ClassType c, maintenanceType m) {
		// public to default
		super(ticketPrice, numOfStops);
		this.c = c;
		this.m = m;
	}

	/**
	 * copy constructor
	 * 
	 * @param a passed AirCraft object
	 */
	AirCraft(AirCraft a) {	// public to default
		if (a == null) {
			System.exit(0);
		}
		this.setTicketPrice(a.getTicketPrice());
		this.setNumOfStops(a.getNumOfStops());
		this.c = a.c;
		this.m = a.m;
	}

	/**
	 * accessor that returns the value of c
	 * 
	 * @return c class type
	 */
	ClassType getC() {	// public to default
		return c;
	}

	/**
	 * mutator that sets the value to c
	 * 
	 * @param c class type
	 */
	void setC(ClassType c) {	// public to default
		this.c = c;
	}

	/**
	 * accessor that returns the value of m
	 * 
	 * @return maintenance type
	 */
	maintenanceType getM() {	// public to default
		return m;
	}

	/**
	 * mutator that assigns the value to m
	 * 
	 * @param m maintenance type
	 */
	void setM(maintenanceType m) {	// public to default
		this.m = m;
	}

	/**
	 * method that display the information of the aircraft
	 */
	public String toString() {
		return "this aircraft has " + getNumOfStops() + " stops, and costs " + getTicketPrice() + "$. Its class type is "
				+ c.toString() + ", and maintenance type is " + m.toString();
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param a passed AirCraft object
	 * @return return true if all the attributes of two objects are equal
	 */
	boolean equals(AirCraft a) {	// public to default
		// if passed object is null, return false
		if (a == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != a.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.getTicketPrice() == a.getTicketPrice() && this.getNumOfStops() == a.getNumOfStops() && this.c.equals(a.c)
					&& this.m.equals(a.m));
	}

}

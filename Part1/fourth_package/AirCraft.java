

package fourth_package;

import first_package.PublicTransportation;

public class AirCraft extends PublicTransportation {
	// create a enumeration type that stores the class type of aircraft
	public enum ClassType {
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
	public enum maintenanceType {
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

	ClassType c;
	maintenanceType m;

	/**
	 * non-argument constructor
	 */
	public AirCraft() {
	}

	/**
	 * parameterized constructor
	 * 
	 * @param ticketPrice ticket number - double type
	 * @param numOfStops  number of stops - int type
	 * @param c           class type - enumeration type
	 * @param m           maintenance type - enumeration type
	 */
	public AirCraft(double ticketPrice, int numOfStops, ClassType c, maintenanceType m) {
		super(ticketPrice, numOfStops);
		this.c = c;
		this.m = m;
	}

	/**
	 * copy constructor
	 * 
	 * @param a passed AirCraft object
	 */
	public AirCraft(AirCraft a) {
		if (a == null) {
			System.exit(0);
		}
		this.ticketPrice = a.ticketPrice;
		this.numOfStops = a.numOfStops;
		this.c = a.c;
		this.m = a.m;
	}

	/**
	 * accessor that returns the value of c
	 * 
	 * @return c class type
	 */
	public ClassType getC() {
		return c;
	}

	/**
	 * mutator that sets the value to c
	 * 
	 * @param c class type
	 */
	public void setC(ClassType c) {
		this.c = c;
	}

	/**
	 * accessor that returns the value of m
	 * 
	 * @return maintenance type
	 */
	public maintenanceType getM() {
		return m;
	}

	/**
	 * mutator that assigns the value to m
	 * 
	 * @param m maintenance type
	 */
	public void setM(maintenanceType m) {
		this.m = m;
	}

	/**
	 * method that display the information of the aircraft
	 */
	public String toString() {
		return "this aircraft has " + numOfStops + " stops, and costs " + ticketPrice + "$. Its class type is "
				+ c.toString() + ", and maintenance type is " + m.toString();
	}

	/**
	 * method that returns false if the passed object is null, belongs to the
	 * different class, or has different value of each attribute with compared
	 * object; otherwise, return true
	 * @param a passed AirCraft object
	 * @return return true if all the attributes of two objects are equal
	 */
	public boolean equals(AirCraft a) {
		// if passed object is null, return false
		if (a == null)
			return false;
		// if the classes of passed and compared objects are different, return false
		else if (this.getClass() != a.getClass())
			return false;
		// if all the attributes of passed and compared objects are equal, return true;
		// otherwise, return false
		else
			return (this.ticketPrice == a.ticketPrice && this.numOfStops == a.numOfStops && this.c.equals(a.c)
					&& this.m.equals(a.m));
	}

}


package part21;

import part21.AirCraft.ClassType;
import part21.AirCraft.maintenanceType;

public class Driver {
	/**
	 * static method that return a copy PublicTransportation array when receiving a passed array
	 * @param array an array of PublicTransportation that is copied
	 * @return p an array of PublicTransportation
	 */
	public static PublicTransportation[] copyCityBus(PublicTransportation[] array) {
		PublicTransportation[] p = new PublicTransportation[array.length];
		for(int i = 0; i < p.length; i++) {
			if(array[i].getClass().equals(PublicTransportation.class)) {
				p[i] = new PublicTransportation(array[i]);
			}
			if(array[i].getClass().equals(CityBus.class)) {
				p[i] = new CityBus((CityBus)array[i]);
			}
			if(array[i].getClass().equals(Tram.class)) {
				p[i] = new Tram((Tram)array[i]);
			}
			if(array[i].getClass().equals(Metro.class)) {
				p[i] = new Metro((Metro)array[i]);
			}
			if(array[i].getClass().equals(Ferry.class)) {
				p[i] = new Ferry((Ferry)array[i]);
			}
			if(array[i].getClass().equals(AirCraft.class)) {
				p[i] = new AirCraft((AirCraft)array[i]);
			}
		}
		return p;
	}

	public static void main(String[] args) {
		PublicTransportation[] p1 = { new PublicTransportation(3.5, 18), new PublicTransportation(5.5, 20),
				new CityBus(7.5, 24, 5225426, 2, "Cat", "Tylor"), new CityBus(1.5, 11, 52256726, 5, "Monkey", "Carl"),
				new Tram(0.99, 2, 12345234, 40, "Fall", "Liam", 30),
				new Tram(10, 7, 902345234, 32, "Spring", "Sara", 50),
				new Metro(4.3, 30, 9058234, 5, "Blue", "Fiona", 12, "Montreal"),
				new Metro(4.0, 28, 9082364, 7, "Yellow", "Mary", 8, "Montreal"), new Ferry(60.9, 4, 13, "Brid"),
				new Ferry(1999.9, 10, 13, "Shark"), new AirCraft(2300, 2, ClassType.Airline, maintenanceType.Weekly),
				new AirCraft(680, 4, ClassType.Balloon, maintenanceType.Yearly), };
		PublicTransportation[] p2 = copyCityBus(p1);
		
		//copy successfully
		for(PublicTransportation p : p1) {
			System.out.println(p);
		}
		System.out.println("\n*******************************************************\n");
		for(PublicTransportation p : p2) {
			System.out.println(p);
		}
	}
}



package dirver_package;

import first_package.PublicTransportation;
import second_package.Metro;
import second_package.CityBus;
import second_package.Tram;
import third_package.Ferry;
import fourth_package.AirCraft;
import fourth_package.AirCraft.ClassType;
import fourth_package.AirCraft.maintenanceType;
/**
* 
* <p>Jinchen Hu ID#40080398</p>
* <p>COMP 249</p>
* <p>Assignment #2</p>
* <p>Due 11:59 PM - Wednesday, February 20, 2019</p>
*
*/
public class Driver {
	public static void main(String[] args) {
		PublicTransportation pub1 = new PublicTransportation(3.5, 18);
		System.out.println(pub1);
		PublicTransportation pub2 = new PublicTransportation(5, 33);
		System.out.println(pub2);
		CityBus bus = new CityBus(1.5, 24, 52256726, 5, "Monkey", "Carl");
		System.out.println(bus);
		Tram tram = new Tram(10, 7, 902345234, 30, "Spring", "Sara", 50);
		System.out.println(tram);
		Metro metro = new Metro(4.3, 30, 908234, 4, "Blue", "Fiona", 8, "Montreal");
		System.out.println(metro);
		Ferry ferry1 = new Ferry(60.9, 4, 13, "Brid");
		System.out.println(ferry1);
		Ferry ferry2 = null;
		System.out.println(ferry2);
		AirCraft craft1 = new AirCraft(680, 12, ClassType.Helicopter, maintenanceType.Mothly);
		System.out.println(craft1);
		AirCraft craft2 = new AirCraft(680, 12, ClassType.Helicopter, maintenanceType.Mothly);
		System.out.println(craft2);
		System.out.println("\n*****************************************************************\n");

		// same class and same attributes
		System.out.println("craft1 is equal to craft2 - " + craft1.equals(craft2));
		// same class but different attributes
		System.out.println("pub1 is equal to pub2 - " + pub1.equals(pub2));
		// one of two is null
		System.out.println("ferry1 is equal to ferry2 - " + ferry1.equals(ferry2));
		// different class
		System.out.println("bus is equal to tram - " + bus.equals(tram));
		System.out.println("\n*****************************************************************\n");

		PublicTransportation[] p = { new PublicTransportation(3.5, 18), new PublicTransportation(5.5, 20),
				new CityBus(7.5, 24, 5225426, 2, "Cat", "Tylor"),
				new CityBus(1.5, 11, 52256726, 5, "Monkey", "Carl"),
				new Tram(0.99, 2, 12345234, 40, "Fall", "Liam", 30),
				new Tram(10, 7, 902345234, 32, "Spring", "Sara", 50),
				new Metro(4.3, 30, 9058234, 5, "Blue", "Fiona", 12, "Montreal"),
				new Metro(4.0, 28, 9082364, 7, "Yellow", "Mary", 8, "Montreal"),
				new Metro(4.5, 32, 9082314, 9, "Pink", "Diana", 16, "Montreal"), new Ferry(60.9, 6, 2, "Salmon"),
				new Ferry(60.9, 4, 13, "Brid"), new Ferry(1999.9, 10, 13, "Shark"),
				new AirCraft(2300, 2, ClassType.Airline, maintenanceType.Weekly),
				new AirCraft(680, 4, ClassType.Balloon, maintenanceType.Yearly),
				new AirCraft(99, 2, ClassType.Glider, maintenanceType.Mothly) };
		
		double max = p[0].getTicketPrice();
		double min = p[0].getTicketPrice();
		int maxIndex = 0;
		int minIndex = 0;
		for(int i = 1; i < p.length; i++) {
			if(max < p[i].getTicketPrice()) {
				max = p[i].getTicketPrice();
				maxIndex = i;
			}
			if(min > p[i].getTicketPrice()) {
				min = p[i].getTicketPrice();
				minIndex = i;
			}
		}
		System.out.println("The cheapest public transportation is p[" + minIndex + "]");
		System.out.println(p[minIndex]);
		System.out.println("\n-----------------------------------------------------");
		System.out.println("The most expensive public transportation is p[" + maxIndex + "]");
		System.out.println(p[maxIndex]);
		
	}
}

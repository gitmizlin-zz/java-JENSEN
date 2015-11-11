import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class UpAndAway {
	public static void main(String[] args) {
		System.out.println("Welcome to Up and Away");

		Airport arn = new Airport();
		System.out.println("Welcome to " + arn);

		Airport maltaAirPort = new Airport("Malta Airport", "Malta island", 300, "MXE");
		System.out.println("Welcome to " + maltaAirPort);

		Airplane ap = new Airplane();
		System.out.println("The airplane with no parameters: " + ap);

		Airplane ap2 = new Airplane("Boing2000");
		System.out.println("The airplane with parameters: " + ap2);
		System.out.println("The airplane with parameters. productionYear: " + ap2.productionYear);

		Passenger passenger1 = new Passenger();
		Passenger passenger2 = new Passenger("David Smith", "male", 30, 901343, false);
		System.out.println("The passenger with no parameters: " + passenger1);
		System.out.println("The passenger with parameters: " + passenger2);
		System.out.println("Passenger2's booking number: " + passenger2.bookingNumber);
	}
}

class Airport {
	// instance variables
	// Vad skiljer olika flygplatser åt?

	String name;
	String location;
	int capacity;
	String airportCode;

	ArrayList<Airplane>  listOfAirplanes = new ArrayList<>(); // a variable av the type ArrayList. Holds objects of the type AirPlane

	// class variables

	// constructors  
	public Airport() { // A constructor without any parameters is a default-constructor 
		// default values
		name = "Arlanda";
		location = "Sweden";
		capacity = 5000;
		airportCode = "ARN";
	}

	public Airport(String name, String location, int capacity, String code) { 
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.airportCode = airportCode;
	}

	// methods (for the objects)
	public String toString() {
		return name;
	}

	public void addAirplane(Airplane airplane) {
		listOfAirplanes.add(airplane);
	}

	public void printAirplanes() {
		System.out.println(listOfAirplanes);
	}

	// static methods (för the class). Set or get

}

class Airplane {
	String name;
	String type;
	int capacity;
	int productionYear;

	// class variables;
	static int nrOfAirplanes;
	static int nrOfAirplanesInTheAir;

	// constructors
	public Airplane() {
		name = "Unknown";
		type = "Whatever";
		capacity = 300;
		productionYear = 0;
	}

	public Airplane(String type) { 
		this();
		this.type = type;
	}

	public Airplane(String name, String type, int capacity) { 
		this(type); // calls hte constructor in this class with no parameters
		// this.name = name;
		// this.type = type;
		// this.capacity = capacity;
		this.productionYear = 1983;
	}

	public String toString() {
		return name;
	}
}

class Passenger {
	String name;
	String gender;
	int age;
	int bookingNumber;
	boolean isCheckedIn;

	public Passenger() {
		name = "whatever";
		gender = "Unknown";
		age = 0;
		bookingNumber = 00000;
	}

	public Passenger(String name, String gender, int age, int bookingNumber, boolean isCheckedIn) { 
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.bookingNumber = bookingNumber;
		this.isCheckedIn = isCheckedIn;
	}

	public String toString() {
		return name;
	}
}
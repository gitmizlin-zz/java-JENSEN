public class Inheritance {
	public static void main(String[] args) {
	// minimal working example
		Human teacher = new Human("Oscar", "STO", 28);

		Player zlatan = new Player();
		zlatan.setLocation("Blekinge");
		System.out.println("Zlatan is in " + zlatan.getLocation());

		Player ronaldo = new Player("a", "s", 33);
		System.out.println("Ronaldo is in " + ronaldo.getLocation());
	}
}

class Human { 
	// instancvariables (fields)
	String name;
	String location;
	int age;

	// constructor **Skriv inte void, för den returnerar nåt.
	public Human(String name, String location, int age) { // "public" kan skippas. 
		this.name = name;
		this.location = location;
		this.age = age;
	}

	public Human() { // you have to have a constructor with no parameters if you create constructors with parameters.
		this("Om nom nom", "nånstans i Sverige", 30);
	}

	// metoder
	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() { // you don't need "this" because there is no parameter "location"
		return location;
	}
}

class Player extends Human {

	public Player() {

	}

	public Player(String name, String location, int age) {
		super(name, location, age); // a constructor in superclass
	}
	
}
// Skriv en klass TestStatic som innehåller en klassvariabel totalAmount som automatiskt håller reda på hur många objekt av klassen TestStatic som totalt har skapats. Klassen ska dessutom innehålla en klassmetod som returnerar värdet av klassvariabeln.

public class TestStatic {
	static int totalAmount = 0;
	int id;

	TestStatic() { // constructor. Called whenever you create a new instance of the class
		totalAmount++;
		id = totalAmount;
	}

	static int getTotalAmount() { // why need this method? you can just call the variable totalAmount?
		return totalAmount;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		TestStatic obj1 = new TestStatic();
		TestStatic obj2 = new TestStatic();
		TestStatic obj3 = new TestStatic();
		TestStatic obj4 = new TestStatic();
		TestStatic obj5 = new TestStatic();
		TestStatic obj6 = new TestStatic();

        System.out.println("Number of objects created: " + totalAmount);
	}
}

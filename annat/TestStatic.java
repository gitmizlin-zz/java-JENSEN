public class TestStatic {

	static int totalAmount = 0; // Class variables are always static. 
	private int id; // instance variables should be private.

	public TestStatic() { // Constructors cannot be static.
		totalAmount++;
		id = totalAmount;
	}

	public static int getTotalAmount() { // getters and setters are always public
		return totalAmount;
	}

	public int getId() {
		return id;
	}
}
	
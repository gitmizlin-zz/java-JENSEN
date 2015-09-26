public class Test {
	public static void main(String[] args) {
		System.out.println("Test class main");

		String[] carBrands = Car.getCarBrandsList();

		Car c1 = new Car("Toyota");
		Car c2 = new Car("Nissan");

		System.out.println("car brands");
		for (int i = 0; i < carBrands.length; i++) {
			System.out.println(carBrands[i]);
		}

		System.out.println("c1 brand " + c1.getBrand());
		System.out.println("c2 brand " + c2.getBrand());
	}
}

class Car {
	private String brand;

	public Car(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public static String[] getCarBrandsList() {
		String[] list = {
			"Toyota",
			"Nissan",
			"Suzuki",
		};

		return list;
	}
}

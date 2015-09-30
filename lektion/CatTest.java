public class CatTest {
	public static void main (String[] args) {
		Cat cat1 = new Cat ("Yukichi", 19, "Japan");
		Cat cat2 = new Cat ("Chibi", 10);
		Cat cat3 = new Cat ();
		
		System.out.println("Name: " + cat1.name);
		System.out.println("Age: " + cat1.age);
		System.out.println("Name: " + cat1.land);

		System.out.println("Name: " + cat2.name);
		System.out.println("Age: " + cat2.age);
		System.out.println("Name: " + cat2.land);

		System.out.println("Name: " + cat3.name);
		System.out.println("Age: " + cat3.age);
		System.out.println("Name: " + cat3.land);
	}
}
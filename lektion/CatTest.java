public class CatTest {
	public static void main (String[] args) {
		Cat cat1 = new Cat ("Yukichi", 19, "Japan");
		Cat cat2 = new Cat ("Chibi", 10);
		Cat cat21 = new Cat (30, "Yoyo");
		Cat cat3 = new Cat ();
		Cat cat4 = new Cat ("4name", "4land");
		Cat cat5 = new Cat ("5land", "5name");

		System.out.println("Name1: " + cat1.name);
		System.out.println("Age1: " + cat1.age);
		System.out.println("Name1: " + cat1.land);

		System.out.println("Name2: " + cat2.name);
		System.out.println("Age2: " + cat2.age);
		System.out.println("Name2: " + cat2.land);

		System.out.println("Name21: " + cat21.name);
		System.out.println("Age21: " + cat21.age);
		System.out.println("Name21: " + cat21.land);

		System.out.println("Name3: " + cat3.name);
		System.out.println("Age3: " + cat3.age);
		System.out.println("Name3: " + cat3.land);

		System.out.println("Name4: " + cat4.name);
		System.out.println("Age4: " + cat4.age);
		System.out.println("Name4: " + cat4.land);

		System.out.println("Name5: " + cat5.name);
		System.out.println("Age5: " + cat5.age);
		System.out.println("Name5: " + cat5.land);
	}
}
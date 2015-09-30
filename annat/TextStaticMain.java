public class TestStaticMain extends TestStaticMain {
	public static void main(String[] args) {

		TestStatic object1 = new TestStatic();
		TestStatic object2 = new TestStatic();
		TestStatic object3 = new TestStatic();
		TestStatic object4 = new TestStatic();
		TestStatic object5 = new TestStatic();

		System.out.println("The number of objects: " + getTotalAmount());
		System.out.println("The ID of object3: " + object3.getId());
	}
}
public class Cat {
	String name;
	int age;
	String land;

	// when an instance with no parameters is created, the first method is called because of "this". "this()" means this class' constructor.

	Cat (String name, int age, String land) {
		this.name = name;
		this.age = age;
		this.land = land;
	}

	Cat (String name, int age) {
		this(name, age, "Sverige");
	}

	Cat () {
		this("unknown", 10, "Japan");
	}
}
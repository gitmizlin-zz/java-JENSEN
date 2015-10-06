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

	// parameter order changed. works.
	Cat (int age, String name) {
		this(name, age, "Boo!!!");
	}


	Cat () {
		this("unknown", 10, "Japan");
	}

	Cat (String name, String land) { // String * 2
		this(name, 34, land);
	}

	Cat (String land, String name) { // String * 2 i samma datatyp som ovan. funkar inte.
		this(land, 899, name);
	}
}
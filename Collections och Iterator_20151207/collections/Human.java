public abstract class Human {
	String namn;
	byte age; // -128 till 127	
	boolean isMarried;
	Gender gender;

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * Designmönster: factory
	 * Begränsa och kontollera vilka objekt som kan skapas och hur de skapas 
	 * Objekt skapas och returneras med en statisk metod (i detta fall create())
	 * Vi har en "HumanFactory"
	*/

	public static Human create(String personNr) {
		// 19910401-0123 Vi vill undersöka index 9 i personnumret
		char nr = personNr.charAt(9);
		int x = (int) nr;
		Human human;

		if (x % 2 == 0) {
			human = new Woman();
		} else {
			human = new Man();
		}

		return human;
	}

	public static void main(String[] args) {
		Human someOne = create("992323-1242");
		System.out.println("someOne");
	}
}


class Man extends Human {
	gender = Gender.MALE;

	public String toString() {
		return name + " (man)";
	}
}

class Woman extends Human {
	gender = Gender.FEMALE;
	public String toString() {
		return name + " (woman)";
	}
}
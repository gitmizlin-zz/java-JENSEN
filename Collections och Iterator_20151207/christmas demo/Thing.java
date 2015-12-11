public class Thing extends Gift {
	int value;

	public Thing(String name, int value) {
		super(name);
		this.value = value;
	}

	@Override
	public int getValue() {
		return value;
	}

	public String toString() {
		return this.getName();
	}
}

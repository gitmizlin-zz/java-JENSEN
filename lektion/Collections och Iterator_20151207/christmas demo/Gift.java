public abstract class Gift {	
	private String name;

	public Gift(String name) {
		this.name = name;
	}

	public abstract int getValue();


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

	public String toString() {
		return this.getName();
	}
}
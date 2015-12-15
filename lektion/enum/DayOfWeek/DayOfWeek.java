// man kan se enumvärden som objekt. () = parameter

public enum DayOfWeek {
	MONDAY("måndag"),  
	TUESDAY("tisdag"), 
	WEDNESDAY("onsdag"), 
	THURSDAY("torsdag"), 
	FRIDAY("fredag"), 
	SATURDAY("lördag"), 
	SUNDAY("söndag");

	private String swedish;

	public String getSwedish(){
		return swedish;
	} 

	DayOfWeek(String swedish) {
		this.swedish = swedish;
	}

	public static void main(String[] args) {
		for (DayOfWeek d : DayOfWeek.values()) {
			System.out.println("Day : " + d);
			System.out.println("Dag : " + d.getSwedish());
		}

		DayOfWeek today = DayOfWeek.MONDAY;
		System.out.println("Today is " + today);
		System.out.println("Idag är det " + today.getSwedish());
	}
}


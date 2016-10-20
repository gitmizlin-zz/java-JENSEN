public class Demo {
	
	public static void main (String[] args) {
		
		Composite suitcase = new Composite("suitcase", 5);
		Composite bag = new Composite("bag", 2);
		Composite pouch = new Composite("pouch", 1);
		Composite big_box = new Composite("big box", 4);
		Composite small_box = new Composite("small box", 1);
		
		Leaf jeans = new Leaf("jeans", 1);
		Leaf shampoo = new Leaf("shampoo", 1);
		Leaf conditioner = new Leaf("cond", 2);
		Leaf papper = new Leaf("paper", 30);
		Leaf ring = new Leaf("ring", 1);
		Leaf doll = new Leaf("doll", 4);
		
		bag.add(jeans);
		bag.add(papper);
		pouch.add(shampoo);
		small_box.add(ring);
		big_box.add(small_box);
		big_box.add(doll);
		
		suitcase.add(conditioner);
		suitcase.add(big_box);
		suitcase.add(bag);
		suitcase.add(pouch);
		
		System.out.println("Suite case wight: " + suitcase.getWeight());		
		System.out.println("bag wight: " + bag.getWeight());
		System.out.println("pouch wight: " + pouch.getWeight());
		System.out.println("All the names of things in suitecase: \n" + suitcase.getName());
		System.out.println("Suite case name & weight: \n" + suitcase.getAll());
		
	}

}
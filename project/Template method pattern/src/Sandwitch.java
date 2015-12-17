// A Template Method Pattern contains a method that provides
// the steps of the algorithm. It allows subclasses to override 
// some of the methods

public abstract class Sandwitch {

	// This is the Template Method
	// Declare this method final to keep subclasses from
	// changing the algorithm
	
	final void makeSandwich(){		
		cutBun();
		addMeat();
		addCheese();
		addVegetables();
		addCondiments();
		wrapSandwitch();		
	}	
	
	public void cutBun(){		
		System.out.println("The sandwitch is cut.");		
	}
	
	public void wrapSandwitch(){		
		System.out.println("\nThe Sandwitch is wrapped.");		
	}

	// These methods are overridden by the extending subclasses
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
}
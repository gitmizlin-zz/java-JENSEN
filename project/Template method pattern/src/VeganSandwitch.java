public class VeganSandwitch extends Sandwitch {

	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Carrots", "Cucumbers"};
	String[] condimentsUsed = {"Sea-salt", "Oil", "Vegan-dressing"};
		
	public void addVegetables(){		
		System.out.print("Adding a lot of vegetables: ");
		
		for (String vegetable : veggiesUsed){
			System.out.print(vegetable + " ");
		}

		System.out.println();		
	}
	
	public void addCondiments(){		
		System.out.print("Adding the vegan-condiments: ");
		
		for (String condiment : condimentsUsed){			
			System.out.print(condiment + " ");		
		}
	}

	// These method are not used in this class so override them with empty methods
	void addMeat() {}	
	void addCheese() {}
}
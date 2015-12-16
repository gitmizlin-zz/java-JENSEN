public class ItalianSandwitch extends Sandwitch {
	
	String[] meatUsed = {"Salami", "Pepperoni", "Prosciutto"};
	String[] cheeseUsed = {"Mozzarella"};
	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
	String[] condimentsUsed = {"Mustard", "Oliv oil", "Vinegar"};
	
	public void addMeat() {		
		System.out.print("Adding the Meat: ");
		
		for (String meat : meatUsed) {			
			System.out.print(meat + " ");			
		}	

		System.out.println();		
	}
	
	public void addCheese() {		
		System.out.print("Adding the Cheese: ");
		
		for (String cheese : cheeseUsed){
			System.out.print(cheese + " ");	
		}

		System.out.println();		
	}
	
	public void addVegetables() {		
		System.out.print("Adding the Vegetables: ");

		for (String vegetable : veggiesUsed){			
			System.out.print(vegetable + " ");		
		}
		System.out.println();	
	}
	
	public void addCondiments() {		
		System.out.print("Adding the Condiments: ");
		
		for (String condiment : condimentsUsed){			
			System.out.print(condiment + " ");			
		}		
	}	
}
	
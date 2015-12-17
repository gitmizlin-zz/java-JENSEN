public class SandwitchMaker {
	
	public static void main (String[] args){
		
		ItalianSandwitch iSand = new ItalianSandwitch();

        System.out.println("**** Italian sandwitch ****");
		iSand.makeSandwich();
		
		System.out.println();
		
		VeganSandwitch vSand = new VeganSandwitch();

        System.out.println("**** Vegan sandwitch ****");
        vSand.makeSandwich();
	}	
}
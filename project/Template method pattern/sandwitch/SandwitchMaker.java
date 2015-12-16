public class SandwitchMaker {
	
	public static void main (String[] args){
		
		ItalianSandwitch iSand = new ItalianSandwitch();
		
		iSand.makeSandwich();
		
		System.out.println();
		
		VeganSandwitch vSand = new VeganSandwitch();
		
		vSand.makeSandwich();		
	}	
}
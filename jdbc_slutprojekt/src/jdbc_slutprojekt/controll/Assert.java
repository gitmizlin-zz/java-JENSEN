package jdbc_slutprojekt.controll;

public class Assert {
	
	public boolean assertNotNull (String s) {
		return (s != null);
	}
	
	public boolean convertToInt (String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			System.out.println("invalid input");
			return false;
		}
	} 
}

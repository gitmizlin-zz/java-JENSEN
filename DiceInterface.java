public interface DiceInterface {

	int rand;
	int seconds;

	// slumpa fram tal
	public void roll();

	// hämta tal mellan 1-6
	public int getValue();
}

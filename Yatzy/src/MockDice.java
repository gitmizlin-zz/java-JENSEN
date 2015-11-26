package src;

public class MockDice implements DiceInterface {
	int value = 1;

	@Override
	public void roll() {
		value = value % 6;
		value++;
	}

	@Override
	public int getValue() {
		return value;
	}
}
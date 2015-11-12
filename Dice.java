// 2015-11-09
// modell (Model) för tärning

import java.util.Date

public class Dice implements DiceInterface {

	@override
	void roll() {
		seconds = calendar.get(Calendar.SECOND);
		rand = seconds % 6;
	}

	@override
	int getValue() { // get current value			
		return rand;
	}	
}

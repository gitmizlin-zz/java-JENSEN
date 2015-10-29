/*
Övning 2

Skapa ett fönster som är 1200 x 800 och har rubriken "Utforskar swing #2". Fönstret ska starta mitt på skärmen och när man stänger fönstret ska programmet avslutas.

I fönstret ska det sedan ligga tre JLabels som är 300 breda och 300 höga. Vi har ett ord i varje label så att de tillsammans bildar texten "Jag heter namn" med ditt namn. Gör texterna så stora så de fyller sina rutor. Ändra bakgrundsfärgen till blå och textens färg till vit.

Tips: Lägg alla labels i en panel.
*/

import javax.swing.*;

public class SwingTest2 extends JFrame {
	public static void main (String[] args) {
		new SwingTest2();
	}

	public SwingTest2 () { //constructor
		super();
		JFrame frame = new JFrame();
		initGui();
	}

	public void initGui() {
		JPanel panel;
		JLabel label;
		setTitle("Utforskar swing #2");
	}
}

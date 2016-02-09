/*

Övning 3
Skapa ett fönster som är 800 x 600 och har rubriken "Utforskar swing #3". Fönstret ska starta mitt på skärmen och när man stänger fönstret ska programmet avslutas.

Lägg en komponent of your choice med en bild i! Gärna en animerad gif på en katt.

Tips: Titta på klassen ImageIcon.
*/

import javax.swing.*;

public class SwingTest3 extends JFrame {
	public static void main (String[] args) {
		new SwingTest3();
	}

	SwingTest3() { // constructor
		super();
		initGui();
	}

	public void initGui() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JLabel l = new JLabel();

		setSize(800, 600);
		setTitle("Utforskar swing #3");
		setLocationRelativeTo(null);
		setVisible(true);
	}
}

/*
Övning 2

Skapa ett fönster som är 1200 x 800 och har rubriken "Utforskar swing #2". Fönstret ska starta mitt på skärmen och när man stänger fönstret ska programmet avslutas.

I fönstret ska det sedan ligga tre JLabels som är 300 breda och 300 höga. Vi har ett ord i varje label så att de tillsammans bildar texten "Jag heter namn" med ditt namn. Gör texterna så stora så de fyller sina rutor. Ändra bakgrundsfärgen till blå och textens färg till vit.

Tips: Lägg alla labels i en panel.
*/

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

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

		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		JTextField tf = new JTextField();
		f.setLayout(new BorderLayout());

		String namn = "X";

		JLabel label1 = new JLabel("Jag", SwingConstants.CENTER);
		label1.setPreferredSize(new Dimension(300, 300));
		label1.setBackground(Color.black);
		label1.setOpaque(true);

		JLabel label2 = new JLabel("heter", SwingConstants.CENTER);
		label2.setPreferredSize(new Dimension(300, 300));
		label2.setBackground(Color.green);
		label2.setOpaque(true);

		JLabel label3 = new JLabel(namn, SwingConstants.CENTER);
		label3.setPreferredSize(new Dimension(300, 300));
		label3.setBackground(Color.red);
		label3.setOpaque(true);

		panel.add(label1);
		panel.add(label2);
		panel.add(label3);

		f.getContentPane().add(BorderLayout.EAST, tf);

		this.add(panel);

		pack();

		setTitle("Utforskar swing #2");
		setSize(1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

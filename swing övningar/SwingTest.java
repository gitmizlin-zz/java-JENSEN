/*
Övning 1

Skapa ett fönster som är 1200 x 800 och har rubriken "Utforskar swing #1". Fönstret ska starta mitt på skärmen och när man stänger fönstret ska programmet avslutas.

Går det göra så fönstrets storlek är låst och inte går ändra av användaren?
Går det ändra bakgrundsfärgen på fönstret?
Kan du hitta ytterligare en eller två egenskaper du kan ändra på hos fönstret?
*/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.JLabel;

public class SwingTest extends JFrame { // *1

	public static void main(String[] args) {
		new SwingTest(); // create a new instance of *1, will call *1 constructor
	}

	public SwingTest() { // constructor of *1
		super(); // calls the parent constructor
		JFrame frame = new JFrame();
		initGui();
	}

	public void initGui() {
		JPanel panel;
		JPanel panel2;
		JLabel label;
		JLabel label2;

		setTitle("Utforskar swing #1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setSize(500, 400);
		// panel.setOpaque(true); // why does panel
		panel.setBackground(Color.red);

		panel2 = new JPanel();
		panel2.setSize(600, 400);
		// panel2.setPreferredSize(new Dimension(300, 300));// does not work. panel expands to the frame size.
		panel2.setBackground(Color.black);

		label = new JLabel("test test", SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(200, 200));
		label.setOpaque(true);
		label.setBackground(Color.green);

		label2 = new JLabel("test2 test2", SwingConstants.CENTER);
		label2.setPreferredSize(new Dimension(100, 100));
		label2.setOpaque(true);
		label2.setBackground(Color.pink);

		panel.add(label);
		panel2.add(label2);
		this.add(panel);
		this.add(panel2);

		// pack();
		setResizable(false);
		setVisible(true);
		setSize(1200, 800);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
	}

}


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticeActionListener extends JFrame implements ActionListener {
	private JLabel enterName;
	private JTextField name;
	private JButton click;
	private String storeName = "";

	public PracticeActionListener() { // constructor
		setLayout(null);
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enterName = new JLabel("Enter your name");
		click = new JButton("Click");
		name = new JTextField();
		enterName.setBounds(60, 30, 120, 30);
		name.setBounds(80, 60, 130, 30);
		click.setBounds(100, 150, 100, 30);
		click.addActionListener(this); // this: "this" action lister i implemented

		add(click);
		add(name);
		add(enterName);

		setVisible(true);
	}

	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == click) {
			storeName = name.getText();
			JOptionPane.showMessageDialog(null, "Hello " + storeName);
			System.exit(0);
		}
	}
}

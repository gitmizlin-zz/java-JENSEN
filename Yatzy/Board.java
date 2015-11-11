
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.io.File;

public class Board extends JFrame {
	JPanel panel, panel2, panel3;
	JLabel label;
	JLabel dl1, dl2, dl3, dl4, dl5;
	JButton d1, d2, d3, d4, d5;

	public Board() {
		super();
		createFrame();
	}

	public void createFrame() {
		panel = new JPanel();
		panel.setSize(600, 200);
		panel.setLocation(200, 200);
		add(panel);

		panel2 = new JPanel();
		panel2.setSize(500, 100);
		panel2.setBackground(Color.CYAN);
		add(panel2);

		dl1 = new JLabel("Roll1");
		dl2 = new JLabel("Roll2");
		dl3 = new JLabel("Roll3");
		dl4 = new JLabel("Roll4");
		dl5 = new JLabel("Roll5");

		panel2.add(dl1);
		panel2.add(dl2);
		panel2.add(dl3);
		panel2.add(dl4);
		panel2.add(dl5);

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

		d1 = new JButton("button1");
		d2 = new JButton("button2");
		d3 = new JButton("button3");
		d4 = new JButton("button4");
		d5 = new JButton("button5");

		panel3 = new JPanel();
		panel3.setSize(500, 100);
		panel3.setLocation(50, 50);
		add(panel3);

		panel3.add(d1);
		panel3.add(d2);
		panel3.add(d3);
		panel3.add(d4);
		panel3.add(d5);

		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

		label = new JLabel(new ImageIcon("bgimg.jpg"));
		panel.add(label);

		pack();

		setTitle("Yatzy");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 800);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}

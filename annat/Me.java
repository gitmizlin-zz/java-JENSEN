import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Me extends JFrame {
	JPanel mainPanel;
	JButton button;
	TextField text;
	int nrOfClicks = 0;

	Me() {
		super();
		createFrame();
	}

	public void createFrame() {
		mainPanel = new JPanel();
		add(mainPanel);

		text = new TextField(20);
		mainPanel.add(text);

		button = new JButton("click");
		button.addActionListener(new MyActionListener());
		mainPanel.add(button);

		pack();

		setTitle("Template!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 450);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Listener1 extends JFrame implements ActionListener {
	JFrame frame;
	JPanel mainPanel, imgPanel, buttonPanel;
	JRadioButton pigButton; 
	JRadioButton dogButton; 
	JRadioButton catButton; 
	JRadioButton monkeyButton; 
	JLabel label;
	ButtonGroup buttonGroup;

	Listener1() {
		super();
		createFrame();
	}

	public void createFrame() {
		mainPanel = new JPanel();
		add(mainPanel);

		imgPanel = new JPanel();
		mainPanel.add(imgPanel);

		label = new JLabel(new ImageIcon("img/monkey.jpg"));	
		imgPanel.add(label);

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		mainPanel.add(buttonPanel);

		pigButton= new JRadioButton("pig", true);
		dogButton= new JRadioButton("dog");
		catButton= new JRadioButton("cat");
		monkeyButton= new JRadioButton("monkey");

		buttonGroup = new ButtonGroup();
		buttonGroup.add(pigButton);
		buttonGroup.add(dogButton);
		buttonGroup.add(catButton);
		buttonGroup.add(monkeyButton);

		pigButton.addActionListener(this);
		dogButton.addActionListener(this);
		catButton.addActionListener(this);
		monkeyButton.addActionListener(this);

		buttonPanel.add(pigButton);
		buttonPanel.add(dogButton);
		buttonPanel.add(catButton);
		buttonPanel.add(monkeyButton);

		setTitle("Utforskar lyssnare #1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String cmd = event.getActionCommand();
		label.setIcon(new ImageIcon("img/" + cmd + ".jpg"));
		System.out.println(event);
	}
}
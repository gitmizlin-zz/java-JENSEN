import javax.swing.*;

public class SwingView implements DiceInterface implements ActionListener {
	JPanel mainPanel;
	JLabel text;
	JLabel text2;
	JLabel diceText;
	JButton rollDiceButton;
	Dice dice;

	SwingView() {
		createAndShowGui();
	}

	public void createAndShowGui() {
		mainPanel = new JPanel();
		text = new JLabel("Tärningar visar: ");
		mainPanel.add(text);
		add(mainPanel);

		diceText = new JLabel(dice.getValue());
		mainPanel.add(diceText);

		rollDiceButton = new JButton("Roll dice!")
		rollDiceButton.addActionListener(this);

		mainPanel.add(rollDiceButton);


		text2 = new JLabel("Dice as pic");

		diceImage = new JLabel();

		diceImage.setIcon(new ImageIcon(""));
		rollDiceButton2 = new JButton("Roll dice 2");

		pack();

		setVisible(true);
		setDefaultCloseOperaion(EXIT_ON_CLOSE)
	}

	@override
	public void actionPerformed(ActionEvent e) {
		dice.roll();
		diceText.setText("" + dice.getValue());

	}
}

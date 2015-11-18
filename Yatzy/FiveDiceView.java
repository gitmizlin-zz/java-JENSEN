import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class FiveDiceView extends JFrame {
	JPanel mainPanel;
	JPanel dicePanel;
	JPanel buttonPanel;
	JButton rollButton;

	Dice dice1;
	Dice dice2;
	Dice dice3;
	Dice dice4;
	Dice dice5;
	ArrayList<Dice> diceList = new ArrayList<>();

	DiceImage diceImage1;
	DiceImage diceImage2;
	DiceImage diceImage3;
	DiceImage diceImage4;
	DiceImage diceImage5;

	FiveDiceView() {
		createAndShowGui();
	}

	public void createAndShowGui() {
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.red);

		dicePanel = new JPanel();
		dicePanel.setBackground(Color.yellow);

		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.pink);

		// initiate Model for dice
		dice1 = new Dice();
		dice2 = new Dice();
		dice3 = new Dice();
		dice4 = new Dice();
		dice5 = new Dice();

		diceList.add(dice1);
		diceList.add(dice2);
		diceList.add(dice3);
		diceList.add(dice4);
		diceList.add(dice5);

		// initiate View for dice
		diceImage1 = new DiceImage();
		diceImage2 = new DiceImage();
		diceImage3 = new DiceImage();
		diceImage4 = new DiceImage();
		diceImage5 = new DiceImage();

		System.out.println(diceList);

		diceImage1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				dice1.toggleHeld();
				System.out.println(dice1.isHeld());
			}
		});

		// add a DiceImage as observer on a Dice
		dice1.addObserver(diceImage1);
		dice2.addObserver(diceImage2);
		dice3.addObserver(diceImage3);
		dice4.addObserver(diceImage4);
		dice5.addObserver(diceImage5);

		// button "Roll dice" and what occurs when it is clicked
		rollButton = new JButton("Roll dice");
		rollButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Dice dice : diceList) {
					if (!dice.isHeld()) {
						dice.roll();
					}
				}
			}
		});

		dicePanel.add(diceImage1);
		dicePanel.add(diceImage2);
		dicePanel.add(diceImage3);
		dicePanel.add(diceImage4);
		dicePanel.add(diceImage5);

		buttonPanel.add(rollButton);

		mainPanel.add(dicePanel);
		mainPanel.add(buttonPanel);

		add(mainPanel);

		pack();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
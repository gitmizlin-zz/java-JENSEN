import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

public class FiveDiceView extends JFrame implements ActionListener, MouseListener {
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
		new Rules();
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.red);
		mainPanel.add(Rules.rulePanel);

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

		diceImage1.setDiceModel(dice1);
		diceImage2.setDiceModel(dice2);
		diceImage3.setDiceModel(dice3);
		diceImage4.setDiceModel(dice4);
		diceImage5.setDiceModel(dice5);

		diceImage1.addMouseListener(this);
		diceImage2.addMouseListener(this);
		diceImage3.addMouseListener(this);
		diceImage4.addMouseListener(this);
		diceImage5.addMouseListener(this);

		// add a DiceImage as observer on a Dice
		dice1.addObserver(diceImage1);
		dice2.addObserver(diceImage2);
		dice3.addObserver(diceImage3);
		dice4.addObserver(diceImage4);
		dice5.addObserver(diceImage5);

		// button "Roll dice" and what occurs when it is clicked
		rollButton = new JButton("Roll dice");
		rollButton.addActionListener(this);

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

	public void mouseClicked(MouseEvent e) {
		// If diceImage is clicked, change "Held" status
		DiceImage diceImage = (DiceImage) e.getSource();
		Dice dice = diceImage.getDiceModel();
		dice.toggleHeld();
		int i = dice.getValue();

		if (dice.isHeld()) {
			diceImage.setIcon(DiceImage.iconsHold[i - 1]);
		} else {
			diceImage.setIcon(DiceImage.icons[i - 1]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (Dice dice : diceList) {
			if (!dice.isHeld()) {
				dice.roll();
			}
		}
		Collections.sort(diceList);
		System.out.println(diceList);
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}


}

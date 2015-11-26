

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

public class FiveDiceView extends JPanel implements ActionListener, MouseListener {
	private JPanel diceButtonPanel;
	private JPanel dicePanel;
	private JPanel buttonPanel;
	private JButton rollButton;

	private Dice dice1;
	private Dice dice2;
	private Dice dice3;
	private Dice dice4;
	private Dice dice5;

	private  ArrayList<Dice> diceList = new ArrayList<>();

	private DiceImage diceImage1;
	private DiceImage diceImage2;
	private DiceImage diceImage3;
	private DiceImage diceImage4;
	private DiceImage diceImage5;

	FiveDiceView() {
		createAndShowGui();
	}

	public void createAndShowGui() {
		diceButtonPanel = new JPanel();
		diceButtonPanel.setBackground(Color.red);
		diceButtonPanel.setLayout(new BoxLayout(diceButtonPanel, BoxLayout.Y_AXIS));

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

		// add a src.DiceImage as observer on a src.Dice
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

		diceButtonPanel.add(dicePanel);
		diceButtonPanel.add(buttonPanel);

		add(diceButtonPanel);
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
		for (Dice dice : diceList) {
			System.out.println(dice.getValue());
		}
		System.out.println("fullhouse point: " + Hand.checkFullHouse(diceList));
		System.out.println("one pair: " + Hand.checkOnePair(diceList));
		System.out.println("two paris: " + Hand.checkTwoPairs(diceList));
		System.out.println("three of a kind point: " + Hand.checkThreeOfAKind(diceList));
		System.out.println("four of a kind point: " + Hand.checkFourOfAKind(diceList));
		System.out.println("small straight: " + Hand.checkStraight(diceList, 5));
		System.out.println("large straight: " + Hand.checkStraight(diceList, 6));
		System.out.println("chance: " + Hand.checkChance(diceList));
		System.out.println("yatzy: " + Hand.checkYatzy(diceList));
		System.out.println("bonus: " + Hand.checkBonus(diceList));
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public JPanel getDiceButtonPanel() {
		return this.diceButtonPanel;
	}


}

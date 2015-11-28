import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FiveDiceView extends JPanel implements ActionListener, MouseListener {
	private JPanel diceButtonPanel;
	private JPanel dicePanel;
	private JPanel buttonPanel;
	private JButton rollButton;
    private HashMap<Dice, JLabel> diceImageHashMap = new HashMap<Dice, JLabel>();
    private ArrayList<Dice> diceList;
    private Table tableView;

	FiveDiceView(Table tableView) {
		this.tableView = tableView;
        createAndShowGui();
	}

	public void createAndShowGui() {
		diceButtonPanel = new JPanel();
		diceButtonPanel.setOpaque(false);
		diceButtonPanel.setLayout(new BoxLayout(diceButtonPanel, BoxLayout.Y_AXIS));

		dicePanel = new JPanel();
		dicePanel.setOpaque(false);;
        dicePanel.setOpaque(false);

		buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);;

        for (int i = 0; i < 5; i++) {
            JLabel diceLabel = new JLabel();
            diceLabel.setIcon(new ImageIcon(FiveDiceView.class.getResource("d1.png")));
            diceLabel.addMouseListener(this);

            diceImageHashMap.put(new Dice(), diceLabel);
            dicePanel.add(diceLabel);
        }

		// button "Roll dice" and what occurs when it is clicked
		rollButton = new JButton("Roll dice");
		rollButton.addActionListener(this);
		buttonPanel.add(rollButton);

		diceButtonPanel.add(dicePanel);
		diceButtonPanel.add(buttonPanel);

		add(diceButtonPanel);

        diceList = new ArrayList<Dice>(diceImageHashMap.keySet());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        for (Dice dice : diceImageHashMap.keySet()) {
            if (!dice.isHeld()) {
                dice.roll();
                diceImageHashMap.get(dice).setIcon(createDiceIcon(dice.getValue(), dice.isHeld()));

                updateTableScores();
            }
        }

//        Collections.sort(diceList);
        Map<Dice, JLabel> diceList2 = new TreeMap<Dice, JLabel>(diceImageHashMap);
        System.out.println(diceList2);

        for (Dice dice : diceImageHashMap.keySet()) {
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

    private void updateTableScores() {
        tableView.updateCell(Hand.checkSameValues(diceList, 1), 0, 1);
        tableView.updateCell(Hand.checkSameValues(diceList, 2), 1, 1);
        tableView.updateCell(Hand.checkSameValues(diceList, 3), 2, 1);
        tableView.updateCell(Hand.checkSameValues(diceList, 4), 3, 1);
        tableView.updateCell(Hand.checkSameValues(diceList, 5), 4, 1);
        tableView.updateCell(Hand.checkSameValues(diceList, 6), 5, 1);
        tableView.updateCell(Hand.checkSum(diceList), 6, 1);
        tableView.updateCell(Hand.checkBonus(diceList), 7, 1);
        tableView.updateCell(Hand.checkOnePair(diceList), 8, 1);
        tableView.updateCell(Hand.checkTwoPairs(diceList), 9, 1);
        tableView.updateCell(Hand.checkThreeOfAKind(diceList), 10, 1);
        tableView.updateCell(Hand.checkFourOfAKind(diceList), 11, 1);
        tableView.updateCell(Hand.checkFullHouse(diceList), 12, 1);
        tableView.updateCell(Hand.checkStraight(diceList, 5), 13, 1);
        tableView.updateCell(Hand.checkStraight(diceList, 6), 14, 1);
        tableView.updateCell(Hand.checkChance(diceList), 15, 1);
        tableView.updateCell(Hand.checkYatzy(diceList), 16, 1);
        tableView.updateCell(Hand.checkGrandTotal(diceList), 17, 1);
    }

	public JPanel getDiceButtonPanel() {
		return this.diceButtonPanel;
	}

    private ImageIcon createDiceIcon(int number, boolean held) {
        return new ImageIcon(FiveDiceView.class.getResource("d" + number + (held ? "hold" : "") + ".png"));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel diceLabel = (JLabel) e.getSource();
        Dice dice;

        for (Entry<Dice, JLabel> entry : diceImageHashMap.entrySet()) {
            if (entry.getValue().equals(diceLabel)) {
                dice = entry.getKey();
                dice.toggleHeld();
                diceLabel.setIcon(createDiceIcon(dice.getValue(), dice.isHeld()));
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

}

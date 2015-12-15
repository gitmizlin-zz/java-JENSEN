import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.Map.Entry;

public class FiveDiceView extends JPanel implements ActionListener, MouseListener {
	private JPanel diceButtonPanel;
	private JPanel dicePanel;
	private JPanel buttonPanel;
	private JButton rollButton;
    private HashMap<Dice, JLabel> diceImageHashMap = new HashMap<Dice, JLabel>();
    private ArrayList<Dice> diceList;
    private Table tableView;
    private int turnCount = 0;

	FiveDiceView(Table tableView) {
		this.tableView = tableView;
        createAndShowGui();
	}

	public void createAndShowGui() {
		diceButtonPanel = new JPanel();
		diceButtonPanel.setOpaque(false);
		diceButtonPanel.setLayout(new BoxLayout(diceButtonPanel, BoxLayout.Y_AXIS));

		dicePanel = new JPanel();
		dicePanel.setOpaque(false);

		buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);

        for (int i = 0; i < 5; i++) {
            JLabel diceLabel = new JLabel();
            diceLabel.setIcon(new ImageIcon(FiveDiceView.class.getResource("d_default.png")));
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

        for (Dice dice : diceList) {
            dice.setValue(0);
        }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        if (turnCount >= 3) {
            JOptionPane.showMessageDialog(null, "You have already thrown dice three times. " +
                    "Choose a hand before next turn.");
        } else {
            tableView.setRowSelected(false);
            for (Dice dice : diceImageHashMap.keySet()) {
                if (!dice.isHeld()) {
                    dice.roll();

                    diceImageHashMap.get(dice).setIcon(createDiceIcon(dice.getValue(), dice.isHeld()));
                }
            }

            Collections.sort(diceList);
            tableView.updateScores(diceList);

            for (Dice dice : diceImageHashMap.keySet()) {
                System.out.println(dice.getValue());
            }

            turnCount++;
        }
    }

	public JPanel getDiceButtonPanel() {
		return this.diceButtonPanel;
	}

    private ImageIcon createDiceIcon(int number, boolean held) {
        if (number == 0) {
            return new ImageIcon(FiveDiceView.class.getResource("d_default.png"));
        } else {
            return new ImageIcon(FiveDiceView.class.getResource("d" + number + (held ? "hold" : "") + ".png"));
        }
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

    public void resetTurnCount() {
        turnCount = 0;
    }

    public void resetDice() {
        for (Dice dice : diceImageHashMap.keySet()) {
            dice.resetHold();
            dice.setValue(0);
            diceImageHashMap.get(dice).setIcon(createDiceIcon(0, false));
        }
    }
}

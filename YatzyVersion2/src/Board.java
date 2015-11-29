import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
	private JPanel mainPanel;
    private FiveDiceView diceView;

    public Board() {
		super();

		setPreferredSize(new Dimension(800, 600));
		setTitle("Play Yatzy!");

		mainPanel = new JPanel();

        add(mainPanel);
        mainPanel.setBackground(Color.yellow);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		Rules rulesView = new Rules();
		Table tableView = new Table(this);
        diceView = new FiveDiceView(tableView);

        mainPanel.add(tableView.getTablePanel());
        tableView.getTablePanel().add(rulesView.getRulePanel());
		mainPanel.add(diceView.getDiceButtonPanel());

		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

    public void scoreSelected () { // Callback. Table tells Board that score is selected. Bord then tells FiveDiceView to reset turnCount.
        diceView.resetTurnCount();
        diceView.resetDice();
    }
}
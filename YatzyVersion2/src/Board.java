import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JFrame {
	private JFrame frame;
	private JPanel mainPanel;

	public Board(ArrayList<Player> playerList) {
		super();
		frame = new JFrame();
		setPreferredSize(new Dimension(800, 600));
		setTitle("Play Yatzy!");

		mainPanel = new JPanel();
		mainPanel.setBackground(Color.DARK_GRAY);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		add(mainPanel);

		FiveDiceView diceView = new FiveDiceView();
		Rules rulesView = new Rules();
		Table tableView = new Table(playerList);
		Status statusView = new Status();

		mainPanel.add(statusView.getStatusPanel());
		mainPanel.add(tableView.getTablePanel());
		mainPanel.add(rulesView.getRulePanel());
		mainPanel.add(diceView.getDiceButtonPanel());

		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
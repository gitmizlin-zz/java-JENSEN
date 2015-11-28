
import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
	private JFrame frame;
	private JPanel mainPanel;

	public Board() {
		super();
		frame = new JFrame();
		setPreferredSize(new Dimension(800, 600));
		setTitle("Play src.Yatzy!");

		mainPanel = new JPanel();
		mainPanel.setBackground(Color.DARK_GRAY);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		add(mainPanel);

		FiveDiceView diceView = new src.FiveDiceView();
		Rules rulesView = new Rules();
		Table tableView = new Table();
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
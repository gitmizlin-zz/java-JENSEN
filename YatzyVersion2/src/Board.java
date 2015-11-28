import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
	private JPanel mainPanel;

	public Board() {
		super();

		setPreferredSize(new Dimension(800, 600));
		setTitle("Play Yatzy!");

		mainPanel = new JPanel();

        add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.ORANGE);

		Rules rulesView = new Rules();
		Table tableView = new Table();
        FiveDiceView diceView = new FiveDiceView(tableView);

        mainPanel.add(tableView.getTablePanel());
        tableView.getTablePanel().add(rulesView.getRulePanel());
		mainPanel.add(diceView.getDiceButtonPanel());


		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


}
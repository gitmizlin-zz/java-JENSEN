import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.io.IOException;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Board extends JFrame {
	JPanel mainPanel, tablePanel, dicePanel, tableAndDicePanel;
	JButton dButton, rollButton, readRules;
	JTable table;
	ArrayList<Die> dieList;
	HashMap<Die, JButton> dieAndButtonMap;

	public Board() {
		super();
		createFrame();
	}

	public void createFrame() {
		mainPanel = new JPanel();
		add(mainPanel);

		tableAndDicePanel = new JPanel();
		tableAndDicePanel.setLayout(new BoxLayout(tableAndDicePanel, BoxLayout.X_AXIS)); 	
		mainPanel.add(tableAndDicePanel);

		tablePanel = new JPanel();	
		mainPanel.add(tablePanel);

		table = new JTable(17, 2);
		tablePanel.setSize(600, 400);
		tablePanel.add(table);		

		dicePanel = new JPanel();
		dicePanel.setLayout(new BoxLayout(dicePanel, BoxLayout.X_AXIS));
		tableAndDicePanel.add(tablePanel);
		tableAndDicePanel.add(dicePanel);

		table.setValueAt("Combination",0,0);
		table.setValueAt("Ones",1,0);
		table.setValueAt("Twos",2,0);
		table.setValueAt("Threes",3,0);
		table.setValueAt("Fours",4,0);
		table.setValueAt("Fives",5,0);
		table.setValueAt("Sixes",6,0);
		table.setValueAt("Bonus",7,0);
		table.setValueAt("One pair",8,0);
		table.setValueAt("Two pairs", 9,0);
		table.setValueAt("Three-of-a-kind",10,0);
		table.setValueAt("Four-of-a-kind",11,0);
		table.setValueAt("Small straight",12,0);
		table.setValueAt("Full house",13,0);
		table.setValueAt("Chance",14,0);
		table.setValueAt("Yatzy",15,0);
		table.setValueAt("Tot",16,0);

		table.setRowHeight(30);

		dieList = new ArrayList<Die>();
		dieAndButtonMap = new HashMap<Die, JButton>();

		int i = 1;
		while (i <= 5) {
			Die die = new Die (i, false);
			dButton = new JButton();
			dButton.setIcon(new ImageIcon("img/d" + i + ".png"));
			dButton.addActionListener(new InnerListener(die));
			dieList.add(die);

			dieAndButtonMap.put(die, dButton);
			dicePanel.add(dButton);
			i++;
		}

		rollButton = new JButton("Roll dice");
		rollButton.addActionListener(new RollInnerLister());
		mainPanel.add(rollButton);

		readRules = new JButton("Read rules");
		mainPanel.add(readRules);

		pack();

		setTitle("Yatzy");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	class RollInnerLister implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			for (Die die : dieList) {
				if (!die.isHeld()) {
					die.roll();
					int i = die.getFaceUp();
					dieAndButtonMap.get(die).setIcon(new ImageIcon("img/d" + i + ".png"));
				}
			}
		}
	}

	class InnerListener implements ActionListener {
		private Die die;

		InnerListener(Die die) {
			this.die = die;
		}
		public void actionPerformed(ActionEvent event) {
			int faceNr = die.getFaceUp();
			JButton button = (JButton) event.getSource();
			die.toggleHeld();
			button.setIcon(new ImageIcon("img/d" + faceNr + (die.isHeld() ? "hold" : "") + ".png"));
		}
	}
}

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Board extends JFrame implements ActionListener  {
	JPanel mainPanel, tablePanel, dicePanel, tableAndDicePanel;
	JLabel label;
	JLabel dl1, dl2, dl3, dl4, dl5;
	JButton die, rollButton, readRules;
	JTable table;
	ArrayList<JButton> dieList;

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

		dieList = new ArrayList<>();
		int i = 1;
		while (i <= 5) {
			die = new JButton(i, false);
			die.setIcon(new ImageIcon("img/d" + i + ".png"));
			die.addActionListener(this);
			dieList.add(die);
			dicePanel.add(die);
			i++;
		}

		dl1 = new JLabel("Roll1");	
		dl2 = new JLabel("Roll2");
		dl3 = new JLabel("Roll3");
		dl4 = new JLabel("Roll4");
		dl5 = new JLabel("Roll5");

		rollButton = new JButton("Roll dice");
		mainPanel.add(rollButton);

		readRules = new JButton("Read rules");
		readRules.addActionListener(this);
		mainPanel.add(readRules);

		pack();

		setTitle("Yatzy");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		int n = dieList.indexOf(button) + 1;
		if (held) {
			button.setIcon(new ImageIcon("img/d" + n + ".png"));
		} else {
			button.setIcon(new ImageIcon("img/d" + n + "hold.png"));
		}
	}

//	@Override
//	public void actionPerformed(ActionEvent event) {
//		JOptionPane.showMessageDialog(null, "rules here", "Yatzy Rules", 1);
//	}
}

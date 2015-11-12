import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.File;
import javax.swing.table.DefaultTableModel;

public class Board extends JFrame implements ActionListener  {
	JPanel mainPanel, tablePanel, dicePanel, tableAndDicePanel, panelD1, panelD2, panelD3, panelD4, panelD5;
	JLabel label;
	JLabel dl1, dl2, dl3, dl4, dl5;
	JButton d1, d2, d3, d4, d5, rollButton, readRules;
	JTable table;

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

		panelD1 = new JPanel();
		panelD2 = new JPanel();
		panelD3 = new JPanel();
		panelD4 = new JPanel();
		panelD5 = new JPanel();

		d1 = new JButton();
		d1.setIcon(new ImageIcon("img/dice1.png"));

		d2 = new JButton();
		d2.setIcon(new ImageIcon("img/dice1.png"));
		d3 = new JButton();
		d3.setIcon(new ImageIcon("img/dice1.png"));
		d4 = new JButton();
		d4.setIcon(new ImageIcon("img/dice1.png"));
		d5 = new JButton();
		d5.setIcon(new ImageIcon("img/dice1.png"));

		dl1 = new JLabel("Roll1");	
		dl2 = new JLabel("Roll2");
		dl3 = new JLabel("Roll3");
		dl4 = new JLabel("Roll4");
		dl5 = new JLabel("Roll5");

		panelD1.add(d1);
		panelD1.setLayout(new BoxLayout(panelD1, BoxLayout.Y_AXIS));
		panelD1.add(dl1);

		panelD2.add(d2);
		panelD2.setLayout(new BoxLayout(panelD2, BoxLayout.Y_AXIS));
		panelD2.add(dl2);

		panelD3.add(d3);
		panelD3.setLayout(new BoxLayout(panelD3, BoxLayout.Y_AXIS));
		panelD3.add(dl3);

		panelD4.add(d4);		
		panelD4.setLayout(new BoxLayout(panelD4, BoxLayout.Y_AXIS));
		panelD4.add(dl4);

		panelD5.add(d5);
		panelD5.setLayout(new BoxLayout(panelD5, BoxLayout.Y_AXIS));
		panelD5.add(dl5);

		dicePanel.add(panelD1);
		dicePanel.add(panelD2);
		dicePanel.add(panelD3);
		dicePanel.add(panelD4);
		dicePanel.add(panelD5);

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
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "rules here", "Yatzy Rules", 1);
	}
}

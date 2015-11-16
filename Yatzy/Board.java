import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;
import java.io.File;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.PlainDocument;

public class Board extends JFrame {
	JPanel mainPanel, tablePanel, dicePanel, tableAndDicePanel, onesPanel, twosPanel, threesPanel, foursPanel, fivesPanel, sixesPanel, threeOfAKindPanel;
	JButton dButton, rollButton, readRulesButton;
	JLabel ones, onesPoint, twos, twosPoint, threes, threesPoint, fours, foursPoint, fives, fivesPoint, sixes, sixesPoint, threeOfAKind, threeOfAKindPoint;
	JTextArea ruleArea;
	ArrayList<Die> dieList;
	HashMap<Die, JButton> dieAndButtonMap;

	public Board() {
		super();
		createFrame();
	}

	public void createFrame() {
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.black);
		add(mainPanel);

		tableAndDicePanel = new JPanel();
		tableAndDicePanel.setLayout(new BoxLayout(tableAndDicePanel, BoxLayout.X_AXIS)); 	
		mainPanel.add(tableAndDicePanel);

		tablePanel = new JPanel();
		tablePanel.setLayout(new BoxLayout(tablePanel, BoxLayout.Y_AXIS));
		mainPanel.add(tablePanel);

		dicePanel = new JPanel();
		dicePanel.setLayout(new BoxLayout(dicePanel, BoxLayout.X_AXIS));
		tableAndDicePanel.add(tablePanel);
		tableAndDicePanel.add(dicePanel);

		ones = new JLabel("Ones: ");
		onesPoint = new JLabel("           ");
		onesPanel = new JPanel();
		onesPanel.add(ones);
		onesPanel.add(onesPoint);
		tablePanel.add(onesPanel);

		twos = new JLabel("Twos: ");
		twosPoint = new JLabel("           ");
		twosPanel = new JPanel();
		twosPanel.add(twos);
		twosPanel.add(twosPoint);
		tablePanel.add(twosPanel);

		threes = new JLabel("Threes: ");
		threesPoint = new JLabel("           ");
		threesPanel = new JPanel();
		threesPanel.add(threes);
		threesPanel.add(threesPoint);
		tablePanel.add(threesPanel);

		fours = new JLabel("Fours: ");
		foursPoint = new JLabel("           ");
		foursPanel = new JPanel();
		foursPanel.add(fours);
		foursPanel.add(foursPoint);
		tablePanel.add(foursPanel);

		fives = new JLabel("Fives: ");
		fivesPoint = new JLabel("           ");
		fivesPanel = new JPanel();
		fivesPanel.add(fives);
		fivesPanel.add(fivesPoint);
		tablePanel.add(fivesPanel);

		sixes = new JLabel("Sixes: ");
		sixesPoint = new JLabel("           ");
		sixesPanel = new JPanel();
		sixesPanel.add(sixes);
		sixesPanel.add(sixesPoint);
		tablePanel.add(sixesPanel);

		threeOfAKind = new JLabel("Three of a kind: ");
		threeOfAKindPoint = new JLabel("           ");
		threeOfAKindPanel = new JPanel();
		threeOfAKindPanel.add(threeOfAKind);
		threeOfAKindPanel.add(threeOfAKindPoint);
		tablePanel.add(threeOfAKindPanel);

		tablePanel.setBackground(Color.pink);

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
			dButton.setPreferredSize(new Dimension(120, 120));
			dButton.setOpaque(false);
			dButton.setContentAreaFilled(false);
			dButton.setBorderPainted(false);
			i++;
		}

		rollButton = new JButton("Roll dice");
		rollButton.addActionListener(new RollInnerLister());
		mainPanel.add(rollButton);

		readRulesButton = new JButton("Read rules");
		readRulesButton.addActionListener(new RulesInnerListener());
		mainPanel.add(readRulesButton);

		pack();

		setTitle("Yatzy");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	class RollInnerLister extends Hand implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			for (Die die : dieList) {
				if (!die.isHeld()) {
					die.roll();
					int i = die.getFaceUp();
					dieAndButtonMap.get(die).setIcon(new ImageIcon("img/d" + i + ".png"));
				}
			}

			onesPoint.setText(String.valueOf(checkOnes(dieList)));
			twosPoint.setText(String.valueOf(checkTwos(dieList)));
			threesPoint.setText(String.valueOf(checkThrees(dieList)));
			foursPoint.setText(String.valueOf(checkFours(dieList)));
			fivesPoint.setText(String.valueOf(checkFives(dieList)));
			sixesPoint.setText(String.valueOf(checkSixes(dieList)));
			threeOfAKindPoint.setText(String.valueOf(checkThreeOfAKind(dieList)));
		}
	}

	class RulesInnerListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			List<String> records = new ArrayList<String>();
			String filename = "yatzyrules.txt";

			try {
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				String line;
				while ((line = reader.readLine()) != null) {
					records.add(line);
				}
				String listString = "";

				for (String s : records) {
					listString += s + "\t";
				}
				ruleArea = new JTextArea(null, listString, 20, 20);
				mainPanel.add(ruleArea);
				reader.close();

			} catch (Exception e) {
				System.err.format("Exception occurred trying to read '%s'.", filename);
				e.printStackTrace();
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

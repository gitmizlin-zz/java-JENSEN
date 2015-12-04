import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Table extends JPanel {
    private JTable table;
    private JPanel tablePanel;
    private ArrayList<Boolean> fixedRows = new ArrayList<Boolean>();
    private Board board; // reference to Board (already created, just reference)

    Table(Board board) {
        this.board = board;
        table = new JTable(new MyTableModel());

        table.setDefaultRenderer(table.getColumnClass(0), new TableCellRenderer(fixedRows));

        tablePanel = new JPanel();
        tablePanel.add(new JScrollPane(table));
        tablePanel.setOpaque(false);

        for (int i = 0; i < 18; i++) {
            fixedRows.add(false); // Changes to true when score is fixed for the hand in the row.
        }

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable target = (JTable) e.getSource();
                    int row = target.getSelectedRow();

                    if (row != 6 && row != 7 && row != 17) {
                        if (fixedRows.get(row)) {
                            JOptionPane.showMessageDialog(null, "This hand is already selected. Choose another hand.");
                        } else {
                            fixedRows.set(row, true);
                        }

                        int sum = 0;
                        for (int i = 0; i < fixedRows.size(); i++) {
                            if (i < 6 && fixedRows.get(i)) {
                                sum += (Integer) table.getModel().getValueAt(i, 1);
                            }
                        }
                        updateCell(sum, 6, 1);

                        int bonus = 0;
                        if (sum >= 63) bonus = 50;
                        updateCell(bonus, 7, 1);

                        int sum2 = 0;
                        for (int i = 8; i < fixedRows.size(); i++) {
                            if (i < 17 && fixedRows.get(i)) {
                                sum2 += (Integer) table.getModel().getValueAt(i, 1);
                            }
                        }

                        int grandTotal = sum + bonus + sum2;
                        updateCell(grandTotal, 17, 1);

                        // if fixedRows 0-5 and 8-16 are true, game end
                        int count = 0;
                        for (Boolean b : fixedRows) {
                            if (b) {
                                count++;
                            }
                        }

                        table.repaint();


                        if (count >= 15) {
                            JOptionPane.showMessageDialog(null, "Game end. Your score: " + grandTotal);

                        } else {
                            board.scoreSelected();

                            // set the unselected scores to 0

                            for (int k = 0; k < fixedRows.size(); k++) {
                                if (k != 6 && k != 7 && k != 17 && k != row && !fixedRows.get(k)) {
                                    updateCell(0, k, 1);
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    class MyTableModel extends AbstractTableModel {
        private String[] columnNames = {"Hands", "Your score"};
        Object[][] data = {
                {"Ones", ""},
                {"Twos", ""},
                {"Threes", ""},
                {"Fours", ""},
                {"Fives", ""},
                {"Sixes", ""},
                {"Sum", ""},
                {"Bonus", ""},
                {"One pair", ""},
                {"Two Pairs", ""},
                {"3 of a kind", ""},
                {"4 of a kind", ""},
                {"Full House", ""},
                {"Small Straight", ""},
                {"Large Straight", ""},
                {"Chance", ""},
                {"Yatzy", ""},
                {"Total Score", ""},
        };

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return data.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        public void setValueAt(Object value, int row, int col) {
            data[row][col] = value;
            fireTableCellUpdated(row, col);
        }
    }

    public JPanel getTablePanel() {
        return this.tablePanel;
    }

    private void updateCell(int value, int row, int col) {
        if (fixedRows.get(row) == false) {
            table.getModel().setValueAt(new Integer(value), row, col);
        }
    }

    public void updateScores(ArrayList<Dice> diceList) {
        if (!fixedRows.get(0)) updateCell(Hand.checkSameValues(diceList, 1), 0, 1);
        if (!fixedRows.get(1)) updateCell(Hand.checkSameValues(diceList, 2), 1, 1);
        if (!fixedRows.get(2)) updateCell(Hand.checkSameValues(diceList, 3), 2, 1);
        if (!fixedRows.get(3)) updateCell(Hand.checkSameValues(diceList, 4), 3, 1);
        if (!fixedRows.get(4)) updateCell(Hand.checkSameValues(diceList, 5), 4, 1);
        if (!fixedRows.get(5)) updateCell(Hand.checkSameValues(diceList, 6), 5, 1);

//        updateCell(Hand.checkSum(diceList), 6, 1);
//        updateCell(Hand.checkBonus(diceList), 7, 1);
        if (!fixedRows.get(8)) updateCell(Hand.checkOnePair(diceList), 8, 1);
        if (!fixedRows.get(9)) updateCell(Hand.checkTwoPairs(diceList), 9, 1);
        if (!fixedRows.get(10)) updateCell(Hand.checkThreeOfAKind(diceList), 10, 1);
        if (!fixedRows.get(11)) updateCell(Hand.checkFourOfAKind(diceList), 11, 1);
        if (!fixedRows.get(12)) updateCell(Hand.checkFullHouse(diceList), 12, 1);
        if (!fixedRows.get(13)) updateCell(Hand.checkStraight(diceList, 5), 13, 1);
        if (!fixedRows.get(14)) updateCell(Hand.checkStraight(diceList, 6), 14, 1);
        if (!fixedRows.get(15)) updateCell(Hand.checkChance(diceList), 15, 1);
        if (!fixedRows.get(16)) updateCell(Hand.checkYatzy(diceList), 16, 1);

//        updateCell(Hand.checkGrandTotal(diceList), 17, 1);
    }
}



import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Table extends JPanel {
    private JTable table;
    private JPanel tablePanel;

    Table(ArrayList<Player> playerList) {
        table = new JTable(new MyTableModel());
        tablePanel = new JPanel();
        tablePanel.add(new JScrollPane(table));
    }

    class MyTableModel extends AbstractTableModel {
        private String columName1 = p1.getName();
        private String columName2 = p2.getName();

        private String[] columnNames = {"", columName1, columName2};
        private Object[][] data = {
            {"Ones", "", ""},
            {"Twos", "", ""},
            {"Threes", "", ""},
            {"Fours", "", ""},
            {"Fives", "", ""},
            {"Sixes", "", ""},
            {"Sum", "", ""},
            {"Bonus", "", ""},
            {"3 of a kind", "", ""},
            {"4 of a kind", "", ""},
            {"Full House", "", ""},
            {"Small Straight", "", ""},
            {"Large Straight", "", ""},
            {"Chance", "", ""},
            {"src.Yatzy", "", ""},
            {"Total Score", "", ""},
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
    Table() {
        this();
    }

    public JPanel getTablePanel() {
        return this.tablePanel;
    }
}

import javax.swing.*;
import java.awt.*;
import javax.swing.table.AbstractTableModel;
import java.util.Observable;
import java.util.Observer;

public class Table extends JPanel {
    private JTable table;
    private JPanel tablePanel;

    Table() {
        table = new JTable(new MyTableModel());        
        tablePanel = new JPanel();
        tablePanel.add(new JScrollPane(table));
    }

    class MyTableModel extends AbstractTableModel implements Observer { 
        private String[] columnNames = {"", "You", "Bill"};
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
            {"Yatzy", "", ""},
            {"Total Score", "", ""},
        };

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            GameModel model ) GameModel.getInstance*return data.length;
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
}

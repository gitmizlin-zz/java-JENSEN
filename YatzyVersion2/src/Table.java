import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class Table extends JPanel {
    private JTable table;
    private JPanel tablePanel;

    Table() {
        table = new JTable(new MyTableModel());
        table.setBackground(Color.white);
        tablePanel = new JPanel();
        tablePanel.add(new JScrollPane(table));
        tablePanel.setOpaque(false);
    }

    class MyTableModel extends AbstractTableModel {
        private String[] columnNames = {"Hands", "Your score (col1)"};
        private Object[][] data = {
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

    public void updateCell(int value, int row, int col) {
        table.getModel().setValueAt(new Integer(value), row, col);
    }
//
//    public Component prepareRenderer (TableCellRenderer renderer, int index_row, int index_col) {
//        Component comp = table.prepareRenderer();
//
//        if (index_row < 20) {
//            comp.setBackground(new Color(204,255,204));
//
//        } else {
//            comp.setBackground(Color.CYAN);
//        }
//
//        if(isCellSelected(index_row, index_col)){
//            comp.setBackground(new Color(0, 0, 112));
//
//        }
//        return comp;
//    }
}

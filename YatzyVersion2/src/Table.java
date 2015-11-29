import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Table extends JPanel {
    private JTable table;
    private JPanel tablePanel;
    private ArrayList<Boolean> clickedRows = new ArrayList<Boolean>();

    Table() {
        table = new JTable(new MyTableModel());
        tablePanel = new JPanel();
        tablePanel.add(new JScrollPane(table));
        tablePanel.setOpaque(false);

        for (int i = 0; i < 18; i++) {
            clickedRows.add(false);
        }

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable target = (JTable) e.getSource();
                    int row = target.getSelectedRow();
                    System.out.println("clicked row: " + row);
                    clickedRows.set(row, true);
                }
            }
        });

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
        if (clickedRows.get(row) == false) {
            table.getModel().setValueAt(new Integer(value), row, col);
        }
    }

}

// Source:
// http://stackoverflow.com/questions/15607779/how-to-change-the-color-of-a-jtable-entire-row-having-a-particular-column-value

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

class TableCellRenderer extends DefaultTableCellRenderer {
    private ArrayList<Boolean> clickedRows;

    public TableCellRenderer(ArrayList<Boolean> clickedRows) {
        this.clickedRows = clickedRows;
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        if (clickedRows.get(row)) {
            setBackground(Color.YELLOW);
        } else {
            setBackground(Color.WHITE);
        }

        return this;
    }
}
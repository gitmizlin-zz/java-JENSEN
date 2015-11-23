import javax.swing.*;
import java.awt.*;

public class Table extends JPanel {
    private JPanel tablePanel;
    private  JTable table;

    Table() {
        tablePanel = new JPanel();
        tablePanel.setBackground(Color.GREEN);

        table = new JTable(20, 3);
        table.setPreferredSize(new Dimension(200, 400));
        tablePanel.add(table);
    }

    public JPanel getTablePanel() {
        return this.tablePanel;
    }
}

// Använd mouse Lister för att kunna klicka celler

// observer:gameModel  observable: points

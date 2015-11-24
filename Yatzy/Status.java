import javax.swing.*;
import java.awt.*;

public class Status extends JPanel {
    private JPanel statusPanel;
    private JLabel statusLabel;

    Status() {
        statusPanel = new JPanel();
        statusLabel = new JLabel("Status");
        statusPanel.setBackground(Color.MAGENTA);
        add(statusLabel);
        setOpaque(false);
        setVisible(true);
    }

    public JPanel getStatusPanel() {
        return statusPanel;
    }
}

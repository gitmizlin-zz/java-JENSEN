

import javax.swing.*;
import java.awt.*;

public class Status extends JPanel {
    private JPanel statusPanel;
    private JLabel statusLabel;
    private String statusText;

    Status() {
        statusText = "Status";
        statusPanel = new JPanel();
        statusLabel = new JLabel(statusText);
        statusPanel.setBackground(Color.MAGENTA);
        statusPanel.add(statusLabel);
        setOpaque(false);
        setVisible(true);
    }

    public JPanel getStatusPanel() {
        return statusPanel;
    }

    public void changeSatusText(String text) {
        statusLabel.setText(text);
    }

}

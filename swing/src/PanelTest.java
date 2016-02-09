import javax.swing.*;
import java.awt.*;

/**
 * Created by mizlin on 12/01/2016.
 */
public class PanelTest extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hi", 166, 222); // int int : starting point of the text
    }
}

import javafx.scene.layout.Pane;
import javax.swing.*;
import java.awt.*;

/**
 * Created by mizlin on 12/01/2016.
 */
public class FrameTest extends JFrame {
    public FrameTest() { // constructor
        setTitle("Title text here");
        setSize(300, 400);
        setLocation(100, 700);

        PanelTest panel = new PanelTest();
        Container c = getContentPane(); // Returns the contentPane object for this frame.
        c.add(panel);
    }
}

import javax.swing.*;

public class MyJFrame extends JFrame {
  // instance variables
  JPanel panel;
  JLabel label;

  public MyJFrame() {
    super(); // calls the parent constructor with no arguments
    initGui();
  }

  public void initGui() {
    this.setTitle("Titel på fönstret");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel = new JPanel();
    label = new JLabel("A JLabel!");
    panel.add(label);
    this.add(panel); // this = "this panel's"

    pack();
    setVisible(true);
    setSize(400, 400);
  }
}

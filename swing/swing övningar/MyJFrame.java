
import javax.swing.*;

public class MyJFrame extends JFrame {

    public static void main(String[] args) {
        MyJFrame myFrame = new MyJFrame();
    }

    // Instansvariabler
    JPanel panel;
    JLabel label;

    // Konstruktor
    public MyJFrame () {
        super();
        initGui();
    }

    public void initGui() {
        // Ställ in fönstret
        setTitle("Titel på fönster");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Skapa och lägga till komponenter
        panel = new JPanel();
        label = new JLabel("En JLabel");
        panel.add(label);

        // Lägg till panelen med komponenter i fönstret
        this.add(panel);

        // Visa upp fönstret
        pack();
        setVisible(true);
        setSize(1200, 800);
    }

}



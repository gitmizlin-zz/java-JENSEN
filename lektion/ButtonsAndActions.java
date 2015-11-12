import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by oscar on 2015-10-29.
 */
public class ButtonsAndActions extends JFrame implements ActionListener {

    // initGui
    // createFrame
    // initWindow

    JPanel mainPanel;
    JButton button;
    JButton button2;
    JButton button3;
    JButton button4;

    public ButtonsAndActions() {
        super();
        createFrame();
    }

    public void createFrame() {
        // All kod för att skapa och sätta samman ett fönster (dvs ett JFrame)
        mainPanel = new JPanel();
        add(mainPanel);


        button = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3sssss");
        button4 = new JButton("Button 4");

        // Var har vi kod för lyssnaren?
        /*  Var?                                                 argument till addXXXListener()
        Ny klass, class MyXXXListener implements XXXListener{}   new MyXXXListener()
        Anonym klass                                             new XXXListner() {  //metoder }
        I samma klass: class MyFrame extends JFrame impleme...   this
        En inre klass (en klass i klassen)
        */
        button.addActionListener(this);
        button2.addActionListener(this);

        button3.addActionListener(new InnerListener());

        button4.addActionListener(this); // programmet körs och denna kod funkar
        button4.addActionListener(new InnerListener()); // programmet körs men denna kod funkar inte

        mainPanel.add(button);
        mainPanel.add(button2);
        mainPanel.add(button3);
        mainPanel.add(button4);

        pack();

        setTitle("Title");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null); //Centrerar fönstret mitt på skärmen
        setVisible(true);
    }

    class InnerListener implements ActionListener {
        // button color changes standard -> red -> yellow
        Color otherColor = Color.red;
        Color tempColor = Color.yellow;
        Color tempColor2;
        public void actionPerformed(ActionEvent event) {
            tempColor2 = tempColor;
            tempColor = ((JButton)event.getSource()).getBackground();
            ((JButton)event.getSource()).setBackground(otherColor);
            otherColor = tempColor2;
            tempColor2 = tempColor;

            System.out.println("Inre lyssnares actionPerformed");
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // Kod för vad som ska hända om man klickar på button eller button2

        // Knappen vi klickade på är event.getSource()

        // __KNAPPEN____
        //event.getSource().setBackground(Color.black);
        JComponent theButton = (JComponent)event.getSource();
        theButton.setBackground(Color.black);

        System.out.println("Klassens lyssnares actionPerformed");
    }
}

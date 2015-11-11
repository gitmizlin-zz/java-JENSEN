
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by oscar on 2015-10-29.
 */
public class EventDemo extends JFrame implements ActionListener {

    // initGui
    // createFrame
    // initWindow

    JPanel mainPanel;
    JButton button;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;


    public EventDemo() { // constructor
        super();
        createFrame();
    }

    public void createFrame() {
        // All kod för att skapa och sätta samman ett fönster (dvs ett JFrame)
        mainPanel = new JPanel();
        add(mainPanel);

        button = new JButton("Click here!");
        button.addActionListener(new MyActionListener());
        mainPanel.add(button);

        button2 = new JButton("I want to change this text!");
        // Anonym inre klass
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                System.out.println("TEST!");
                button2.setText("I changed! Eureka!");
            }
        });
        mainPanel.add(button2);

        button3 = new JButton("Third button!");
        MyActionListener myActionListener = new MyActionListener();
        button3.addActionListener(myActionListener);
        mainPanel.add(button3);

        button4 = new JButton("My actionlistener is this window!");
        button4.addActionListener(this);
        button4.setActionCommand("knapp4");
        mainPanel.add(button4);

        button5 = new JButton("My actionlistener is also same window, but I want different behavior!");
        button5.addActionListener(this);
        button5.setActionCommand("knapp5");
        mainPanel.add(button5);

        pack();

        setTitle("Title");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null); //Centrerar fönstret mitt på skärmen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        // Olika sätt att undersöka vilken knapp som klickades på
        // Alternativ 1
//        if(event.getActionCommand().equals("knapp4")) {
//            button4.setBackground(Color.blue);
//        } else if (event.getActionCommand().equals("knapp5")) {
//            button5.setBackground(Color.red);
//        }

        // Alternativ 2
        if(event.getSource() == button4) {
            button4.setBackground(Color.blue);
        } else if (event.getSource() == button5) {
            button5.setBackground(Color.red);
        }
​
        System.out.println("event = " + event.toString());
        System.out.println("getActionCommand() = " + event.getActionCommand());
        System.out.println("getSource() = " + event.getSource());
        System.out.println("getId() = " + event.getID());
​
​
        // Hur kan vi göra koden flexibel -
        // så att det blir knappen vi klickar på vi ändrar färg på!
    }
}

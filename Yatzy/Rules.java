import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Rules extends JFrame {
    static JPanel rulePanel;
    JButton ruleButton;
    JTextArea textArea;

    Rules() {
        rulePanel = new JPanel();
        rulePanel.setBackground(Color.BLUE);
        add(rulePanel);

        ruleButton = new JButton("Read rules");
        ruleButton.addActionListener(new RulesInnerListener());
        rulePanel.add(ruleButton);
    }

    // inte JOptionpane, lite text
// Använd en annan panel som öppnas separat.

    class RulesInnerListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            createFrame();
            ArrayList<String> records = new ArrayList<>();
            String filename = "yatzyrules.txt";

            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = reader.readLine()) != null) {
                    records.add(line);
                }
                String listString = "";

                for (String s : records) {
                    listString += s + "\t";
                }
                rulePanel.add(textArea);
                reader.close();

            } catch (Exception e) {
                System.err.format("Exception occurred trying to read '%s'.", filename);
                e.printStackTrace();
            }
        }
    }

    public static void createFrame() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Yatzy rules");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try
                {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.setOpaque(true);
                JTextArea textArea = new JTextArea(30, 50);
                textArea.setWrapStyleWord(true);
                textArea.setEditable(false);
                textArea.setFont(Font.getFont(Font.SANS_SERIF));
                JScrollPane scroller = new JScrollPane(textArea);
                scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                DefaultCaret caret = (DefaultCaret) textArea.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                panel.add(scroller);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.pack();

                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setResizable(false);

            }
        });
    }
}

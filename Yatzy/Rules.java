import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Rules extends JFrame {
    static JPanel rulePanel;
    JButton ruleButton;
    JTextArea textArea;
    static JFrame frame = new JFrame("Yatzy rules");
    static JPanel panel;

    Rules() {
        panel = new JPanel();
        rulePanel = new JPanel();
        rulePanel.setBackground(Color.BLUE);
        add(rulePanel);

        ruleButton = new JButton("Read rules");
        ruleButton.addActionListener(new RulesInnerListener());
        rulePanel.add(ruleButton);
    }

// Använd en annan panel som öppnas separat.

    class RulesInnerListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            readFile();
            createFrame();

        }

    public void createFrame() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                JTextArea textArea = new JTextArea(30, 50);
                textArea.append(readFile());
                textArea.setEditable(false);
                panel.add(textArea);

                JScrollPane scroller = new JScrollPane(textArea);
                scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                panel.add(scroller);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setResizable(true);
            }
        });
    }
        public String readFile() {
            String line;
            String txt = "";
            String filename = "yatzyrules.txt";
//
            ArrayList<String> records = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader((filename)));

                while ((line = reader.readLine()) != null) {
                    txt = txt + "\n" + line;
                    records.add(line);
                }
                reader.close();

            } catch (Exception e) {
                System.err.format("Exception occurred trying to read '%s'.", filename);
                e.printStackTrace();
            }
            return txt;
        }
    }
}

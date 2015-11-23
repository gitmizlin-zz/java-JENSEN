import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Rules extends JFrame {
    private JPanel rulePanel;
    private JButton ruleButton;
    private JTextArea textArea;
    private JFrame frame;
    private JPanel panel;

    Rules() {
        panel = new JPanel();
        rulePanel = new JPanel();
        rulePanel.setBackground(Color.BLUE);
        add(rulePanel);

        ruleButton = new JButton("Read rules");
        ruleButton.addActionListener(new RulesInnerListener());
        rulePanel.add(ruleButton);
    }

    class RulesInnerListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (frame == null) {
                frame = new JFrame("Yatzy rules");

                frame.addWindowListener(new setWindowNull());
                readFile();
                createFrame();
            }
        }

        public void createFrame() {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
                    scroller.getVerticalScrollBar().setValue(0); // not working

                    panel.add(scroller);
                    frame.setSize(600, 600); // size changes second time.
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

    public JPanel getRulePanel() {
        return this.rulePanel = rulePanel;
    }

    class setWindowNull implements WindowListener {
        @Override
        public void windowClosing(WindowEvent event) {
            dispose();
            frame = null;
        }

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }
}

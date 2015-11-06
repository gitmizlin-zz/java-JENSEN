import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by oscar on 2015-11-02.
 */
public class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // Kod som ska köras när "action performs", d.v.s. när det händer något
        JOptionPane.showMessageDialog(null, "Varning!", "Rubrik", JOptionPane.ERROR_MESSAGE);
    }
}

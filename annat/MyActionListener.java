import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {		
		nrOfClicks++;
		text.setText("Button clicked: " + nrOfClicks + " times.");
	}
}
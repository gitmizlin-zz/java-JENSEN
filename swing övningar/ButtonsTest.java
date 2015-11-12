import javax.swing.*;

public class ButtonsTest extends JFrame {
	public static void main (String[] args) {
		new ButtonsTest();
	}

	public ButtonsTest () { //constructor
		super();
		JFrame frame = new JFrame();
		initGui();
	}

	public void initGui() {
		JPanel panel;
		JLabel label;
		setTitle("Utforskar swing #2");
	}
}

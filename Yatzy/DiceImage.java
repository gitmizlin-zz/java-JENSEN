import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Observer;

public class DiceImage extends JLabel implements Observer {
	Dice diceModel;

	static ImageIcon icon1 = new ImageIcon(DiceImage.class.getResource("img/d1.png"));
	static ImageIcon icon2 = new ImageIcon(DiceImage.class.getResource("img/d2.png"));
	static ImageIcon icon3 = new ImageIcon(DiceImage.class.getResource("img/d3.png"));
	static ImageIcon icon4 = new ImageIcon(DiceImage.class.getResource("img/d4.png"));
	static ImageIcon icon5 = new ImageIcon(DiceImage.class.getResource("img/d5.png"));
	static ImageIcon icon6 = new ImageIcon(DiceImage.class.getResource("img/d6.png"));

	static ImageIcon iconHold1 = new ImageIcon(DiceImage.class.getResource("img/d1hold.png"));
	static ImageIcon iconHold2 = new ImageIcon(DiceImage.class.getResource("img/d2hold.png"));
	static ImageIcon iconHold3 = new ImageIcon(DiceImage.class.getResource("img/d3hold.png"));
	static ImageIcon iconHold4 = new ImageIcon(DiceImage.class.getResource("img/d4hold.png"));
	static ImageIcon iconHold5 = new ImageIcon(DiceImage.class.getResource("img/d5hold.png"));
	static ImageIcon iconHold6 = new ImageIcon(DiceImage.class.getResource("img/d6hold.png"));

	static ImageIcon[] icons = {icon1, icon2, icon3, icon4, icon5, icon6};

	static ImageIcon[] iconsHold = {iconHold1, iconHold2, iconHold3, iconHold4, iconHold5, iconHold6};

	public DiceImage() {
		setIcon(icons[0]); 
	}

	public void changeImage (int diceValue) {
		if(diceValue >= 1 && diceValue <= 6) {
			setIcon(icons[diceValue - 1]);
		}
	}

	// Observer implemented, so you have to have the method update()
	@Override
	public void update(Observable o, Object arg) {
		// Get the observed die
		changeImage(((Dice) o).getValue());
	}

	public void setDiceModel(Dice diceModel) {
		this.diceModel = diceModel;
	}

	public Dice getDiceModel() {
		return diceModel;
	}
}

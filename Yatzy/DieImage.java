import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

public class DieImage extends JLabel implements Observer {

    static ImageIcon icon1 = new ImageIcon(DieImage.class.getResource("img/d1.png"));
    static ImageIcon icon2 = new ImageIcon(DieImage.class.getResource("img/d2.png"));
    static ImageIcon icon3 = new ImageIcon(DieImage.class.getResource("img/d3.png"));
    static ImageIcon icon4 = new ImageIcon(DieImage.class.getResource("img/d4.png"));
    static ImageIcon icon5 = new ImageIcon(DieImage.class.getResource("img/d5.png"));
    static ImageIcon icon6 = new ImageIcon(DieImage.class.getResource("img/d6.png"));

    static ImageIcon icon1hold = new ImageIcon(DieImage.class.getResource("img/d1hold.png"));
    static ImageIcon icon2hold = new ImageIcon(DieImage.class.getResource("img/d2hold.png"));
    static ImageIcon icon3hold = new ImageIcon(DieImage.class.getResource("img/d3hold.png"));
    static ImageIcon icon4hold = new ImageIcon(DieImage.class.getResource("img/d4hod.png"));
    static ImageIcon icon5hold = new ImageIcon(DieImage.class.getResource("img/d5hold.png"));
    static ImageIcon icon6hold = new ImageIcon(DieImage.class.getResource("img/d6hold.png"));

    static ImageIcon[] icons = {icon1, icon2, icon3, icon4, icon5, icon6, icon1hold, icon2hold, icon3hold, icon4hold, icon5hold, icon6hold};


    public DieImage() {
        setIcon("img/d1.png");
        setOpaque(true);
        setText("dicetest!!");
    }

    public void changeImage (int dieValue) {
        if (dieValue >= 1 && dieValue <= 6) {
            setIcon(icons[dieValue - 1]);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        setIcon(new ImageIcon(class.getResource("img/d" +  ".png")));
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.List;


public class Board extends JFrame {

	public Board() {
		super();
		new FiveDiceView();
		new Rules();
	}
}
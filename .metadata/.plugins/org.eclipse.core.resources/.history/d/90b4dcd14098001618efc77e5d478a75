package jdbc_slutprojekt.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

import jdbc_slutprojekt.controll.EmployeeManager;
import jdbc_slutprojekt.controll.Engine;

public class ResultView extends JFrame {

	private JButton goBackToMainButton = new JButton("Go back to main menu");
	private JButton goBackToPreMenuButton = new JButton("Go back to previous menu");
	public JTextArea result = new JTextArea();
	private String txt = "";

	public ResultView(String title, int tableNo, ResultSet rs) throws SQLException {
		super(title);
				
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 700);
		setLocation(100, 100);

		add(goBackToMainButton);
		add(goBackToPreMenuButton);
		add(result);
		


		setVisible(true);		

		goBackToMainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setVisible(false);
					new SelectTableView("Table select menu");
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		
//		goBackToPreMenuButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					setVisible(false);
//					new SelectActionForTableView("Action select menu", tableNo, rs);
//					
//				} catch (Exception e1) {
//					
//					e1.printStackTrace();
//				}
//			}
//		});

	}
}

package jdbc_slutprojekt.view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import jdbc_slutprojekt.controll.Engine;

public class EmployeeResultView extends JFrame {

	private JButton goBackToMainButton = new JButton("Go back to main menu");
	private JTextArea result = new JTextArea();
	private JPanel mainPanel = new JPanel(); 
	private JScrollPane jsp = new JScrollPane(getContentPane());

	public EmployeeResultView(String title) throws SQLException {
		super(title);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 500);
		setLocation(100, 100);
		
		add(mainPanel);
		mainPanel.add(goBackToMainButton);
		mainPanel.add(result);
		setContentPane(jsp);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		setVisible(true);

		goBackToMainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setVisible(false);
					Engine.main(null);

				} catch (Exception e1) {

					e1.printStackTrace();
				}
			}
		});
	}

	public void setResultInTextArea(String st, JTextArea ta) {
		ta.setText(st);
	}

	public JTextArea getResultTextArea() {
		return result;
	}
	
	public void addToMainPanel(Component c) {
		mainPanel.add(c);
	}		
}

package jdbc_slutprojekt.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

import jdbc_slutprojekt.controll.OfficeManager;
import jdbc_slutprojekt.controll.ProjectManager;

public class ProjectSelectActionView extends JFrame {

	private JButton addButton = new JButton("Add");
	private JButton deleteButton = new JButton("Delete");
	private JButton searchButton = new JButton("Search");
	private JButton showAllButton = new JButton("Show all data");
	private JButton goBackToMainButton = new JButton("Go back to main menu");
	private Box box = Box.createVerticalBox();

	public ProjectSelectActionView(String title, ResultSet rs, Connection conn) throws SQLException {
		super(title);

		ProjectManager pm = new ProjectManager(conn);

		try {
			System.out.println("constructor closed? " + rs.isClosed());
		} catch (SQLException e2) {

			e2.printStackTrace();
		}
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 400);
		setLocation(100, 100);

		box.add(addButton);
		box.add(deleteButton);
		box.add(searchButton);
		box.add(showAllButton);
		box.add(goBackToMainButton);

		add(box);

		setVisible(true);

		showAllButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("btn callback closed? " + rs.isClosed());
					pm.getAllRows(rs);
					setVisible(false);

				} catch (Exception e1) {

					e1.printStackTrace();
				}
			}
		});

		searchButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					pm.search(conn);
					setVisible(false);

				} catch (Exception e1) {

					e1.printStackTrace();
				}
			}
		});

		addButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					pm.addRow(conn);
					setVisible(false);

				} catch (Exception e1) {

					e1.printStackTrace();
				}
			}
		});
		
		deleteButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					pm.deleteRow(rs);
					setVisible(false);

				} catch (Exception ex) {

					ex.printStackTrace();
				}
			}
		});
	}
}

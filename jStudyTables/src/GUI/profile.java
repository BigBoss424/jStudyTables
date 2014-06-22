package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTable;

import objects.Person;

public class profile {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profile window = new profile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public profile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 66, 422, 146);
		frame.getContentPane().add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		List list = new List();
		scrollPane.setRowHeaderView(list);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(12, 12, 70, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(12, 39, 70, 15);
		frame.getContentPane().add(lblDate);
		
		JLabel lblHoursNeeded = new JLabel("Hours Needed:");
		lblHoursNeeded.setBounds(235, 12, 113, 15);
		frame.getContentPane().add(lblHoursNeeded);
		
		JLabel lblHoursCompleted = new JLabel("Hours Completed:");
		lblHoursCompleted.setBounds(235, 39, 135, 15);
		frame.getContentPane().add(lblHoursCompleted);
		
		JButton btnAddHours = new JButton("Add Hours");
		btnAddHours.setBounds(22, 215, 117, 25);
		frame.getContentPane().add(btnAddHours);
		
		JButton btnUpdateGpa = new JButton("Update GPA");
		btnUpdateGpa.setBounds(151, 215, 135, 25);
		frame.getContentPane().add(btnUpdateGpa);
		
		JButton btnOpenLog = new JButton("Open Log");
		btnOpenLog.setBounds(300, 215, 117, 25);
		frame.getContentPane().add(btnOpenLog);
		
		JLabel lblNewLabel = new JLabel(objects.Person.this.getName());
		lblNewLabel.setBounds(69, 12, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		String date = sdf.format(new Date());
		JLabel lblNewLabel_1 = new JLabel(date);
		lblNewLabel_1.setBounds(69, 39, 95, 15);
		frame.getContentPane().add(lblNewLabel_1);
	}
}

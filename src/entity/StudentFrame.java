package entity;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFrame window = new StudentFrame();
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
	public StudentFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 523, 221);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Full name");
		lblNewLabel.setBounds(10, 25, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 50, 46, 14);
		panel.add(lblGender);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setBounds(10, 75, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1.setBounds(10, 100, 46, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Phone number");
		lblNewLabel_1_1_1_1.setBounds(10, 125, 76, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(113, 22, 321, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(113, 46, 69, 22);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 72, 321, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 97, 321, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 122, 321, 20);
		panel.add(textField_3);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(35, 169, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(153, 169, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(268, 169, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Find");
		btnNewButton_3.setBounds(382, 169, 89, 23);
		panel.add(btnNewButton_3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Full name", "Gender", "Email", "Address"
			}
		));
		table.setBounds(10, 242, 523, 171);
		frame.getContentPane().add(table);
	}
}

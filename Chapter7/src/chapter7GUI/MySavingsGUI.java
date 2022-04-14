package chapter7GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MySavingsGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtAddA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySavingsGUI window = new MySavingsGUI();
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
	public MySavingsGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setText("Bank");
		textField.setColumns(10);
		textField.setBounds(159, 0, 86, 20);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setBounds(23, 39, 89, 23);
		panel.add(btnNewButton);
		
		txtAddA = new JTextField();
		txtAddA.setColumns(10);
		txtAddA.setBounds(276, 73, 111, 20);
		panel.add(txtAddA);
		
		JLabel lblNewLabel = new JLabel("1. Show total in bank");
		lblNewLabel.setBounds(23, 73, 111, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Show total in bank");
		lblNewLabel_1.setBounds(23, 73, 62, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2. Add a penny");
		lblNewLabel_2.setBounds(23, 104, 102, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("3. Add a nickel");
		lblNewLabel_2_1.setBounds(23, 135, 102, 20);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("4. Add a dime");
		lblNewLabel_2_2.setBounds(23, 166, 102, 20);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("5. Add a quarter");
		lblNewLabel_2_3.setBounds(23, 197, 102, 20);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Enter your choice");
		lblNewLabel_2_4.setBounds(181, 73, 102, 20);
		panel.add(lblNewLabel_2_4);
	}
}

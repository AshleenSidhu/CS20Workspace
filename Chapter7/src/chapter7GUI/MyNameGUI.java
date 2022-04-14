package chapter7GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyNameGUI {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;
	private JTextField M1;
	private JTextField M2;

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
	public MyNameGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 307);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 246);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel firstN = new JLabel("My Name");
		firstN.setFont(new Font("Times New Roman", Font.BOLD, 11));
		firstN.setBounds(10, 21, 72, 28);
		panel.add(firstN);
		
		Fn = new JTextField();
		Fn.setBounds(73, 17, 298, 32);
		panel.add(Fn);
		Fn.setColumns(10);
		
		JLabel lastN = new JLabel("Last Name");
		lastN.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lastN.setBounds(10, 79, 72, 21);
		panel.add(lastN);
		
		Ln = new JTextField();
		Ln.setBackground(Color.WHITE);
		Ln.setColumns(10);
		Ln.setBounds(73, 73, 298, 32);
		panel.add(Ln);
		
		JLabel lblMark = new JLabel("Mark 1");
		lblMark.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblMark.setBounds(22, 133, 47, 21);
		panel.add(lblMark);
		
		M1 = new JTextField();
		M1.setBounds(73, 129, 47, 28);
		panel.add(M1);
		M1.setColumns(10);
		
		JLabel lblMark_2 = new JLabel("Mark 2");
		lblMark_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblMark_2.setBounds(163, 133, 47, 21);
		panel.add(lblMark_2);
		
		M2 = new JTextField();
		M2.setColumns(10);
		M2.setBounds(210, 129, 47, 28);
		panel.add(M2);
		
		JLabel text = new JLabel("");
		text.setBounds(10, 172, 390, 47);
		panel.add(text);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
			{
				String firstN = Fn.getText();
				String lastN = Ln.getText();
				
				dis.setText(firstN + " " + lastN);
				
				double mark1 = Double.parseDouble(M1.getText());
				double mark2 = Double.parseDouble(M2.getText());
				double avg = (mark1 + mark2)/2;
				
				dis.setText(firstN + " " + lastN + "your average is: " + avg);
			}
		}
		Submit.setBackground(Color.GRAY);
		Submit.setBounds(282, 132, 89, 23);
		panel.add(Submit);
		
	}
}

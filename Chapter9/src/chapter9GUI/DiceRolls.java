package chapter9GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class DiceRolls 
{
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					DiceRolls window = new DiceRolls();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiceRolls() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		int[] outcomes = new int[13];
		int numRolls = 6;
		int outcome;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 385, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(133, 11, 150, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("How many Rolls?");
		lblNewLabel.setBounds(22, 14, 177, 21);
		frame.getContentPane().add(lblNewLabel);
		
		for(int roll = 0; roll < numRolls; roll++)
		{
			outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
			outcomes[outcome] += 1;
		}
		
		for(int i = 2; i <= 12; i++)
		{
			textField.setText(i + ": " + outcomes[i]);
		}
		
		
		
	}
}

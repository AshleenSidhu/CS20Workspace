/*
Program: DiceRolls.java          Last Date of this Revision: 09-June-2022

Purpose: Create an DiceRoll application on GUI that rolls 3 dice.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter9GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class DiceRolls 
{
	private JFrame frame;
	private JTextField textField;
	int numRolls;
	int outcome;

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
		
		frame = new JFrame();
		frame.setBounds(100, 100, 324, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 46, 265, 185);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("How many Rolls?");
		lblNewLabel.setBounds(22, 14, 101, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JTextField num = new JTextField();
		num.setBounds(125, 15, 63, 20);
		frame.getContentPane().add(num);
		num.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(198, 13, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//number of rolls the user enters when the button is clicked
				numRolls = Integer.parseInt(num.getText());
				
				for(int roll = 0; roll < numRolls; roll++)
				{
					outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
					outcomes[outcome] += 1;
				}
				
				//shows the dice rolls 
				for(int i = 2; i <= 12; i++)
				{
					textArea.append(i + ": " + outcomes[i] + "\n");
				}
				
			}	
		});
	}
}

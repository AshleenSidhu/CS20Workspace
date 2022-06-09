/*
Program: Reverse.java          Last Date of this Revision: 09-June-2022

Purpose: Create a Reverse application that stores the number corresponding to the elements index in an integer array of 10 elements.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter9GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Reverse 
{
	private JFrame frame;
	static JButton btnNewButton;

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
					Reverse window = new Reverse();
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
	public Reverse() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 291, 299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 255, 238);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(10);
		textArea.setBounds(10, 45, 235, 182);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(10, 11, 235, 23);
		panel.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				 final int num_elements = 10;
		            
		         int[] numbers = new int[num_elements];
		            
		         // stores the numbers 
		         for (int i = 0; i < num_elements; i++)
		         {
		        	 numbers[i] = i;
		         }
		         
		         textArea.setText("Countdown\n");
		            
		         //Display Array
		         for (int i = num_elements - 1; i >= 0; i--)
		         {
		        	 textArea.append(Integer.toString(numbers[i]) + "\n");
		       
		         }
			}
		         
		});
		
	}
}



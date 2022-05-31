package chapter9GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class Reverse 
{

	private JFrame frame;
	private JTextField field;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(170, 71, 89, 23);
		frame.getContentPane().add(btnNewButton);
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
		         
		         for (int i = num_elements - 1; i >= 0; i--)
		         {
		        	 field.setText(numbers[i]);
		       
		         }
			}
		});
		
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		field = new JTextField();
		field.setToolTipText("");
		field.setHorizontalAlignment(SwingConstants.CENTER);
		field.setText("Countdown");
		field.setBounds(10, 21, 414, 192);
		frame.getContentPane().add(field);
		field.setColumns(10);
		
	}
}
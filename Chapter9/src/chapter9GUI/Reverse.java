package chapter9GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Reverse 
{
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		JTextField textField = new JTextField("Countdown");
		
		final int num_elements = 10;
        
        String[] numbers = new String[num_elements];
        
        // stores the numbers 
     	for (int i = 0; i < num_elements; i++)
        {
       	 	numbers[i] = i; 
        }
     	
     	//Display Array
         for (int i = num_elements - 1; i >= 0; i--)
         {
        	 textField.setText(numbers[i]);
         }
         
         
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
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
		
		textField = new JTextField("Countdown");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(10, 11, 255, 238);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	}
}

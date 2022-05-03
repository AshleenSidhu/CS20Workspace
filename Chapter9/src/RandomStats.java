
public class RandomStats 
{
	public static void main(String[] args)
	{
		//declare an Array that is 1D
		int[] outcomes = new int[10];
		int outcome;
		
		//generate numbers and store them 
		for(int i = 0; i < 100; i++)
		{
			outcome = (int)(10*Math.random());
			outcomes[outcome] += 1;
		}
		
		//Display what is in the Array
		for(int i = 0; i < 10; i++)
		{
			System.out.print(outcomes[i]);
			System.out.println(" ");
		}
		
	}
}

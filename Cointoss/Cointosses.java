public class Cointosses
{
	public static void main (String[] args)
	{
		coinTosses();
	}
	
	public static void coinTosses()
	{
		int heads = 0;
		int tails = 0;
		
		for (int i = 0; i < 100; i++)
		{
			double faceValue = Math.floor(Math.random() * 2 + 1);
				
			if (faceValue == 1)
			{
				heads++;
			}
			else
			{
				tails++;
			}
		}
		
		System.out.println("Head Tosses = " + heads);
		System.out.println("Tail Tosses = " + tails);
	}
}
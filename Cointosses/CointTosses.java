public class CointTosses
{
	public static void main(String[] args)
	{
		Coin myCoin = new Coin();
		
		Coin myCoin2 = new Coin(.2);
		
		Coin anotherCoin = new Coin(5, 8);
		
		int headsCount = 0;
		int tailsCount = 0;
		for (int i = 0; i < 100000; i++)
		{
			String result = myCoin.toss();
			if (result.equals("heads")) //This is how you test equality for Strings.
			{
				headsCount++;
			}
			else
			{
				tailsCount++;
			}
		}
		System.out.println("heads: " + headsCount);
		
		System.out.println("tails: " + tailsCount);
		
		headsCount = 0;
		tailsCount = 0;
		for (int i = 0; i < 100000; i++)
		{
			String result = myCoin2.toss();
			if (result.equals("heads"))
			{
				headsCount++;
			}
			else
			{
				tailsCount++;
			}
		}
		
		System.out.println();
		
		System.out.println("heads: " + headsCount);
		
		System.out.println("tails: " + tailsCount);
		
		headsCount = 0;
		tailsCount = 0;
		for (int i = 0; i < 100000; i++)
		{
			String result = anotherCoin.toss();
			if (result.equals("heads"))
			{
				headsCount++;
			}
			else
			{
				tailsCount++;
			}
		}
		
		System.out.println();
		
		System.out.println("heads: " + headsCount);
		
		System.out.println("tails: " + tailsCount);
	}
}
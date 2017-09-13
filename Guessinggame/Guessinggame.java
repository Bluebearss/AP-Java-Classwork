import java.util.Scanner; //import java.util.* this allows you to use any class from the util package.

public class Guessinggame
{
	public static int[] oldResultsArr = new int[0];
	
	public static int[] updatedResultsArr = new int[0];
		
	public static void playGame()
	{
		
		Scanner menu = new Scanner(System.in);
		
		System.out.println("Guessing Game");		
		System.out.println("Type the number corresponding to the level you want to play:");
		System.out.println();
		System.out.println("1. Beginner (numbers between 1 and 10)");
		System.out.println("2. Intermediate (numbers between 1 and 100)");
		System.out.println("3. Advanced (numbers between 1 and 1,000)");
		System.out.println("4. Expert (numbers between 1 and 10,000)");
		
		int attempts = 0;
		
		int highestNum = 0;
		int randomNum = 0;
		 //To create a range of numbers: (int)(Math.random() * Number of Options) + Minimum Value		
		
		boolean goOn = false;
		
		int choice = 0;
		
		while (attempts < 3 && !goOn)
		{
			choice = menu.nextInt();
			
			if (choice > 0 && choice < 5)
			{
				System.out.println("Please guess a number.");
				highestNum = (int)Math.pow(10, choice);
				randomNum = (int)(Math.random() * highestNum) + 1;
				goOn = true;
			}
			else
			{
				attempts++;
				System.out.println("Please print a valid level.");
			}
		}
		
		if (attempts == 3)
		{
			System.out.println("GAME OVER! YOU USED YOUR 3 ATTEMPTS TO PLAY AROUND LIKE A KID?! CAN YOU NOT READ INSTRUCTIONS? I SAID 1, 2, 3, OR 4. IM TRIGGERED! (>'-')> (>'-')> (>'-')>");
		}
		
		int tries = 1;
			
		boolean correct = false;
		
		if (goOn)
		{
			int guess;
				
			while (!correct)
			{
				guess = menu.nextInt();
				
				if (guess > randomNum)
				{
					System.out.println("You are TOO HIGH Sir!");
					tries++;
				}
				else
				{
					if (guess < randomNum)
					{
						System.out.println("You are TOO LOW Sir!");
						tries++;
					}
					else
					{
						correct = true;
						System.out.println("You guessed the number correctly. Good for you! Now you have something to be \n proud of today. :)");
						System.out.println("You have guessed the number in " + tries + " attempts.");
						
						updatedResultsArr = new int[oldResultsArr.length + 1];
						
						updatedResultsArr[updatedResultsArr.length - 1] = tries;
						
						for (int i = 0; i < oldResultsArr.length; i++)
						{
							updatedResultsArr[i] = oldResultsArr[i];
						}
						
						oldResultsArr = new int[updatedResultsArr.length];
						
						for (int i = 0; i < updatedResultsArr.length; i++)
						{
							oldResultsArr[i] = updatedResultsArr[i];
						}
					}
				}	
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner menu = new Scanner(System.in);
		
		String answer;
		
		do
		{
			System.out.println();
			playGame();
			System.out.println("Would you like to play again?");
			answer = menu.nextLine();
		}
		while (answer.equals("yes"));
		
		System.out.println();
		
		System.out.println("Thank you for playing!");
		
		System.out.println();
		
		for (int i = 0; i < updatedResultsArr.length; i++)
		{
			System.out.println("Game " + (i + 1) + " = " + updatedResultsArr[i] + " guesses.");
		}
	}
}
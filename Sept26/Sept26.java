import java.util.Scanner; //import java.util.* this allows you to use any class from the util package.

public class Sept26
{
	public static void main (String[] args)
	{
		
		Scanner menu = new Scanner(System.in);
		/*
		System.out.print("Enter your name: ");
		String name = powerLevel.nextLine();
		
		System.out.print("How old are you? ");
		int age = powerLevel.nextInt();
		
		System.out.print("What is your GPA? ");
		double gpa = powerLevel.nextDouble();
		
		System.out.println();
		System.out.println("Your name is " + name);
		System.out.println("You are " + age + " years old.");
		System.out.println("Your gpa is " + gpa);
		*/
		
		System.out.println("Here is your menu. Please select a level!");
		System.out.println();
		System.out.println("1. Beginner");
		System.out.println("2. Intermediate");
		System.out.println("3. Advanced");
		System.out.println("4. Expert");
		
		int attempts = 0;
		
		double randomNum;
		
		while (attempts < 3)
		{
			int choice = menu.nextInt();
			
			if (choice == 1)
			{
				System.out.println("You chose Beginner.");
				randomNum = Math.floor(Math.random)
			}
			else
			{
				if (choice == 2)
				{
					System.out.println("You chose Intermediate.");
				}
				else
				{
					if (choice == 3)
					{
						System.out.println("You chose Advanced.");
					}
					else
					{
						if (choice == 4)
						{
							System.out.println("You chose Expert.");
						}
						else
						{
							attempts++;
							System.out.println("Please print a valid number.");
						}
					}		
				}
			}
		}
		
		if (attempts == 3)
		{
			System.out.println("GAME OVER! YOU USED YOUR 3 ATTEMPTS TO PLAY AROUND LIKE A KID?! CAN YOU NOT READ INSTRUCTIONS? I SAID 1, 2, 3, OR 4. IM TRIGGERED! (>'-')> (>'-')> (>'-')>");
		}	
	}
}
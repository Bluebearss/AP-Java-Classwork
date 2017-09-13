public class Sept14
{
	public static void main(String[] args)
	{
		String name = "Harambe";
		System.out.println("Hello World, " + name + ".");
		
		int age = 17;
		System.out.println("You are " + age + " years old.");
		System.out.println("Next year, I will be " + (age + 1) + ".");
		
		String permission;

		if (age > 17)
		{
			permission = "can";
		}
		else
		{
			permission = "cannot";
		}
		
		System.out.println("You " + permission + " vote.");
		
		permission = null;
		
		if (permission == null)
		{
			permission = "permission not defined.";
		}
		
		int counter = 0;
		
		while (counter < 10)
		{
			// System.out.print("Hooray");
			counter++;
		}
		
		System.out.println("Ten count complete.");
		
		counter = 63457;
		
		do
		{
			System.out.println("Horray");
		}
		while (counter < 10);
	}
}			
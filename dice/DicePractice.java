public class DicePractice
{
	public static final int DEFAULT_NUM_OF_ROLLS = 100;
	private int[] rolls; //array of rolls with elements index 0-12 contains the tally of rolls outcomes
	private int[] theoreticalRolls;
	private PairOfDice myDice; //normal pair of dice
	private int numberOfRolls; //100 stored in
	
	public DicePractice(PairOfDice dice)
	{
		this(dice, DEFAULT_NUM_OF_ROLLS);
		/*myDice = dice;
		numberOfRolls = DEFAULT_NUM_OF_ROLLS;
		rolls = new int[myDice.getHighestRoll() + 1];
		theoreticalRolls = new int[myDice.getHighestRoll() + 1];*/
	}
	
	public DicePractice(PairOfDice dice, int numOfRolls)
	{
		myDice = dice;
		numberOfRolls = numOfRolls;
		rolls = new int[myDice.getHighestRoll() + 1]; //Makes a int array which has 1 more length than highestroll to able to insert highestroll, since index 1 less than length.
		theoreticalRolls = new int[myDice.getHighestRoll() + 1];
		
		rollDice();
			
		simulateTheoreticalRolls();
		
		printRolls();
		
		printTheoreticalRolls();
	}
	
	public void rollDice()
	{
		for (int i = 0; i < numberOfRolls; i++)
		{
			rolls[myDice.roll()]++; //This increments the position of the int array. If you roll a 5, it increments position 5 by 1.
		}	
	}
	
	public void simulateTheoreticalRolls()
	{
		
		int die1Size = myDice.getDie1().getNumOfSides(); //Gets individual number of sides for each dice.
		int die2Size = myDice.getDie2().getNumOfSides();
		
		for (int i = 1; i <= die1Size; i++) //It is a combination function. It starts with 1 as i and then loops through 1-6 for j. Then i goes to 2 and loops 1-6 for j. Then it adds the result to position of the int array.
		{
			for (int j = 1; j <= die2Size; j++)
			{
				theoreticalRolls[i + j]++;
			}
		}
	}
	
	public void printRolls()
	{
		for (int i = 2; i < rolls.length; i++)
		{
			System.out.print("[" + i + "] = " + rolls[i]);
			System.out.print("\t\t"); // \t makes a tab.
			System.out.println((double)(rolls[i]) / numberOfRolls);
		}
		
		System.out.println();
	}
	
	public void printTheoreticalRolls()
	{
		int possibleCombinations = myDice.getDie1().getNumOfSides() * myDice.getDie2().getNumOfSides();
		
		for (int i = 2; i < theoreticalRolls.length; i++)
		{
			System.out.print("[" + i + "] = " + theoreticalRolls[i]);
			System.out.print("\t\t"); // \t makes a tab.
			System.out.println((double)(theoreticalRolls[i]) / possibleCombinations);
		}
		
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		/*
		NumberCube d1 = new NumberCube();
		NumberCube d2 = new NumberCube();
		PairOfDice theDice = new PairOfDice(d1, d2);
		*/
		DicePractice dp1 = new DicePractice(new PairOfDice());
		DicePractice dp2 = new DicePractice(new PairOfDice(), 100000);
		
		//PairOfDice myDice = new PairOfDice(new NumberCube(), new NumberCube());
	}
}
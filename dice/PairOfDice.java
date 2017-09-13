public class PairOfDice
{
	private NumberCube die1;
	private NumberCube die2;
	
	public PairOfDice()
	{
		this(new NumberCube());
	}
	public PairOfDice(NumberCube theCube)
	{
		this(theCube, theCube);
	}
	
	public PairOfDice(NumberCube cube1, NumberCube cube2)
	{
		die1 = cube1;
		die2 = cube2;
	}
	
	public int roll()
	{
		return die1.roll() + die2.roll();
	}
	
	public int getHighestRoll()
	{
		return die1.getNumOfSides() + die2.getNumOfSides();
	}
	
	public NumberCube getDie1()
	{
		return die1;
	}
	
	public NumberCube getDie2()
	{
		return die2;
	}
}
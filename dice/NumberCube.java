public class NumberCube
{
	public static final int MIN_SIDES = 4;
	public static final int MAX_SIDES = 120;
	public static final int DEFAULT_SIDES = 6;
	private int numOfSides; /*instance variable - variable outside of a method and each NumberCube gets this 
							variable. Starts with a value of 0. Strings start with a value of null.*/
	
	public NumberCube()
	{
		numOfSides = DEFAULT_SIDES;
		// this(DEFAULT_SIDES); Using this as a method, calling a constructor in the same class.
	}
	/*If local variable is same name as instance variable, local variable 
    takes precedence. this. distinguishes the instance variable.*/
	public NumberCube(int numOfSides)
	{
		if (numOfSides < MIN_SIDES || numOfSides > MAX_SIDES)
		{
			this.numOfSides = DEFAULT_SIDES;
		}
		else
		{
			this.numOfSides = numOfSides;
		}
	}
	
	public int roll()
	{
		return (int)(Math.random() * numOfSides) + 1; 
	}
	
	public int getNumOfSides()
	{
		return numOfSides;
	}
}
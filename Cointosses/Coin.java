public class Coin
{
	/* private means client can't see it. If we want client to access information, 
    we make a method to do so. Most visible is public, least is private. Protected 
    lets the child of one class access information from another class. */
	private double headsProb; //Field because outside any method.
	
	public Coin()
	{
		headsProb = 0.5;
	}
	
	public Coin(double headsProb) //This headProbs is the local variable.
	{
		if (headsProb < 0.0 || headsProb > 1.0)
		{
			this.headsProb = 0.5; //By using this.headsProb, we refer back to the instance variable.
		}
		else
		{
			this.headsProb = headsProb;
		}
	}
	
	public Coin(double headsProportion, double tailsProportion)
	{
		if (headsProportion == 0.0 && tailsProportion == 0.0)
		{
			headsProb = 0.5;
		}
		else
		{
			headsProportion = Math.abs(headsProportion);
			tailsProportion = Math.abs(tailsProportion);
			headsProb = headsProportion / (headsProportion + tailsProportion);
		}
	}
	
	public String toss()
	{
		double flip = Math.random();
		if (flip < headsProb)
		{
			return "heads";
		}
		else
		{
			return "tails";
		}
	}
		
}
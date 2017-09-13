public class APStudent implements EvaluatedItem
{
	private String name;
	private int score;
	
	public APStudent(String studentName, int studentScore)
	{
		name = studentName;
		score = studentScore;
	}
	
	public boolean qualified()
	{
		return score >= 3;
	}
	
	public String getName()
	{
		return name;
	}
}
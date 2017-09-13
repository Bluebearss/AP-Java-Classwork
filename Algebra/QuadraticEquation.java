public class QuadraticEquation
{
	//precondition: a != 0
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public QuadraticEquation(double a, double b)
	{
		this.a = a;
		this.b = b;
		this.c = 0;
	}
	
	public QuadraticEquation(double a)
	{
		this.a = a;
		this.b = 0;
		this.c = 0;
	}
	
	public double getDiscriminant()
	{
		return (b * b) - (4 * a * c);
	}
	
	public boolean hasRealRoots()
	{
		return (getDiscriminant() >= 0);
	}
	
	public ComplexNumber[] getRoots()
	{
		double secondPart;
		ComplexNumber[] roots = new ComplexNumber[2];
		double firstPart = -b / (2 * a);
			
		if(hasRealRoots())
		{
			secondPart = Math.sqrt(getDiscriminant()) / (2 * a);
			double root1 = firstPart + secondPart;
			double root2 = firstPart - secondPart;
			roots[0] = new ComplexNumber(root1);
			roots[1] = new ComplexNumber(root2);
			
			return roots;
		}
		else
		{
			secondPart = Math.sqrt(-1 * getDiscriminant()) / (2 * a);
			roots[0] = new ComplexNumber(firstPart, secondPart);
			roots[1] = new ComplexNumber(firstPart, -1 * secondPart);
			
			return roots;
		}
	}
}
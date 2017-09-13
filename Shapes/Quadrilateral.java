public abstract class Quadrilateral extends Shape
{
	protected double a, b, c, d;
	
	public Quadrilateral(double sideOne, double sideTwo, double sideThree, double sideFour, String name)
	{
		super(name);
		a = sideOne;
		b = sideTwo;
		c = sideThree;
		d = sideFour;
	}
	
	public Quadrilateral(double sideOne, double sideTwo, String name)
	{
		this(sideOne, sideTwo, sideOne, sideTwo, name);
	}
	
	public Quadrilateral(double side, String name)
	{
		this(side, side, side, side, name);
	}
	
	public double perimeter()
	{
		if (isValid())
		{
			return a + b + c + d;
		}
		else
		{
			return -999;
		}
	}
	
	public abstract double area();
	
	public boolean isValid()
	{
		return a > 0 && b > 0 && c > 0 && d > 0 && (a + b + c) > d && (a + b + d) > c && (a + c + d) > b && (b + c + d) > a;
	}
}
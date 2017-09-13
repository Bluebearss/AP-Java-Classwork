public class Circle extends Shape
{
	protected double myRadius;
	
	public Circle(double radius, String name)
	{
		super(name);
		myRadius = radius;
	}
	
	public double perimeter()
	{
		if (isValid())
		{
			return 2 * Math.PI * myRadius;
		}
		else
		{
			return -999;
		}
	}
	
	public double area()
	{
		if (isValid())
		{
			return Math.PI * myRadius * myRadius;
		}
		else
		{
			return -999;
		}
	}
	
	public boolean isValid()
	{
		return myRadius > 0;
	}
}
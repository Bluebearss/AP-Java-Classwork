public class Rectangle extends Quadrilateral
{
	public Rectangle(double side, String name)
	{
		super(side, side, name);
	}
	
	public Rectangle(double length, double width, String name)
	{
		super(length, width, length, width, name);
	}
	
	public double area()
	{
		if (isValid())
		{
			return a * b;
		}
		else
		{
			return -999;
		}
	}
	
	public boolean isSquare()
	{
		return isValid() && a == b;
	}
	
	public boolean isValid()
	{
		return super.isValid() && a == c && b == d;
	}
}
public class Triangle extends Shape
{
	protected double a, b, c;
	
	public Triangle(double side1, double side2, double side3, String name)
	{
		super(name);
		a = side1;
		b = side2;
		c = side3;
	}
	
	public double perimeter()
	{
		if (isValid())
		{
			return a + b + c;		
		}
		else
		{
			return -999;
		}
	}
	
	public double area()
	{
		double semiperimeter = super.semiperimeter();
		
		if (isValid())
		{
			return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
		}
		else
		{
			return -999;
		}
	}
	
	public boolean isValid()
	{
		return a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (b + c) > a;
	}
	
	public boolean isRightTriangle()
	{
		if (isValid())
		{
			return (a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a);
		}
		else
		{
			return false;
		}
	}
}
public abstract class Shape implements Comparable <Shape> //implements interface named Comparable comparing shapes
{
	protected String myName;
	
	public Shape(String name)
	{
		myName = name;
	}
	
	public String getName()
	{
		return myName;
	}
	
	public abstract double area();
	public abstract double perimeter();
	public abstract boolean isValid();
	
	public double semiperimeter()
	{
		return perimeter() / 2;
	}
	
	public int compareTo(Shape other)
	{
		if(this.area() > other.area())
		{
			return 1;
		}
		
		if(this.area() > other.area())
		{
			return -1;
		}
		
		if(this.perimeter() > other.perimeter())
		{
			return 1;
		}
		
		if(this.perimeter() < other.perimeter())
		{
			return -1;
		}
		
		return 0;
	}
	public String toString()
	{
		return myName + ", Area = " + area() + ", Perimeter = " + perimeter();
	}
}
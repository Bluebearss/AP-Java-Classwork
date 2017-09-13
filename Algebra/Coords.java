public class Coords
{
	//instance variables or fields
	private double x;
	private double y;
	
	//Constructor
	public Coords(double xValue, double yValue)
	{
		x = xValue;
		y = yValue;
	}
	
	public Coords(double value)
	{
		x = value;
		y = value;
	}
	
	public Coords()
	{
		x = 0.0;
		y = 0.0;
	}
	
	//copy constructor
	public Coords(Coords other)
	{
		this.x = other.x;
		this.y = other.y;
	}
	
	//accesses
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	//mutators
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public void reflectOnXAxis()
	{
		y = 0 - y; //0 - is so it can't display -0.0
	}
	
	public void reflectOnYAxis()
	{
		x = 0 - x;
	}
	
	public void reflectOnOrigin()
	{
		reflectOnXAxis();
		reflectOnYAxis();
	}
	
	public void translate(double horizontal, double vertical)
	{
		x += horizontal;
		y += vertical;
	}
	
	public void dilate(double dilationFactor)
	{
		x *= dilationFactor;
		y *= dilationFactor;
	}
	
	//other methods
	public double distanceFromOrigin()
	{
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public double distanceFrom(Coords other)
	{
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}
	
	public boolean equals(Coords otherPoint)
	{
		if (this.x == otherPoint.x && this.y == otherPoint.y)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean slopeOfLineSegmentDefined(Coords other)
	{
		if (this.x - other.x == 0)
		{
			return true;
		}
		
		return false;
	}
	
	public double getSlopeOfLineSegment(Coords other)
	{
		return (this.y - other.y) / (this.x - other.x);
	}

		
}
public class LinearEquation
{
	//precondition: (a != 0 || b != 0)
	//ax + by + c = 0
	private double a;
	private double b;
	private double c;
	
	//static methods
	
	public static boolean areValidParams(double a, double b)
	{
		if (a == 0 && b == 0)
		{
			return false;
		}
		
		return true;
	}
	
	//Constructors
	public LinearEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public LinearEquation(double slope, Coords point)
	{
		this.a = -slope;
		this.b = 1;
		this.c = ((slope * point.getX()) - point.getY());
	}
	
	//copy constructor
	public LinearEquation(LinearEquation other)
	{
		this.a = other.a;
		this.b = other.b;
		this.c = other.c;
	}
	//precondition point1 != point2
	public LinearEquation(Coords point1, Coords point2)
	{
		this.a = point2.getY() - point1.getY();
		this.b = point1.getX() - point2.getX();
		this.c = ((point1.getX() * point2.getY()) - (point2.getX() * point1.getY())) * -1;
	}
	
	public LinearEquation(LinearEquation other, Coords point)
	{
		double slope = (other.a / other.b) * -1;
		this.a = slope;
		this.b = -1;
		this.c = ((slope * point.getX()) - point.getY()) * -1;
	}
	
	public String toString()
	{
		//This was built so that when the equation is displayed, in case the b or c value is negative, it does not display "+ -b" or "+ -c"
		String correctSignB;
		String correctSignC;
		
		if (b < 0)
		{
			correctSignB = " - " + (b * -1);
		}
		else
		{
			correctSignB = " + " + b;
		}
		
		if (c < 0)
		{
			correctSignC = " - " + (c * -1);
		}
		else
		{
			correctSignC = " + " + c;
		}
		
		if (a == 0 && c == 0)
		{
			return b + "y" + " = 0";
		}
		
		if (b == 0 && c == 0)
		{
			return a + "x" + " = 0";
		}

		if (a == 0)
		{
			return b + "y" + correctSignC + " = 0";
		}
		
		if (b == 0)
		{
			return a + "x" + correctSignC + " = 0";
		}
		
		if (c == 0)
		{
			return a + "x" + correctSignB + "y" + " = 0";
		}
		
		
		return a + "x" + correctSignB + "y" + correctSignC + " = 0";
	}
	
	//accessors
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double getC()
	{
		return c;
	}
	
	public boolean slopeDefined()
	{
		return b != 0;
	}
	
	public boolean hasYIntercept()
	{
		return b != 0;
	}
	
	public boolean hasXIntercept()
	{
		return a != 0;
	}
	
	public double slope()
	{
		return (a / b) * -1;
	}
	
	public double yIntercept()
	{
		return (c / b) * -1;
	}
	
	public double xIntercept()
	{
		return (c / a) * -1;
	}
	
	public double slopeOfPerpendicularLine()
	{
		return (b / a);
	}
	
	public boolean isIncreasing()
	{
		return this.slope() > 0;
	}
	
	public boolean isDecreasing()
	{
		return this.slope() < 0;
	}
	
	public boolean isHorizontal()
	{
		return a == 0;
	}
	
	public boolean isVertical()
	{
		return b == 0;
	}

	public boolean isAFunction()
	{
		return !isVertical();
	}
	
	public boolean isValidLinearEquation()
	{
		return (a != 0 && b!= 0);
	}
	
	public boolean isDirectVariation()
	{
		return c == 0;
	}
	
	//other methods
	
	public boolean equals(LinearEquation other)
	{
		if (this.isHorizontal() && other.isHorizontal())
		{
			return this.yIntercept() == other.yIntercept();
		}
		
		if (this.isVertical() && other.isVertical())
		{
			return this.xIntercept() == other.xIntercept();
		}
		
		return this.yIntercept() == other.yIntercept() && this.xIntercept() == other.xIntercept();
	}
	
	public Coords pointOfIntersection(LinearEquation other)
	{
		if (this.equals(other) || this.isParallel(other))
		{
			return null;
		}
		
		double d = other.a;
		double e = other.b;
		double f = other.c;
		
		double x = (b * f - c * e) / (a * e - b * d);
		double y;
		
		if (this.isVertical())
		{
			y = (-d / e) * x - (f / e);
		}
		else
		{
			y = -(a/b) * x - (c / b);
		}
		
		return new Coords(x, y);
	}
	
	public boolean isParallel(LinearEquation other)
	{
		if (this.equals(other))
		{
			return false;
		}
		
		if (this.isVertical() && other.isVertical())
		{
			return true;
		}
		
		return this.slope() == other.slope();
	}
	
	public LinearEquation parallelLine(Coords point)
	{
		if (this.isVertical())
		{
			return new LinearEquation (1, 0, -point.getX());
		}
		
		return new LinearEquation(this.slope(), point);
	}
	
	public LinearEquation perpendicularLine(Coords point)
	{
		if (this.isVertical())
		{
			return new LinearEquation (0, 1, -point.getY());
		}
		
		return new LinearEquation((1 / this.slope()) * -1, point);
	}
	
	public double shortestDistanceFrom(Coords point)
	{
		LinearEquation perpendicularDistanceLine = this.perpendicularLine(point);
		Coords intersectionPoint = this.pointOfIntersection(perpendicularDistanceLine);
		
		return intersectionPoint.distanceFrom(point);
		
	}
}
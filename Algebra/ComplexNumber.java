public class ComplexNumber
{
	//instance variables
	private double a;
	private double b;
	
	//constructors
	public ComplexNumber(double realPart, double imaginaryPart)
	{
		a = realPart;
		b = imaginaryPart;
	}
	
	public ComplexNumber(double realPart)
	{
		a = realPart;
		b = 0;
	}
	
	public ComplexNumber()
	{
		a = 0;
		b = 0;
	}
	
	//Copy constructor
	public ComplexNumber(ComplexNumber other)
	{
		this.a = other.a;
		this.b = other.b;
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
	
	public String toString()
	{
		String correctSignB;
		
		if (b < 0)
		{
			correctSignB = " - " + (b * -1);
		}
		else
		{
			correctSignB = " + " + b;
		}
		
		if (a == 0 && b == 0)
		{
			return "0";
		}
		
		if (a == 0)
		{
			return b + "i";
		}
		
		if (b == 0)
		{
			return a + "";
		}
		
		return a + correctSignB + "i";
	}
	
	//other methods
	public ComplexNumber add(ComplexNumber other)
	{
		return new ComplexNumber(this.a + other.a, this.b + other.b);
	}
	
	public ComplexNumber subtract(ComplexNumber other)
	{
		return new ComplexNumber(this.a - other.a, this.b - other.b);
	}
	
	public ComplexNumber multiply(ComplexNumber other)
	{
		double a = this.a;
		double b = this.b;
		double c = other.a;
		double d = other.b;
		double newA;
		double newB;
		
		newA = (a * c) - (b * d);
		newB = (a * d) + (b * c);
		
		return new ComplexNumber(newA, newB);
	}
	
	public ComplexNumber divideBy(ComplexNumber other)
	{
		double a = this.a;
		double b = this.b;
		double c = other.a;
		double d = other.b;
		double newA;
		double newB;
		
		newA = ((a * c) + (b * d)) / ((c * c) + (d* d));
		newB = ((b * c) - (a * d)) / ((c * c) + (d* d));
		
		return new ComplexNumber(newA, newB);
	}
	
	public ComplexNumber getConjugate()
	{
		return new ComplexNumber(a, -b);
	}
}
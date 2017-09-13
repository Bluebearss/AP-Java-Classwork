public class Test
{
	public static void main(String[] args)
	{
		//Coords Testing
		Coords point1 = new Coords(5, 8);
		Coords point2 = new Coords();
		Coords point3 = new Coords(point1);
		Coords point4 = new Coords(50);
		Coords point5 = new Coords(2,8);
		Coords point6 = new Coords(2,-6);
		Coords point7 = new Coords(1,3);
		Coords point8 = new Coords(5,6);
		Coords point9 = new Coords(5,9);
		
		System.out.println(point1);
		System.out.println(point2);
		System.out.println(point3);
		System.out.println(point4);
		System.out.println(point1.getX());
		point1.setX(-10);
		System.out.println(point1);
		point1.setX(point1.getX() - 5);
		System.out.println(point1);
		System.out.println(point1.distanceFromOrigin());
		System.out.println(point4.distanceFrom(point5));
		System.out.println(point5.equals(point6));
		System.out.println(point5.getSlopeOfLineSegment(point6));
		System.out.println();
		
		//LinearEquation Testing 
		LinearEquation equation1 = new LinearEquation(2, 5, 6);
		LinearEquation equation2 = new LinearEquation(5, point7);
		LinearEquation equation3 = new LinearEquation(equation1);
		LinearEquation equation4 = new LinearEquation(point7, point8);
		LinearEquation equation5 = new LinearEquation(equation1, point9);
		LinearEquation equation6 = new LinearEquation(0, 5, 6);
		LinearEquation equation7 = new LinearEquation(1, 0, 6);
		LinearEquation equation8 = new LinearEquation(1, 5, 0);
		LinearEquation equation9 = new LinearEquation(0, 5, 0);
		LinearEquation equation10 = new LinearEquation(1, 0, 0);
		Coords co = equation1.pointOfIntersection(equation6);
		
		System.out.println(equation1);
		System.out.println(equation2);
		System.out.println(equation3);
		System.out.println(equation4);
		System.out.println(equation5);
		System.out.println(equation6);
		System.out.println(equation7);
		System.out.println(equation8);
		System.out.println(equation9);
		System.out.println(equation10);
		System.out.println(co);
		System.out.println(equation1.shortestDistanceFrom(point9));
		System.out.println();
		
		//ComplexNumber Testing
		ComplexNumber num1 = new ComplexNumber(2, -5);
		ComplexNumber num2 = new ComplexNumber(8);
		ComplexNumber num3 = new ComplexNumber();
		ComplexNumber num4 = new ComplexNumber(num1);
		ComplexNumber num5 = num1.add(num4);
		ComplexNumber num6 = new ComplexNumber(5, -20);
		ComplexNumber num7 = num6.subtract(num1);
		ComplexNumber num8 = num6.multiply(num1);
		ComplexNumber num9 = num6.divideBy(num1);
		ComplexNumber num10 = num6.getConjugate();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		System.out.println(num10);
		
		QuadraticEquation quadraticEquation1 = new QuadraticEquation(1, 3, 4);
		ComplexNumber root1 = quadraticEquation1.getRoots()[0];
		ComplexNumber root2 = quadraticEquation1.getRoots()[1];
		System.out.println(root1);
		System.out.println(root2);
	}
}
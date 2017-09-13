import java.util.ArrayList;
public class TestShapes
{
	public static void main(String[] args)
	{
		Shape s1 = new Circle(5, "Chuck");
		
		Shape s2 = new Triangle(5, 9, 12, "Tyler");
		
		Shape s3 = new Rectangle(5, "Rob");
		
		Shape s4= new Circle(10, "Roberto");
		
		Shape s5= new Rectangle(9, 5, "Turner");
		
		Shape s6= new Triangle(6, 6, 6, "Goldman");
		
		Shape s7= new Rectangle(1, "Same");
		
		Shape s8= new Circle(100000, "myGrade");
		
		Shape s9= new Triangle(5, 10, 20, "Illuminatia");
		
		Shape s10= new Rectangle(15, 3, "Robert");
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(s1);
		shapes.add(s2);
		shapes.add(s3);
		shapes.add(s4);
		shapes.add(s5);
		shapes.add(s6);
		shapes.add(s7);
		shapes.add(s8);
		shapes.add(s9);
		shapes.add(s10);
		
		for (Shape s: shapes)
		{
			System.out.println(s);
		}
		
		descendingSort(shapes);
		
		System.out.println();
		
		for (Shape s: shapes)
		{
			System.out.println(s);
		}
		
	}
	
	public static void descendingSort(ArrayList<Shape> theShapes)
	{
		for (int i = 0; i < theShapes.size(); i++)
		{
			int biggestPos = i;
			for (int j = biggestPos + 1; j < theShapes.size(); j++)
			{
				if (theShapes.get(biggestPos).compareTo(theShapes.get(j)) < 0)
				{
					biggestPos = j;
				}
			}
			
			if (i != biggestPos)
			{
				swap(i, biggestPos, theShapes);
			}
		}
	}
	
	private static void swap(int a, int b, ArrayList<Shape> theShapes)
	{
		Shape temp = theShapes.get(a);
		theShapes.set(a, theShapes.get(b));
		theShapes.set(b, temp);
	}
}
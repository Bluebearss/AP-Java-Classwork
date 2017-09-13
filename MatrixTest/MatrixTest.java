public class MatrixTest
{
	public static void main (String[] args)
	{
		int [][] matrix = new int[4][9];
		
		for (int r = 0; r < matrix.length; r++)
		{
			for (int c = 0; c < matrix[0].length; c++)
			{
				matrix[r][c] = (int)(Math.random() * 601) + 200;
			}
		}
		
		System.out.println(totalOfXXValues(matrix));
		
		System.out.println(averageValues(matrix));
	}
	public static int totalOfXXValues(int[][] matrix)
	{
		int sum = 0;
		
		int smallerDimension = Math.min(matrix.length, matrix[0].length);
		
		for (int x = 0; x < smallerDimension; x++)
		{
			sum += matrix[x][x];
		}
		
		return sum;
	}
	
	public static double averageValues(int[][] matrix)
	{
		double sum = 0;
		int counter = 0;
		
		/*
		for (int r = 0; r < matrix.length; r++)
		{
			for (int c = 0; c < matrix[0].length; c++)
			{
				sum += matrix[r][c];
				counter++;
			}
		}
		
		return sum / counter;
		*/
		
		for (int[] r: matrix)
		{
			for (int c: r)
			{
				sum += c;
				counter++;
			}
		}
		
		return sum / counter;
	}
}
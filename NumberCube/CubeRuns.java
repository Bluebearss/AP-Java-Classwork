public class CubeRuns
{
	public static void main(String[] args)
	{
		NumberCube myCube = new NumberCube();
		int[] arr1 = {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5};
		
		printArray(arr1);
		
		System.out.println(getLongestRun(arr1));
		System.out.println();
		
		int[] arr2 = getCubeTosses(myCube, 20);
		
		printArray(arr2);
		
		System.out.println(getLongestRun(arr2));
		System.out.println();
		
		int[] arr3 = {5, 5, 5, 5, 5, 5, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5};
		
		printArray(arr3);
		
		System.out.println(getLongestRun(arr3));
		System.out.println();
		
		int[] arr4 = {1, 5, 7, 9, 1, 7, 2, 2, 2, 2, 6, 1, 3, 3, 6, 6, 6, 6, 6};
		
		printArray(arr4);
		
		System.out.println(getLongestRun(arr4));
		System.out.println();
		
		int[] arr5 = {1, 2, 3, 4, 5, 6};
		
		printArray(arr5);
		
		System.out.println(getLongestRun(arr5));
		System.out.println();
	}
	
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			
			if (i != arr.length - 1)
			{
				System.out.print(", ");
			}
		}
		
		System.out.println();
	}
	
	public static int[] getCubeTosses(NumberCube cube, int numTosses)
	{
		int[] cubeTosses = new int[numTosses];
		
		for (int i = 0; i < numTosses; i++)
		{
			cubeTosses[i] = cube.toss();
		}
		
		return cubeTosses;
	}
	
	public static int getLongestRun(int[] values)
	{
		int longestRunIndex = -1;
		int currentRunIndex = 0;
		int currentRunLength = 1;
		int longestRunLength = 1;
		
		for (int i = 1; i < values.length; i++)
		{
			if (values[i] == values[i - 1])
			{
				currentRunLength++;
			}
			else
			{
				if (currentRunLength > longestRunLength)
				{
					//update longestRun info
					longestRunIndex = currentRunIndex;
					longestRunLength = currentRunLength;
				}
				//reset currentRun info
				currentRunLength = 1;
				currentRunIndex = i;
			}
		}
		
		//just in case the longestRun is at the end of the array. It checks one more time.
		if (currentRunLength > longestRunLength)
		{
			longestRunIndex = currentRunIndex;
		}
		
		return longestRunIndex;
		
	}
}
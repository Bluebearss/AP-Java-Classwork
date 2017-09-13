public class Sept16
{
	public static void main(String[] args) /*Public means it can be accessed anywhere, 
	static means built in method, void means does not return a value just reports something. 
	main is the name of the method. String[] args is the parameter.*/
	{
		int[] nums1 = {2, 393, 7, 11, 26, 334, 79, 21, -783, 6, -7, 0, 88}; /*Declared a int array and assigned value 
		with {} and putting numbers inside. */
		System.out.println(nums1.length); //Says the length of 5 of the array.
		System.out.println(nums1[2]);
		System.out.println(nums1[nums1.length - 1]); //Says last number of array.
		/* System.out.println(nums1[nums1.length]); NOT a compiler error, a runtime error since last index 1 
		less than length.*/
		// System.out.println(nums1[5]);<--- Out of Bounds Error (Runtime Error)
		
		int[] nums2 = new int[26]; //The 6 represents the length of the new int array. The values all start at 0
		/*To make a new array of length 7, you have to make a new array of length 7 and copy the old array 
		into the new one. */
		nums2[0] = 1;
		nums2[4] = 970;
		System.out.println();
		for (int i = 0; i < nums1.length; i++)
		{
			System.out.print(nums1[i] + "   ");
		}
		
		System.out.println();
		
		for (int i = 0; i < nums2.length; i++)
		{
			System.out.print(nums2[i] + "   ");
		}
		
		System.out.println();
		
		printIt(nums1);
		printIt(nums2);
		
		printIt2(nums1);
		printIt2(nums2);
		
		System.out.println();
		
		System.out.println("nums1 total = " + getDeSum(nums1));
		
		System.out.println();
		
		System.out.println("nums1 average = " + getDeAverage(nums1));
	}
	
	public static void printIt(int[] arr)
	{
		int count = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			
			if (i < arr.length - 1)
			{
				System.out.print(", ");
			}
			
			count++;
			
			if (count % 10 == 0)
			{
				System.out.println();
			}
		}
		
		System.out.println();
	}
	
	public static void printIt2(int[] arr)
	{
		int column = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			
			if (i < arr.length - 1)
			{
				System.out.print(", ");
			}
			column = column + (("" + arr[i]).length()) + 2;
			
			if (column > 9)
			{
				column = 0;
				System.out.println();
			}
		}
		
		System.out.println();
	}
	
	public static int getDeSum(int[] array) /*Here we do not use a void because we are trying to return a 
	value from the method. Since it is returning the sum, we use a int as the return type.
	*/
	{
		int sum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		
		return sum;
	}
	
	public static double getDeAverage(int[] array)
	{	
		double average = 0;
		
		double sum = getDeSum(array);
		
		average = sum / array.length;
		
		return average;

	}
}
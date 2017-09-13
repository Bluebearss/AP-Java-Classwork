public class SortTests
{
	public static void main(String[] args)
	{
		int[] arr = {7, 8, 9, 11, 23, 69, 21, 235, 3490, 2, 1245, 129084390, 128375983};
		insertionSort(arr);
		printArr(arr);
		
		System.out.println();
		
		int[] arr2 = {34335, 34534, 34521, 123, 2, 4, 6, 5, 78967, 235, 8345, 2345};
		selectionSort(arr2);
		printArr(arr2);
		
		int[] nums = new int[100000];
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = (int)(Math.random() * 101);
		}
		
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		selectionSort(nums);
		end = System.currentTimeMillis();
		System.out.println("Selection Sort Milliseconds: " + (end - start));
		
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = (int)(Math.random() * 101);
		}
		
		start = System.currentTimeMillis();
		insertionSort(nums);
		end = System.currentTimeMillis();
		System.out.println("Insertion Sort Milliseconds: " + (end - start));
		
		System.out.println();
		System.out.println("Arrays already Sorted");
		
		start = System.currentTimeMillis();
		selectionSort(nums);
		end = System.currentTimeMillis();
		System.out.println("Selection Sort Milliseconds: " + (end - start));
		
		start = System.currentTimeMillis();
		insertionSort(nums);
		end = System.currentTimeMillis();
		System.out.println("Insertion Sort Milliseconds: " + (end - start));
		
	}
	
	public static void insertionSort(int[] elements)
	{
		for (int j = 1; j < elements.length; j++)
		{
			int temp = elements[j];
			int possibleIndex = j;
			
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
			{
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--;
			}
			
			elements[possibleIndex] = temp;
		}
	}
	
	public static void selectionSort(int[] values)
	{
		int minIndex;
		
		for (int i = 0; i < values.length - 1; i++)
		{
			minIndex = i;
			
			for (int j = i + 1; j < values.length; j++)
			{
				if (values[j] < values[minIndex])
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, values);
		}
		
	}
	
	private static void swap(int a, int b, int[] arr)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void printArr(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
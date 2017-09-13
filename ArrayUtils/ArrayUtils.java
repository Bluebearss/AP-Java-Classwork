public class ArrayUtils
{
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
	
	public static void selectionSort(String[] values)
	{
		int minIndex;
		
		for (int i = 0; i < values.length - 1; i++)
		{
			minIndex = i;
			
			for (int j = i + 1; j < values.length; j++)
			{
				if (values[j].compareTo(values[minIndex]) < 0)
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, values);
		}
		
	}
	
	public static void sortStudents(Student[] values)
	{
		int minIndex;
		
		for (int i = 0; i < values.length - 1; i++)
		{
			minIndex = i;
			
			for (int j = i + 1; j < values.length; j++)
			{
				if (values[j].compareTo(values[minIndex]) < 0)
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
	
	private static void swap(int a, int b, String[] arr)
	{
		String temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	private static void swap(int a, int b, Student[] arr)
	{
		Student temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static int[] insertElement(int value, int[] arrmateys)
	{
		int[] arr2 = new int[arrmateys.length + 1];
		
		for (int i = 0; i < arrmateys.length; i++)
		{
			arr2[i] = arrmateys[i];
		}
		
		arr2[arr2.length - 1] = value;
		
		return arr2;
	}
	
	//precondition: index < arrmateys.length
	public static int[] insertElement(int index, int value, int[] arrmateys)
	{
		int[] arr2 = new int[arrmateys.length + 1];
		
		for (int i = 0; i < arrmateys.length; i++)
		{
			if (i < index)
			{
				arr2[i] = arrmateys[i];
			}
			else
			{
				arr2[i + 1] = arrmateys[i]; 
			}
		}
		
		arr2[index] = value;
		
		return arr2;
	}
	
	//precondition: index < arrmateys.length && index >= 0
	public static int[] deleteElement(int index, int[] arrmateys)
	{
		int[] arr2 = new int[arrmateys.length - 1];
		/*
		for (int i = 0; i < arr2.length; i++)
		{
			if (i >= index)
			{
				arr2[i] = arrmateys[i + 1]; 
			}
			else
			{
				arr2[i] = arrmateys[i];
			}
		}
		*/
		for (int i = 0; i < index; i++)
		{
			arr2[i] = arrmateys[i];
		}
		
		for (int i = index + 1; i < arrmateys.length; i++)
		{
			arr2[i - 1] = arrmateys[i];
		}
		
		return arr2;
	}
	
	public static int sum(int[] arrmateys)
	{
		int sum = 0;
		
		for (int i = 0; i < arrmateys.length; i++)
		{
			sum += arrmateys[i];
		}
		
		return sum;
	}
	
	public static double average(int[] arrmateys)
	{
		if (arrmateys.length == 0)
		{
			return -999999;
		}
		
		double sum = sum(arrmateys);
		
		double average = sum / arrmateys.length;
		
		return average;
	}
	
	public static int sumPositiveValues(int[] arrmateys)
	{
		int sum = 0;
		
		for (int i = 0; i < arrmateys.length; i++)
		{
			if (arrmateys[i] > 0)
			{
				sum += arrmateys[i];
			}
		}
		
		return sum;
	}
	
	public static double averagePositiveValues(int[] arrmateys)
	{
		double sum = sumPositiveValues(arrmateys);
		
		int counter = 0;
		
		for (int i = 0; i < arrmateys.length; i++)
		{
			if (arrmateys[i] > 0)
			{
				counter++;
			}
		}
		
		if (counter == 0)
		{
			return -999999;
		}
		
		double average = sum / counter;
		
		return average;
	}
	
	//PRECONDITION: Arr.length > 0
	
	public static int largestValue (int[] arrmateys)
	{
		if (arrmateys.length == 0)
		{
			return 0;
		}
		
		int largestNum = arrmateys[0];
		
		// int largestNum = Integer.MIN_VALUE; ----> RETURNS THE SMALLEST POSSIBLE NUMBER: (-2)^31
		
		for (int i = 1; i < arrmateys.length; i++)
		{
			if (arrmateys[i] > largestNum)
			{
				largestNum = arrmateys[i];
			}
		}
		
		return largestNum;
	}
	
	public static int positionofLargestValue(int[] arrmateys)
	{
		int position = 0;

		for (int i = 0; i < arrmateys.length; i++)
		{
			if (arrmateys[i] > arrmateys[position])
			{
				position = i;
			}
		}
		
		return position;
	}
	
	
}
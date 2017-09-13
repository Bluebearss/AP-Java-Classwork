import java.util.ArrayList;

public class Primes
{
	public static boolean isPrime(int num)
	{
		if (num < 2)
		{
			return false;
		}
		
		if (num == 2)
		{
			return true;
		}
		
		if (num % 2 == 0)
		{
			return false;
		}
		
		for (int i = 3;i * i <= num; i+= 2)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static int[] getPrimes(int start, int numberOfPrimes)
	{
		int[] primeArray = new int[numberOfPrimes];
		int currentNum = start;
		int counter = 0;
		
		while (counter < numberOfPrimes)
		{
			if (isPrime(currentNum))
			{
				primeArray[counter] = currentNum;
				counter++;
			}
			
			currentNum++;
		}
			
		return primeArray;
	}
	
	public static int[] getPrimesWithinRange(int minValue, int maxValue)
	{
		int currentNum = minValue;
		int length = 0;
		
		while (currentNum <= maxValue)
		{
			if (isPrime(currentNum))
			{
				length++;
			}
			
			currentNum++;
		}
		
		int[] primeArray = new int[length];
		
		currentNum = minValue;
		
		int counter = 0;
		
		while (currentNum <= maxValue)
		{
			if (isPrime(currentNum))
			{
				primeArray[counter] = currentNum;
				counter++;
			}
			
			currentNum++;
		}
		
		return primeArray;
		
	}
	
	public static ArrayList<Integer> getPrimesListWithinRange(int minValue, int maxValue)
	{
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		
		for (int i = minValue; i <= maxValue; i++)
		{
			if (isPrime(i))
			{
				primeList.add(i);
			}
		}
		
		return primeList;
	}
	
	public static void main(String[] args)
	{
		System.out.println(isPrime(1));
		System.out.println();
		
		int[] arr1 = getPrimes(1, 5);
		int[] arr2 = getPrimesWithinRange(1, 5);
		ArrayList<Integer> primeList = getPrimesListWithinRange(1, 5);
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		for (int i = 0; i < primeList.size(); i++)
		{
			System.out.println(primeList.get(i));
		}
		
		
	}
}
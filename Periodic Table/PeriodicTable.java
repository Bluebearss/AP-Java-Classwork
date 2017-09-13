public class PeriodicTable
{
	private Element[] periodicTable;
	
	public PeriodicTable(Element[] thePeriodicTable)
	{
		periodicTable = thePeriodicTable;
	}
	
	private static void swap(int a, int b, Element[] arr)
	{
		Element temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public void sortAlphabetically()
	{
		for (int i = 0; i < periodicTable.length - 1; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < periodicTable.length; j++)
			{
				if (periodicTable[j].getName().compareTo(periodicTable[minIndex].getName()) < 0)
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, periodicTable);
		}
	}
	
	public void sortByAtomicWeight()
	{
		for (int i = 0; i < periodicTable.length - 1; i++)
		{
			int maxIndex = i;
			
			for (int j = i + 1; j < periodicTable.length; j++)
			{
				if (periodicTable[j].getAtomicWeight() > periodicTable[maxIndex].getAtomicWeight())
				{
					maxIndex = j;
				}
			}
			
			swap(maxIndex, i, periodicTable);
		}
	}
	
	public void sortByAtomicNumber()
	{
		for (int i = 0; i < periodicTable.length - 1; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < periodicTable.length; j++)
			{
				if (periodicTable[j].getAtomicNumber() < periodicTable[maxIndex].getAtomicNumber())
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, periodicTable);
		}
	}
	
	public void sortByFamily()
	{
		for (int i = 0; i < periodicTable.length - 1; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < periodicTable.length; j++)
			{
				if (periodicTable[j].getFamily().compareTo(periodicTable[minIndex].getFamily()) < 0)
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, periodicTable);
		}
	}
	
	public void sortByAtomicSymbol()
	{
		for (int i = 0; i < periodicTable.length - 1; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < periodicTable.length; j++)
			{
				if (periodicTable[j].getSymbol().compareTo(periodicTable[minIndex].getSymbol()) < 0)
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, periodicTable);
		}
	}
	
	public Element binarySearch(String symbol)
	{
		int low = 0;
		
		int high = periodicTable.length - 1;
			
		while (low <= high)
		{
			int middle = (low + high) / 2;
			
			if (symbol.compareTo(periodicTable[middle].getSymbol()) < 0)
			{
				high = middle - 1;
			}
			else
			{
				if (symbol.compareTo(periodicTable[middle].getSymbol()) > 0)
				{
					low = middle + 1;
				}
				else
				{
					return periodicTable[middle];
				}
			}	
		}
		
		return null;
	}
	
	public String toString()
	{
		String output = "";
		for (Element e : periodicTable)
			output += e.toString() + "\n";
		output += "\n";
		
		return output;
	}
}
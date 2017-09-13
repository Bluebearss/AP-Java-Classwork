public class Restaurant
{
	private String name;
	private double sales;
	private String mainFood;
	private boolean isOpenAllDay;
	private boolean hasKidsMenu;
	private int yearFounded;
	
	public Restaurant(String rName, double rSales, String rMainFood, boolean rIsOpenAllDay, boolean 
					 rHasKidsMenu, int rYearFounded)
	{
		name = rName;
		sales = rSales;
		mainFood = rMainFood;
		isOpenAllDay = rIsOpenAllDay;
		hasKidsMenu = rHasKidsMenu;
		yearFounded = rYearFounded;
	}
	
	public Restaurant()
	{
		name = "";
		sales = 0;
		mainFood = "";
		isOpenAllDay = false;
		hasKidsMenu = false;
		yearFounded = 0;
	}
	
	public int compareTo(Restaurant other)
	{
		return this.name.compareTo(other.name);
	}
	
	public int mainFoodSalesCompareTo(Restaurant other)
	{
		int mainFoodCompare = this.mainFood.compareTo(other.mainFood);
		
		if (mainFoodCompare != 0)
		{
			return mainFoodCompare;
		}
		
		if (this.sales > other.sales)
		{
			return -1;
		}
		
		if (this.sales < other.sales)
		{
			return 1;
		}
		
		return 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSales()
	{
		return sales;
	}
	
	public String getMainFood()
	{
		return mainFood;
	}
	
	public boolean isOpenAnytime()
	{
		return isOpenAllDay;
	}
	
	public boolean containsKidsMenu()
	{
		return hasKidsMenu;
	}
	
	public int getYearFounded()
	{
		return yearFounded;
	}
	
	public int yearsSinceFounded()
	{
		return 2016 - yearFounded;
	}
	
	public double averageSalesInBillionsSinceFounded()
	{
		return sales / yearsSinceFounded();
	}
	
	public String toString()
	{
		return name + ", " + "Sales(in billions): " + sales + ", " + "Main Food: " + mainFood + ", " + "Open All Day?: " + isOpenAllDay + ", " +
		"Has Kids Menu?: " + hasKidsMenu + ", " + "Year Founded: " + yearFounded;
	}
}
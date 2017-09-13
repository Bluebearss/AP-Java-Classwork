import java.util.ArrayList;
import java.util.List;

public class Restaurants
{
	private ArrayList<Restaurant> restaurants;
	
	public Restaurants(ArrayList<Restaurant> theRestaurants)
	{
		restaurants = theRestaurants;
	}
	
	private static void swap(int a, int b, ArrayList<Restaurant> arr)
	{
		Restaurant temp = arr.get(a);
		arr.set(a, arr.get(b));
		arr.set(b, temp);
	}
	
	public void sortAlphabetically()
	{
		for (int i = 0; i < restaurants.size() - 1; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < restaurants.size(); j++)
			{
				if (restaurants.get(j).compareTo(restaurants.get(minIndex)) < 0)
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, restaurants);
		}
	}
	
	public void sortBySales()
	{
		for (int i = 0; i < restaurants.size() - 1; i++)
		{
			int maxIndex = i;
			
			for (int j = i + 1; j < restaurants.size(); j++)
			{
				
				if (restaurants.get(j).getSales() > restaurants.get(maxIndex).getSales())
				{
					maxIndex = j;
				}
			}
			
			swap(maxIndex, i, restaurants);
		}
	}
	
	public void sortByYearFounded()
	{
		for (int i = 0; i < restaurants.size() - 1; i++)
		{
			int maxIndex = i;
			
			for (int j = i + 1; j < restaurants.size(); j++)
			{
				
				if (restaurants.get(j).getYearFounded() > restaurants.get(maxIndex).getYearFounded())
				{
					maxIndex = j;
				}
			}
			
			swap(maxIndex, i, restaurants);
		}
	}
	
	public void sortByMainFoodSales()
	{
		for (int i = 0; i < restaurants.size() - 1; i++)
		{
			int maxIndex = i;
			
			for (int j = i + 1; j < restaurants.size(); j++)
			{
				
				if (restaurants.get(j).mainFoodSalesCompareTo(restaurants.get(maxIndex)) < 0)
				{
					maxIndex = j;
				}
			}
			
			swap(maxIndex, i, restaurants);
		}
	}
	
	//precondition: return first instance of a restaurant
	public Restaurant getSpecificRestaurant(String name)
	{
		Restaurant specificRestaurant = new Restaurant();
		
		for (Restaurant r: restaurants)
		{
			if (r.getName().equals(name))
			{
				specificRestaurant = r;
			}
		}
		
		return specificRestaurant;
	}
	
	public ArrayList<Restaurant> getRestaurantsByMainFood(String mainFood)
	{
		ArrayList<Restaurant> mainFoodList = new ArrayList<Restaurant>();
		
		for (Restaurant r: restaurants)
		{
			if (r.getMainFood().equals(mainFood))
			{
				mainFoodList.add(r);
			}
		}
		
		return mainFoodList;
	}
	
	public ArrayList<Restaurant> getRestaurantsIfOpenAllDayAndHasKidsMenu()
	{
		ArrayList<Restaurant> openAllDayKidsMenuList = new ArrayList<Restaurant>();
		
		for (Restaurant r: restaurants)
		{
			if (r.isOpenAnytime() && r.containsKidsMenu())
			{
				openAllDayKidsMenuList.add(r);
			}
		}
		
		return openAllDayKidsMenuList;
	}
	
	public ArrayList<Restaurant> getRestaurantsByCertainYear(int restrictionYear)
	{
		ArrayList<Restaurant> yearList = new ArrayList<Restaurant>();
		
		for (Restaurant r: restaurants)
		{
			if (r.getYearFounded() >= restrictionYear)
			{
				yearList.add(r);
			}
		}
		
		return yearList;
	}
	
	public ArrayList<Restaurant> getRestaurantsByYearFounded(int year)
	{
		ArrayList<Restaurant> yearList = new ArrayList<Restaurant>();
		
		for (Restaurant r: restaurants)
		{
			if (r.getYearFounded() == year)
			{
				yearList.add(r);
			}
		}
		
		return yearList;
	}
	
	public int removeByMainFood(String mainFood)
	{
		int counter = 0;
		
		for (int i = restaurants.size() - 1; i >= 0; i--)
		{
			if (restaurants.get(i).getMainFood().equals(mainFood))
			{
				restaurants.remove(i);
				counter++;
			}
		}
		
		return counter;
	}
	
	public int removeByYearFounded(int year)
	{
		int counter = 0;
		
		for (int i = restaurants.size() - 1; i >= 0; i--)
		{
			if (restaurants.get(i).getYearFounded() < year)
			{
				restaurants.remove(i);
				counter++;
			}
		}
		
		return counter;
	}
	
	public double totalAverageSalesInBillions()
	{
		double sum = 0;
		
		for (Restaurant r: restaurants)
		{
			sum += r.averageSalesInBillionsSinceFounded();
		}
		
		return sum;
	}
	
	public String toString()
	{
		String output = "";
		for (Restaurant s : restaurants)
		{
			output += s.toString() + "\n";
		}
		
		output += "\n";
		
		return output;
	}
}
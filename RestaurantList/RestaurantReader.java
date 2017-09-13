import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class RestaurantReader
{
	public static void main(String[] args) throws Exception
	{
		String filename = "restaurants.csv";
		File inputFile = new File(filename);
		if(!inputFile.exists())
			System.out.println("File does not exist.");
		else
		{
			Scanner input = new Scanner(inputFile);
						
			//count number of records, excluding title row
			int numOfRecords = -1;
			while (input.hasNextLine())
			{
				input.nextLine();
				numOfRecords++;
			}
			
			if(numOfRecords > 0)
			{
				ArrayList<Restaurant> myRestaurants = new ArrayList<Restaurant>();
				input = null;
				input = new Scanner(inputFile);
				input.nextLine();  //read heading line
				
				String rowOfData, rName, rMainFood;
				double rSales;
				int rYearFounded;
				boolean rIsOpenAllDay, rHasKidsMenu;
				String[] splitRowOfData;
				
				while (input.hasNextLine())
				{
					rowOfData = input.nextLine();
					splitRowOfData = rowOfData.split(",");
					rName = splitRowOfData[0];
					rSales = Double.parseDouble(splitRowOfData[1]);
					rMainFood = splitRowOfData[2];
					rIsOpenAllDay = Boolean.parseBoolean(splitRowOfData[3]);
					rHasKidsMenu = Boolean.parseBoolean(splitRowOfData[4]);
					rYearFounded = Integer.parseInt(splitRowOfData[5]);
					
					myRestaurants.add(new Restaurant(rName, rSales, rMainFood, rIsOpenAllDay, rHasKidsMenu, rYearFounded));
				}//end while
				
				Restaurants theRestaurants = new Restaurants(myRestaurants);
				System.out.println("Restaurant List");
				System.out.println(theRestaurants);
				
				theRestaurants.sortAlphabetically();
				System.out.println("Restaurant List in Alphabetical Order");
				System.out.println(theRestaurants);
				
				theRestaurants.sortBySales();
				System.out.println("Restaurant List Sorted By Sales, Largest to Smallest");
				System.out.println(theRestaurants);
				
				theRestaurants.sortByYearFounded();
				System.out.println("Restaurant List Sorted By Year Founded, Newest to Oldest");
				System.out.println(theRestaurants);
				
				theRestaurants.sortByMainFoodSales();
				System.out.println("Restaurant List Sorted By Main Food in Alphabetical Order and Within Each Main Food the Sales, Largest to Smallest");
				System.out.println(theRestaurants);
				
				System.out.println("Returns a Specific Restaurant Given a Name");
				System.out.println(theRestaurants.getSpecificRestaurant("IHOP"));
				System.out.println();
				
				System.out.println("Returns a Restaurant List of Restaurants That Contains the Given Main Food");
				ArrayList<Restaurant> sandwichList = theRestaurants.getRestaurantsByMainFood("sandwich");
				for(Restaurant r: sandwichList)
				{
					System.out.println(r);
				}
				
				System.out.println();
				
				System.out.println("Returns a Restaurant List of Restaurants That Opens All Day and Has a Kids Menu");
				ArrayList<Restaurant> openAllDayAndKidsMenuList = theRestaurants.getRestaurantsIfOpenAllDayAndHasKidsMenu();
				for(Restaurant r: openAllDayAndKidsMenuList)
				{
					System.out.println(r);
				}
				
				System.out.println();
				
				System.out.println("Returns a Restaurant List of Restaurants That Is Founded Later Or On the Given Year");
				ArrayList<Restaurant> certainYearList = theRestaurants.getRestaurantsByCertainYear(1980);
				for(Restaurant r: certainYearList)
				{
					System.out.println(r);
				}
				
				System.out.println();
				
				System.out.println("Returns a Restaurant List of Restaurants That Is Founded On the Given Year");
				ArrayList<Restaurant> yearList = theRestaurants.getRestaurantsByYearFounded(1984);
				for(Restaurant r: yearList)
				{
					System.out.println(r);
				}
				
				System.out.println();
				
				System.out.println("Removes All the Restaurants That Have the Given Main Food and Returns How Many Restaurants Were Removed");
				System.out.println(theRestaurants.removeByMainFood("sandwich"));
				System.out.println();
				
				System.out.println("Removes All the Restaurants That Are Founded Earlier Than the Given Year and Returns How Many Restaurants Were Removed");
				System.out.println(theRestaurants.removeByYearFounded(1975));
				System.out.println();
				
				System.out.println("Returns the total average sales in billions of all the restaurants by getting the average of each restaurant and adding it up");
				System.out.println(theRestaurants.totalAverageSalesInBillions());
			}//end if
		}//end else			
	}//end of main method
}//end of class
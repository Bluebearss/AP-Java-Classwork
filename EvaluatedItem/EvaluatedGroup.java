import java.util.List;
public class EvaluatedGroup implements EvaluatedItem
{
	private String groupName;
	private List<EvaluatedItem> items;
	
	public EvaluatedGroup(String name, List<EvaluatedItem> itemList)
	{
		groupName = name;
		items = itemList;
	}
	
	public boolean qualified()
	{
		for (int i = 0; i < items.size(); i++)
		{
			if(!items.get(i).qualified())
			{
				return false;
			}
		}
		
		return true;
	}
	
	public String getName()
	{
		return groupName;
	}
}
import java.util.ArrayList;
import java.util.List;

public class Students
{
	private ArrayList<Student> students;
	
	public Students(ArrayList<Student> theStudents)
	{
		students = theStudents;
	}
	
	public void sortAlphabetically()
	{
		for(int i = 0; i < students.size() - 1; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < students.size(); j++)
			{
				if (students.get(j).compareTo(students.get(minIndex)) < 0)
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, students);
		}
	}
	
	public void sortByGPA()
	{
		for(int i = 0; i < students.size() - 1; i++)
		{
			int maxIndex = i;
			
			for (int j = i + 1; j < students.size(); j++)
			{
				if (students.get(j).gpa() > students.get(maxIndex).gpa())
				{
					maxIndex = j;
				}
			}
			
			swap(maxIndex, i, students);
		}
	}
	
	public void sortByBoroughGPA()
	{
		for(int i = 0; i < students.size() - 1; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < students.size(); j++)
			{
				if (students.get(j).boroughGPACompareTo(students.get(minIndex)) < 0)
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, students);
		}
	}
	
	private static void swap(int a, int b, ArrayList<Student> arr)
	{
		Student temp = arr.get(a);
		arr.set(a, arr.get(b));
		arr.set(b, temp);
		
		//One Line: students.set(b, students.set(a, students.get(b)));
	}
	
	public ArrayList<Student> getStudentsByBorough(String boro)
	{
		ArrayList<Student> boroList = new ArrayList<Student>();
		
		for (Student s : students)
		{
			if (s.getBorough().equals(boro))
			{
				boroList.add(s);
			}
		}
		
		return boroList;
		
		/*
		int count = 0;
	
		for (Student s : students)
			if (s.getBorough().equals(boro))
				count++;
				
		Student[] boroList = new Student[count];
		count = 0;
		for (Student s : students)
		{
			if (s.getBorough().equals(boro))
			{
				boroList[count] = s;
				count++;
			}
		}
				
		return boroList;
		*/
	}
	
	public int removeByBorough(String boro)
	{
		int counter = 0;
		
		for (int i = students.size() - 1; i >= 0; i--)
		{
			if (students.get(i).getBorough().equals(boro))
			{
				students.remove(i);
				counter++;
			}
		}
		
		return counter;
	}
	
	public int removeTopStudents(double score)
	{
		int counter = 0;
		
		for (int i = students.size() - 1; i >= 0; i--)
		{
			if (students.get(i).gpa() >= score)
			{
				students.remove(i);
				counter++;
			}
		}
		
		return counter;
	}
	
	public String toString()
	{
		String output = "";
		for (Student s : students)
			output += s.toString() + "\n";
		output += "\n";
		
		return output;
	}
}
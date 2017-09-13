import java.util.ArrayList;

public class Students
{
	private Student[] students;
	
	public Students(Student[] theStudents)
	{
		students = theStudents;
	}
	
	public void sortAlphabetically()
	{
		for(int i = 0; i < students.length - 1; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < students.length; j++)
			{
				if (students[j].compareTo(students[minIndex]) < 0)
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, students);
		}
	}
	
	public void sortByGPA()
	{
		for(int i = 0; i < students.length - 1; i++)
		{
			int maxIndex = i;
			
			for (int j = i + 1; j < students.length; j++)
			{
				if (students[j].gpa() > students[maxIndex].gpa())
				{
					maxIndex = j;
				}
			}
			
			swap(maxIndex, i, students);
		}
	}
	
	public void sortByBoroughGPA()
	{
		for(int i = 0; i < students.length - 1; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < students.length; j++)
			{
				if (students[j].boroughGPACompareTo(students[minIndex]) < 0)
				{
					minIndex = j;
				}
			}
			
			swap(minIndex, i, students);
		}
	}
	
	private static void swap(int a, int b, Student[] arr)
	{
		Student temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
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
	
	public String toString()
	{
		String output = "";
		for (Student s : students)
			output += s.toString() + "\n";
		output += "\n";
		
		return output;	
		
	}
}
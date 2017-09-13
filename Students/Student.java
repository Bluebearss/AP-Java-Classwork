public class Student
{
	private String lastName;
	private String firstName;
	private String borough;
	private int[] grades;
	
	public Student(String lName, String fName, 
					String boro, int[] grades)
	{
		lastName = lName;
		firstName = fName;
		borough = boro;
		this.grades = grades;
	}
	
	public int compareTo(Student other)
	{
		int lastCompare = 
			this.lastName.compareTo(other.lastName);
		if (lastCompare == 0)
			return this.firstName.compareTo(
									other.firstName);
			
		return lastCompare;
	}
	
	public int boroughGPACompareTo(Student other)
	{
		int boroCompare = this.getBorough().compareTo(other.borough);
		
		if (boroCompare != 0)
		{
			return boroCompare;
		}
		
		if (this.gpa() > other.gpa())
		{
			return -1;
		}
		
		if (this.gpa() < other.gpa())
		{
			return 1;
		}
		
		return 0;
	}
	
	public double gpa()
	{
		int total = 0;

		for (int grade : grades)
			total += grade;
		
		return (double)total / grades.length;
	}
	
	public String toString()
	{
		return firstName + " " + lastName + ", " + borough + ", gpa = " + gpa();
	}
	
	public String getBorough()
	{
		return borough;
	}
}
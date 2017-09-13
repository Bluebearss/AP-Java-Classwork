public class Student
{
	private String firstName;
	private String lastName;
	private int idNo;
	private int[] grades;
	
	public Student(String fName, String lName, int osis)
	{
		firstName = fName;
		lastName = lName;
		idNo = osis;
	}
	public boolean equals(Student other)
	{
		return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName) && this.idNo ==
		other.idNo;
	}
	
	public int compareTo(Student other)
	{
		int lastCompare = this.lastName.compareTo(other.lastName);
		
		if (lastCompare != 0)
		{
			return lastCompare;
		}
		
		int firstCompare = this.firstName.compareTo(other.firstName);
		
		if (firstCompare != 0)
		{
			return firstCompare;
		}
		
		return this.idNo - other.idNo;
	}
	
	public String toString()
	{
		return lastName + ", " + firstName+ ", " + idNo;
	}	
}
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class StudentReader
{
	public static void main(String[] args) throws Exception
	{
		String filename = "students.csv";
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
				//instantiate new Students object, which includes a Student array
			if(numOfRecords > 0)
			{
				Student[] myStudents = new Student[numOfRecords];
				input = null;
				input = new Scanner(inputFile);
				input.nextLine();  //read heading line
				
				String rowOfData, lName, fName, boro;
				String[] splitRowOfData;
				int studIndex = 0;
				
				while (input.hasNextLine())	
					//prepare student test array
				{
					rowOfData = input.nextLine();
					splitRowOfData = rowOfData.split(",");
					lName = splitRowOfData[0];
					fName = splitRowOfData[1];
					boro = splitRowOfData[2];
					int[] tests = new int[4];
					for (int i = 0; i < tests.length; i++)
						tests[i] = Integer.parseInt(splitRowOfData[i + 3]);
						
				
					//instantiate new Student
					myStudents[studIndex] = new Student(lName, fName, boro,
																tests);
																
					studIndex++; 
				}//end while
				Students theStudents = new Students(myStudents);
			//	StudentReports stReports = new StudentReports(myStudents);
				System.out.println(theStudents);
				System.out.println();
				
				theStudents.sortAlphabetically();
				System.out.println(theStudents);
				System.out.println();
				
				theStudents.sortByGPA();
				System.out.println(theStudents);
				System.out.println();
				
				theStudents.sortByBoroughGPA();
				System.out.println(theStudents);
				System.out.println();
				
				ArrayList<Student> brooklyn = theStudents.getStudentsByBorough("Brooklyn");
				for (Student s : brooklyn)
				{
					System.out.println(s);
				}
				System.out.println();
				
			}//end if
		}//end else			
	}//end of main method
} //end of class
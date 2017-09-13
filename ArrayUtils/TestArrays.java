public class TestArrays
{
	public static void main(String[] args)
	{
		Student[] students = new Student[10];
		
		students[0] = new Student("Benny", "Loo", 999);
		students[1] = new Student("Farhan", "Ahmed", 293);
		students[2] = new Student("Brian", "Zhu", 163);
		students[3] = new Student("Robert", "Leung", 556);
		students[4] = new Student("Xuejin", "Gao", 173);
		students[5] = new Student("Ryan", "Lau", 772);
		students[6] = new Student("Edmon", "Rober", 816);
		students[7] = new Student("Timothy", "Morales", 516);
		students[8] = new Student("Ben", "Cui", 368);
		students[9] = new Student("Arman", "Uddin", 777);
		
		ArrayUtils.sortStudents(students);
		
		for (int i = 0; i < students.length; i++)
		{
			System.out.print(students[i] + "  ");
			System.out.println();
		}
		
		/*
		int[] array1 = {25, 16, 14, 7, 4, 88, 266, -57, -924, -1};
		
		array1 = ArrayUtils.insertElement(2, 69, array1);
		
		for (int i = 0; i < array1.length; i++)
		{
			System.out.print(array1[i] + "  ");
		}
		
		System.out.println();
		
		ArrayUtils.selectionSort(array1);
		
		for (int i = 0; i < array1.length; i++)
		{
			System.out.print(array1[i] + "  ");
		}
		
		System.out.println();
		
		String[] names = new String[10];
		names[0] = "Benny";
		names[1] = "Farhan";
		names[2] = "Brian";
		names[3] = "Robert";
		names[4] = "Xuejin";
		names[5] = "Ryan";
		names[6] = "Edmon";
		names[7] = "Timothy";
		names[8] = "Ben";
		names[9] = "Arman";
		
		ArrayUtils.selectionSort(names);
		
		for (int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + "  ");
		}
		
		System.out.println();
		
		int sum1 = ArrayUtils.sum(array1);
		
		System.out.println("hey bois 8^), sum1 = " + sum1);
		
		double average1 = ArrayUtils.average(array1);
		
		System.out.println("hey bois 8^), average1 = " + average1);
		
		int positivesum1 = ArrayUtils.sumPositiveValues(array1);
		
		System.out.println("hey bois 8^), positivesum1 = " + positivesum1);
		
		double positiveaverage1 = ArrayUtils.averagePositiveValues(array1);
		
		System.out.println("hey bois 8^), positiveaverage1 = " + positiveaverage1);
		
		int largestNum1 = ArrayUtils.largestValue(array1);
		
		System.out.println("hey bois 8^), largestNum1 = " + largestNum1);
		
		int positionLargestNum1 = ArrayUtils.positionofLargestValue(array1);
		
		System.out.println("hey bois 8^), positionLargestNum1 = " + positionLargestNum1);
		*/	
	}
}
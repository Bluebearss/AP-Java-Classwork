public class TestStudents
{
	public static void main(String[] args)
	{
		Student s = new Student("Samuel", new int[] {74, 65, 70}, "none");
		
		Student u = new UnderGrad("Ulysses", new int[] {74, 65, 70}, "none");
		
		Student g = new GradStudent("Gunner", new int[] {95, 90, 85}, "none", 1234);
		
		s.computeGrade();
		u.computeGrade();
		g.computeGrade();
		
		System.out.println(s.getName() + ", " + s.getGrade());
		System.out.println(u.getName() + ", " + u.getGrade());
		System.out.println(g.getName() + ", " + g.getGrade());
		/*Student s still passes with same grades b/c when you run it, Student s becomes what it is declared, not instantiated.
		Student u failed b/c it is a underGrad.*/
		
		int gradNum = ((GradStudent)g).getID();
		System.out.println(gradNum);
	}
}
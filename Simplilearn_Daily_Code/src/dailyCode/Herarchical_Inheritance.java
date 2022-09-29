package dailyCode;
class marks
{
	void marksStudent()
	{
		int grade[]= {45,56,78,93,38,46};
		for(int i=0;i<grade.length;i++)
		{
			System.out.println(grade[i]);
		}
	}
}
class name 
{
	void nameStudent()
	{
		String fullName[]= {"Rohit","Anjali","Rahul","Roshan","Sudip"};
	}
}

public class Herarchical_Inheritance extends marks
{
	public static void main (String args[])
	{
		System.out.println("Herarchical Inheritance");
		Herarchical_Inheritance herIn=new Herarchical_Inheritance();
		herIn.marksStudent();
	}
}

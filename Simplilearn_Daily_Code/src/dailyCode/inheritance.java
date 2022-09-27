package dailyCode;
class emp //just create a emp class and using extends i inheritate the class of emp to inheritance class!!
{
	long mobile=700310;
	String name="Rohit Kumar Jha";
	String colour="White";
}
public class inheritance extends emp
{
	public static void main (String args[])
	{
		inheritance Inthe =new inheritance();//Creating a object !!
		System.out.println("Name:-"+Inthe.name+"\nMobile:-"+Inthe.mobile);
		System.out.println("Colour:-"+Inthe.colour);
		
	}
}

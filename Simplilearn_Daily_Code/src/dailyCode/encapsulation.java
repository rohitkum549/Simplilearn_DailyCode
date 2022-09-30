package dailyCode;
class Area
{
	int length;
	int breath;
	Area(int length, int breath)//constructor of Area class !!!!
	{
		this.length=length;
		this.breath=breath;
	}
	public void getArea() //method 
	{
		int area=length*breath;
		System.out.println("Area: "+area);
	}
}
public class encapsulation 
{
	public static void main(String args[])
	{
		int n=5,t=6;
		Area Rectangle=new Area(n,t);
		Rectangle.getArea();
		Area Square=new Area(4,4);
		Square.getArea();
	}
}

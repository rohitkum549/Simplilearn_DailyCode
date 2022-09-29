package dailyCode;
import java.util.*;
public class multiDimensional 
{
	public static void main(String args[])
	{
		Scanner X=new Scanner (System.in);
		System.out.println("Enter the Row");
		int row=X.nextInt();
		System.out.println("Enter the Coloums");
		int coloums=X.nextInt();
		int arr[][]=new int[row][coloums];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloums;j++)
			{
				arr[i][j]=X.nextInt();
			}
		}
		for(int k=0;k<row;k++)
		{
			for(int i=0;i<coloums;i++)
			{
				System.out.print(arr[k][i]+"\t");
			}
			System.out.println();
		}
		X.close();
	}
}

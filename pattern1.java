package day2_programs;
import java.util.*;
public class pattern1 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter a number:");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
//		System.out.print(i);
		for(int j=1;j<=n;j++)
		{
	  		if(i==1 || j==1||i==n || j==n)
			{
			System.out.print(j);
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}
}
	

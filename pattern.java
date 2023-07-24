package day1_program;
import java.util.*;
public class pattern {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter a number:");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
	
	



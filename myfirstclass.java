package day1_program;
import java.util.*;
public class myfirstclass {

	public static void main(String[] args) {
		int a, b,c, d;
		
		System.out.println("i'm Here...!");
		System.out.println("ya...welcome..back!");
		System.out.println("yub....");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the numbers to Add: ");
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		
		a=b+c+d;
		System.out.println("addition of "+b+" and "+c+" and "+d+ "is" +a);

		input.close();
	}

}
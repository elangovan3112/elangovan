package Inheritance_day3;

import java.util.Scanner;

public class TestCase7 {
	

	public static void main(String[] args) {
		String Line;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the String:");
		Line=s.nextLine();
		int a=0,e=0,j=0,o=0,u=0;
		for(int i=0;i<Line.length();i++) {
			if(Line.charAt(i)=='a'||Line.charAt(i)=='A') {
				a++;
			}
			if(Line.charAt(i)=='e'||Line.charAt(i)=='E') {
				e++;
			}
			if(Line.charAt(i)=='i'||Line.charAt(i)=='I') {
				j++;
			}if(Line.charAt(i)=='o'||Line.charAt(i)=='O') {
				o++;
			}
			if(Line.charAt(i)=='u'||Line.charAt(i)=='U') {
				u++;
			}
		
		}
		System.out.println("a:"+a+"\n e:"+e+"\n i:"+j+"\n o:"+o+"\n u:"+u);
		

	}

}

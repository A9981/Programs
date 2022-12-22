package programpractice;

import java.util.Scanner;

public class BiggestInDouble {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter four Double values");
		double a=s.nextDouble();
		double b=s.nextDouble();
		double c=s.nextDouble();
		double d=s.nextDouble();
		
		if(a>b&&a>c&&a>d)
			System.out.println(a+" is the biggest num");
		else if(b>c&&b>d)
			System.out.println(b+" is the biggest num");
		else if(c>d)
			System.out.println(c+" is the biggest num");
		else
			System.out.println(d+" is the biggest num");
		
		
		
	}

}

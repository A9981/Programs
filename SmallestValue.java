package programpractice;

import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two num");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		
		if(x<y)
			System.out.println(x+" is a smallest value");
		else
			System.out.println(y+" is a smallest value");
	}

}

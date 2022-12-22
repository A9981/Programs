package programpractice;

import java.util.Scanner;

public class SquareSum {
	static int SqSum(int n) {
		int add=0;
		do {
			int r=n%10;
			add=add+r*r;
			n=n/10;
		}while(n!=0);
		return add;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int prod=SqSum(n);
		System.out.println(prod);
		

	}

}

package programpractice;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}

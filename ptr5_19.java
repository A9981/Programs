package programpractice;

import java.util.Scanner;

public class ptr5_19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");//double space
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}

	}

}

package programpractice;

import java.util.Scanner;

public class ptr9_19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");//double space
			}
			for(int j=i;j<=n;j++)
			{
					System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

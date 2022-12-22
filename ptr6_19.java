package programpractice;

import java.util.Scanner;

public class ptr6_19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines");
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");//double space
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				if(j<i)
					System.out.print("* ");
					
			}
			System.out.println();
		}

	}

}

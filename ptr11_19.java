package programpractice;

import java.util.Scanner;

public class ptr11_19 {

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
			int x=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+"   ");
				x=x*(i-j)/j;
					
			}
			System.out.println();
		}


	}

}

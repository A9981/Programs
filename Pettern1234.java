package programpractice;

import java.util.Scanner;

public class Pettern1234 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		int n=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			if(i==1||i==3||i==5)
			{
				for(int j=n;j>=1;j--)
				{
					System.out.print(j);
				}
				System.out.println();
			}
			else if(i==2||i==4)
			{
				for(int k=1;k<=n;k++)
				{
					System.out.print(k);
				}
				System.out.println();
			}
		}
		
	}

}

package programpractice;

import java.util.Scanner;

public class ptrHW5_20 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter no of lines");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			
				for(int j=1;j<=n;j++)
				{	
					if(j==1||i==1||i==n||j==n||i==j||i+j==n+1)
						System.out.print("* ");
					else
						System.out.print("  ");
					
				}
				
			System.out.println();
			
		
			}}}
		
		
package programpractice;

import java.util.Scanner;

public class TestRupee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any ammount");
		int a=sc.nextInt();
		int x[]= {2000,500,200,100,50,20,10};
		for(int i=0;i<x.length;i++)
		{
			int y=a/x[i];
			a=a%x[i];
			System.out.println(x[i]+"rs note is "+y);
			if(a<10)
			System.out.println("1rs coin change note is "+a);
		}

	}

}

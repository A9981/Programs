package programpractice;

import java.util.Scanner;

public class ReturnArmstrong {
	static int countDigit(int n){
		int count=0;
		do {
			count++;
			n=n/10;
			}while(n!=0);
		return count;
	}
	static int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	static boolean isArmstrong(int x)
	{
		int dc=countDigit(x);
		int sum=0;
		int temp=x;
		do{
			int r=x%10;
			sum=sum+pow(r,dc);
			x=x/10;
		}while(x!=0);
		return temp==sum;
	}
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{
			boolean r=isArmstrong(i);
			if(r)
				System.out.println(i+" is armstrong");
		}
		
		/*static void armstrongIs(int m)
		for(int i=1;i<=m;i++)
		{
			int z=0;
			int temp=i;
			int sum=0;
			do{
				int dc=countDigit(i);
				int r=i%10;
				sum=sum+pow(r,dc);
				z=i/10;
			}while(z!=0);
			if(sum==temp)
			System.out.print(sum+" ");
		}
		armstrongIs(x);*/
	}
}

package programpractice;
import java.util.Scanner;
public class Ques30 {
	static int strongNum(int p) {
		int sum=0;
		do {
			int r=p%10;
			sum=sum+fact(r);
			p=p/10;
		}while(p!=0);
		return sum;
	}
   static int fact(int m) {
	   int prod=1;
	   while(m>1) {
		   prod=m*prod;
		   m--;
	   }
	   return prod;
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		int st=strongNum(n);
		if(st==n)
			System.out.println(n+" is a strong number");
		else
			System.out.println(n+" is not a strong number");

	}
}
package programpractice;
import java.util.Scanner;

public class indianRs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any ammount");
		int x=sc.nextInt();
		if(x>2000) {
			int y=x/2000;
			System.out.println("2000rs note is "+y);
			x=x%2000;
		}
		if(x>500)
		{
			int y=x/500;
			System.out.println("500rs note is "+y);
			x=x%500;	
		}
		 if(x>200)
		{
			int y=x/200;
			System.out.println("200rs note is "+y);
			x=x%200;	
		}
		if(x>100)
		{
			int y=x/100;
			System.out.println("100rs note is "+y);
			x=x%100;	
		}
		if(x>50)
		{
			int y=x/50;
			System.out.println("50rs note is "+y);
			x=x%50;	
		}
		if(x>20)
		{
			int y=x/20;
			System.out.println("20rs note is "+y);
			x=x%20;	
		}
		if(x>10)
		{
			int y=x/10;
			System.out.println("10rs note is "+y);
			x=x%10;	
		}
		else if(x<0) {
			System.out.println("invalid ammount");
		}
		System.out.println("1rs coin change "+x);
		

	}

}

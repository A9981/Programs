package programpractice;
import java.util.Scanner;


public class EvenOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int x=sc.nextInt();
		//first logic
		if(x%2==0)
		 System.out.println(x+" is a even num");
		else
			System.out.println(x+" is a odd num");
		
		//Second logic
		if(x/2*2==x)
			 System.out.println(x+" is a even num");
			else
				System.out.println(x+" is a odd num");
		
		//third logic
		switch(x%2)
		{
			case 0:
				System.out.println(x+" is a even num");
				break;
			case 1:
				System.out.println(x+" is a odd num");	
				break;
		}
		
		//forth 
		String[] str= {"even no","odd no"};
		System.err.println(x+" is "+str[x%2]);
		
		//fifth logic
		String st=(x%2==0)? "even": "odd";
		System.out.println(x+" is "+st);
	}
}

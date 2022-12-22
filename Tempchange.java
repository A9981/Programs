package programpractice;
import java.util.Scanner;

public class Tempchange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temparature in C: ");
		double temp=sc.nextDouble();
		double f=temp*9/5+32;
		
		System.out.println("value in fahrenheit: "+f);
		
	}

}

package programpractice;
import java.util.Scanner;

public class NegOrPos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		
		int x=sc.nextInt();
		if(x>=0)
		    System.out.println(x+" is a positive number");
		else
			System.out.println(x+" is a negative number");
	}

}

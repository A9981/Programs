package programpractice;
import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two num");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int small=x;
		
		if(y<small)
			small=y;
		
		System.out.println("the Smallest num is: "+small);
	}

}

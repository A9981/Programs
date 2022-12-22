package programpractice;
import java.util.Scanner;

public class HighestLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two name");
		String str1=sc.next();
		String str2=sc.next();
		
		int count1=str1.length();
		int count2=str2.length();
		
		if(count1>count2)
		System.out.println(str1+" has highest length");
		else
			System.out.println(str2+" has highest length");
		
		
		

	}

}

package programpractice;

import java.util.Scanner;

public class BiggestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two any num");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x>y)
			System.out.println(x+" is biggest num");
		else		
			System.out.println(y+" is biggest num");		
	}

}

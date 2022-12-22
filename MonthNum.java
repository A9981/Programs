package programpractice;

import java.util.Scanner;

public class MonthNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any month num");
		int mon=sc.nextInt();
		
		if(mon>0 && mon <=12)
			System.out.println("valid month num");
		else
			System.out.println("invalid month num");
	}

}

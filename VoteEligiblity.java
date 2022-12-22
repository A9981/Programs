package programpractice;

import java.util.Scanner;

public class VoteEligiblity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int age=sc.nextInt();
		
		if(age>=18)
			System.out.println("Eligible for voting");
		else
			System.out.println("Not eligible for voting");
	}

}

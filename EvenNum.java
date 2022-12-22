package programpractice;
import java.util.Scanner;


public class EvenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		int i=2;
		//first logic
		while(i<=n) {
			System.out.print(i+" ");
			i=i+2;
		}
		System.out.println();
		//Second logic
		int j=1;
		while(j<=n) {
		
			if(j%2==0)
				System.out.print(j+" ");
			j++;
		}
		

	}
}


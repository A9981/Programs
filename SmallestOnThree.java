package programpractice;

import java.util.Scanner;

public class SmallestOnThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
	    
		int small=x;
		
		/*if(y<small)
			small=y;
		
		if(z<small)
			small=z;
		
		System.out.println("the Smallest num is "+small);*/
		
		//using conditional statement 
		int smal1=(x<y)?(x<z)?x:z:(y<z)?y:z;
		int s=x<y&&x<z?x:y<z?y:z;
		
		int m=x<y&&x>z?x:y>x&&y<z?y:z>x&&z<y?z:x;
		System.out.println("the Smallest num is "+smal1);
		System.out.println("the Smallest num is "+s);

	}

}

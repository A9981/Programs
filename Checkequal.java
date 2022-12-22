package programpractice;
import java.util.Scanner;

public class Checkequal{

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter any two num");
	  int x=sc.nextInt();
	  int y=sc.nextInt();
	  
	  if(x==y)
	  {
		  System.out.println("numbers are equal");
	  }
	  else
	  {
		  System.out.println("numbers are not equal");
	  }

	}

}

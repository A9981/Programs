package programpractice;
import java.util.Scanner;

public class MiddleValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any three values");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x>y&&y>z || z>y&&y>x)
			System.out.println(y);
		else if(y>x&&x>z || z>x&&x>y)
			System.out.println(x);
		else
			System.out.println(z);
		
		int m=(x<y&&x>z)?x:(y>x&&y<z)?y:(z>x&&z<y)?z:x;
		System.out.println("middle value is: "+m);
	}

}

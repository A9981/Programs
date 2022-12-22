package programpractice;
import java.util.Scanner;

public class InchtofeetandMeter {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of stick in inches: ");
    double inch=sc.nextDouble();
    double feet=inch/12;
    double meter=inch*0.0254;
    System.out.println("Stick length in feet: "+feet);
    System.out.println("Stick length in meter: "+meter);
    
	}

}

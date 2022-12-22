package programpractice;

import java.util.Scanner;

public class MainTest1 {
	static int oddIs(int n){
	int count=0;
	do{
	int r=n%10;
	if(r%2==1)
	count++;
	n=n/10;
	}while(n!=0);
	return count;
	}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int odd=oddIs(x);
	System.out.println(odd);
	}
	}


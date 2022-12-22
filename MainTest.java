package programpractice;

import java.util.Scanner;

public class MainTest {
	static int sumIs(int n){
	int big=-9;
	int small=9;
	do{
	int r=n%10;
	if(r>big)
	big=r;
	if(r<small && r<big)
	small=r;
	else 
	n=n/10;
	}while(n!=0);
	return small+big;
	}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int add=sumIs(x);
	}
	}


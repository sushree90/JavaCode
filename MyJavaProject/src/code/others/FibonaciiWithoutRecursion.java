package code.others;

import java.util.Scanner;

public class FibonaciiWithoutRecursion {

	public static void main(String[] args) {
//int n=10;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=scn.nextInt();
int a=0;
int b=1;
System.out.print(a+" "+b);
for(int i=1;i<=n-2;i++) {
	int c=a+b;
	System.out.print(" "+c);
	a=b;
	b=c;
}

	}

}

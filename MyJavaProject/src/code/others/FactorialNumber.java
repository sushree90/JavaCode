package code.others;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int fact=1;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scn.nextInt();
		if(n>0) {
		for(int i=1;i<=n;i++) 
			fact=fact*i;
		System.out.println("factorial of n is"+" "+fact);
		}
		else 
			System.out.println("factorial of 0 is"+" "+1);
		}
	}
	


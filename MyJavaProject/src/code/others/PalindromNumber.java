package code.others;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=scn.nextInt();
		int num1=n;
		int reverseno=0;
		int digit=0;
		while(n!=0)
		{
			digit=n%10;
			reverseno=reverseno*10+digit;
			n=n/10;
			
		}
		if(num1==reverseno)
			System.out.println("it is a palindrome number");
		else
			System.out.println("not a palindrome number");
		
	}

}

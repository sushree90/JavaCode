package code.others;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=scn.nextInt();
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0) 
			count++;		
	}
	if(count==2) 
		System.out.println("prime number");
	else	 
		System.out.println("not a prime number");	
	}
}


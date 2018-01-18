package code.others;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("Enter the number:");
int n=scn.nextInt();
int num1=n;
int armstrongno=0;
int digit=0;
while(n>0)
{
	digit=n%10;
	armstrongno=armstrongno+(digit*digit*digit);
	n=n/10;
}
if(num1==armstrongno)
	System.out.println(num1+" is a armstrong number");
else
	System.out.println(num1+" is not an armstrong number");
	}

}

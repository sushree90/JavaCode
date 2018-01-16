package code.oops;

public class MethodOverloading {

	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(4,5);
add(2.3,6.2);
add(5.4,6);
add(2,8.4);
add(6,9);
	}

}

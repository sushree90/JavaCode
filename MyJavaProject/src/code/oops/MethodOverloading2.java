package code.oops;

public class MethodOverloading2 {
static int add(int a,int b)
{
	return a+b;
}
static int add(int a,int b,int c)
{
	return a+b+c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MethodOverloading2.add(77, 33));
System.out.println(MethodOverloading2.add(5, 6, 11));
	}

}

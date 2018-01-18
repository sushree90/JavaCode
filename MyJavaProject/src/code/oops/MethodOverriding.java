package code.oops;

 class MethodOverriding {
void run() {
	System.out.println("its running");
}
class car extends MethodOverriding{
	void run() {
		System.out.println("its safely running");
	}
}
	public static void main(String[] args) {
	MethodOverriding m=new MethodOverriding();
	car c=m.new car();
	c.run();

	}

}

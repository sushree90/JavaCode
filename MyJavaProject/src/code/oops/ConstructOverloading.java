package code.oops;

public class ConstructOverloading {
int id;
String name;
int age;
ConstructOverloading(int i,String n){
	id=i;
	name=n;
}
ConstructOverloading(int i,String n,int a){
	id=i;
	name=n;
	age=a;
}
void display() {
	System.out.println(id+" "+name+" "+age);
}

	public static void main(String[] args) {
		ConstructOverloading c1=new ConstructOverloading(2,"niki");
		ConstructOverloading c2=new ConstructOverloading(3,"hitesh",30);
		c1.display();
		c2.display();
		

	}

}

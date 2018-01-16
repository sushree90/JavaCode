package code.others;

public class NonStaticVar {
			static int i=10;
			int j=20;
			public void run()
			{
				System.out.println(j);
			}
		
			public static void main(String[] args)
			{
				NonStaticVar a1=new NonStaticVar();
				a1.j=30;
				a1.run();
				NonStaticVar a2=new NonStaticVar();
				 a2.j=50;
				 a2.run();
				 
		}

	}


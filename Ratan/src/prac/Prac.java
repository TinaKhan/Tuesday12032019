package prac;

public class Prac {
	int a=20;
	int b=30;
	static int c=40;
	static int d=50;
	void m1()//instance method
	{ //Test t=new Test();
		System.out.println(a);
	  System.out.println(b);
	  System.out.println(Prac.c);//static variable or method can be called directly by class
	  System.out.println(Prac.d);
	}
	static void m2()
	{ Test t=new Test();
		System.out.println(t.a);
	  System.out.println(t.b);
	  System.out.println(Prac.c);
	  System.out.println(Prac.d);
	  
	}
	public static void main(String[] args) {
		Prac t=new Prac();
		t.m1();
		Prac.m2();
		
	}

}

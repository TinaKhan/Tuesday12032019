package prac;
class Test {
  int a=10;
  int b=20;
   static void m1()
  { Test t =new Test();
  System.out.println(t.a);
  System.out.println(t.b);
  }
  //Once method is completed,object destroyed
  static void m2()
  { Test t1 =new Test();
  System.out.println(t1.a);
  System.out.println(t1.b);
  }
	public static void main(String[] args) {
		//Entire java static method is called by class name
		Test.m1();
		Test.m2();

	}

}

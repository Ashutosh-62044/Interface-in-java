package Myinterface;

public class C3 implements C1 ,C2 {
   //public static void main(String[] args) {
	  @Override
	  public void test1() {
		  System.out.println("hello ashu");
	  }
	  @Override
	  public void test3() {
		  System.out.println(900);
	  }
	  public static void main(String[] args) {
		C3 obj = new C3();
		obj.test1();
		obj.test3();
		obj.test2();
	}
}


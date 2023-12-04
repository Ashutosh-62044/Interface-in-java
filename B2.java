package Myinterface;

public class B2 implements B1{

	@Override
	public void test1() {
		System.out.println(800000);
	}
	public static void main(String[] args) {
		 B2 b1 = new B2();
		 b1.test1();
	}
}

package Myinterface;

public class A3 implements A1,A2 { // 
 @Override
 public void test2() {
	 System.out.println(800);
 }
 @Override
 public void test() {
	 System.out.println(700);
 }
 
 public static void main(String[] args) {
	A3 a = new A3();
	a.test();
	a.test2();
}
}

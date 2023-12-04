package Myinterface;
//@FunctionalInterface
public class B implements A {    // when we are only one  method pass inside class then 
	                              // interface show. otherwise more than one method it show error
@Override
	public void test1() {
		System.out.println(50000);
	}
	
@Override
public void test() {
	System.out.println(900);
}

 public static void main(String[] args) {
	B b1 = new B();
	b1.test();
	b1.test1();
}
}

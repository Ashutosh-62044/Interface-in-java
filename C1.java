package Myinterface;
@FunctionalInterface
public interface C1 {
 public void test1();
  default void test2() {
	  System.out.println("Vidhayak ji");
  }
  
}

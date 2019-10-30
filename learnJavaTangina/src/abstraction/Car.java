package abstraction;

public interface Car extends Robot { // an interface can extends another interface
 public void start();//method can be declared in interface
 public void stop();//method can not be implemented inside the interface
 public void brake();//by default all methods are abstract methods
 
// public default void honk() { //from Java 8, Interface contain 2 implemented method
//	 System.out.println("Honk is must for all car");
// }
// public static void gear() {
//	 System.out.println("Honk is must for all car");
// }
// 
}

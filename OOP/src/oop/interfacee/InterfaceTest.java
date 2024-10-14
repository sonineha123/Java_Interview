package oop.interfacee;

public class InterfaceTest implements  Interface{
   @Override
	
   public int sum(int a, int b) {
	   return a+b;
   }
	
   public static void main(String[] args) {
	
	   InterfaceTest t = new InterfaceTest();
	                      int y=t.sum(x, 20);
	                      System.out.println(y);
	                       
}
}

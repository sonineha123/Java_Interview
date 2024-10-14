package oop.constructoroverloading;

public class ConstructorOverloading {
	
   public 	ConstructorOverloading() {
   System.out.println("this is default");
	   }
 
   public ConstructorOverloading(int a ) {
	   this();
	   System.out.println("this is one parameterize constructor:"+a);
   }
	
   public ConstructorOverloading(int a, int b) {
	   this(a);
	   System.out.println("this is 2 parameterize constructor:"+(a+b));
   }
   
   public ConstructorOverloading(int a, int b , int c ) {
	   this (a ,b);
	   System.out.println("this is 3 parameterize constructor:"+(a+b+c));
   }
   
   public static void main(String[] args) {
	
	   ConstructorOverloading c =new ConstructorOverloading(20,40,60);
}
}

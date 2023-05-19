package Oops.Abstraction;

//Process Of Hiding the Implementation & Showing the Important Functionality
//Using Abstract Class

//We Can Provide Implementation to the Abstract Class 
//with the Help Of Inheritance & Method Overriding

public class Abstract_Driver {
	public static void main(String[] args) {
		
	
	// A a =new A(); //Cannot Create Object for Abstract Class
	
		B b=new B(); // Since Child Class is Not an Abstract Class,we can create Object
		
		A a=new B(); //Upcasting -We Cannot Access Child Class Members
		a.m1();
	
	
		B b1=(B)a; //Downcasting - Can Access Both Parent & Child
		b1.m2();
}
}

abstract class A // If atleast 1 abstract() is there,either Declared/Inherited then class should be abstract
				//Abstract class Cannot be Instantiated (Cannot Create Object)
{
	abstract public void m1();//Incomplete Method
	
	public static void m2() // abstract class can have Normal() also
	{
		System.out.println("From A");
	}
}

class B extends A
{
	public void m1()//Concrete()- Giving Implementation for the abstract()in
	{
		System.out.println("Implementation Given");
	}
	
	
}


package com.hamburger.factorypattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     
		SimpleHamburgerFactory factory=new SimpleHamburgerFactory();   
		System.out.println("----------------------------");   
		// Veg Burger object 
		Hamburger hamburgur1=factory.getInstance("Veggie Burger");  
		hamburgur1.prepare();  
		hamburgur1.cook();
		hamburgur1.box();
		System.out.println("Thank you...Have a nice day");      
		System.out.println("----------------------------");  

		// Cheese Burger object 
		Hamburger hamburgur2=factory.getInstance("Cheese Burger");  
		hamburgur2.prepare();  
		hamburgur2.cook();
		hamburgur2.box();
		System.out.println("Thank you...Have a nice day");      
		System.out.println("----------------------------"); 
		
		// Meat lover Burger object 
				Hamburger hamburgur3=factory.getInstance("Meat Lover Burger");  
				hamburgur3.prepare();  
				hamburgur3.cook();
				hamburgur3.box();
				System.out.println("Thank you...Have a nice day");      
				System.out.println("----------------------------"); 
	}

}

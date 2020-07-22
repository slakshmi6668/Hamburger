package com.hamburger.factorypattern;

public class MeatLoverBurger extends Hamburger {
	public void prepare() {
		System.out.println("Your Meat_lover_burger order confirmed");    
		} 
	 
    public void cook() { 
    	System.out.println("Your Meat_lover_burger is cooking");
    	} 
    public void box() { 
    	System.out.println("Your Meat_lover_burger is ready to serve");
    	} 
	 


}

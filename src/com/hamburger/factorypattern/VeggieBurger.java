package com.hamburger.factorypattern;

public class VeggieBurger extends Hamburger {
	public void prepare() {
		System.out.println("Your veggie burger order confirmed");    
		} 
	 
    public void cook() { 
    	System.out.println("Your veggie burger is cooking");
    	} 
    public void box() { 
    	System.out.println("Your veggie burger is ready to serve");
    	} 
	 

}

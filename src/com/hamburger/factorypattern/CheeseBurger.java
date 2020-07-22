package com.hamburger.factorypattern;

public class CheeseBurger extends Hamburger {
	public void prepare() {
		System.out.println("Your cheese burger order confirmed");    
		} 
	 
    public void cook() { 
    	System.out.println("Your cheese burger is cooking");
    	} 
    public void box() { 
    	System.out.println("Your cheese burger is ready to serve");
    	} 
	 


}

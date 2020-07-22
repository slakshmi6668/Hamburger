package com.hamburger.factorypattern;

public class SimpleHamburgerFactory {
	public Hamburger getInstance(String HamburgerOrder) {   
		if (HamburgerOrder.equals("Veggie Burger")) 
		{    return new VeggieBurger();   } 
		else if (HamburgerOrder.equals("Cheese Burger"))
		{   
			return new CheeseBurger();  
		} 
		else    
			return new MeatLoverBurger(); 
	}
 

	
	
	
	
}

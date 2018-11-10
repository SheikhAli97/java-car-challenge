package Udemy;

public class Vehicle { 
	public static void main(String[] args) { 
		rolls phantom = new rolls("Pahntom", 40, "Peanut butter", "Large",40);
		System.out.println(phantom.getPlate()); 
		 System.out.println(phantom.getSpeed()); 
		 phantom.accelerate(1.2);
	System.out.println(phantom.getSpeed());
	phantom.accelerate(1.5);
	System.out.println(phantom.getSpeed()); 
	phantom.changingGear(5);
	
	
	} 
	
	

} 


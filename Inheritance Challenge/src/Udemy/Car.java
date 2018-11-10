package Udemy;
import java.util.Scanner;
public class Car extends Vehicle {
	
	
	double speed; 
	int size; 
	int weight;
	String Wheels; 
	String Age; 
	String typeofDrive; 
	String plate;
	
	
	public Car( int speed, int size, int weight, String wheels, String age, String typeofDrive,
			String plate) {
		super();
		
		this.speed = speed;
		this.size = size;
		this.weight = weight;
		this.Wheels = wheels;
		this.Age = age;
		this.typeofDrive = typeofDrive;
		this.plate = plate;
	}
	
	
	public void move() {  
		System.out.println("car is moving at " + speed + "mph");
		
		
		
	} 
	

	public void changingGear(int geartoChangeto){  
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the gear you are in :");
		boolean inputisInt = scanner.hasNextInt(); 
		if (inputisInt) { 
			int currentgear = scanner.nextInt(); 
			System.out.println("your current gear is " + currentgear); 
			if (geartoChangeto != currentgear + 1) {
				System.out.println("You can only go up one gear at a time");
			}else 
			if (currentgear < geartoChangeto) {  
				speed = speed* 1.5;
				
				System.out.println(" gear " + geartoChangeto + " will cause you to accelerate");  
				accelerate(speed);
				
			}
			
			if (currentgear > geartoChangeto ) { 
				System.out.println("You must now decelrate"); 
				brakes();
				
				
			} 
			
			if (geartoChangeto == currentgear) {
				System.out.println("The speed will not change"); 
				
				
			}   
			
			switch (geartoChangeto) {
			case 1: 
			 speed = 10;
				
				break;  
			case 2: 
				speed = 20;
			case 3: 
				speed = 30;
			case 4: 
				speed = 40;
			case 5: 
				speed = 50;
			case 6: 
				speed = 60;
			case 7: 
				speed = 70; 
				

			default:
				break;
			}
			
		
			
			
			
			
		}  
		
		
		
	
		scanner.close();
		
	} 
	
	
	
	public void steeringLeft() { 
		speed = speed * 0.4; 
		
		System.out.println("Car is turning left");
		
		
	} 
	
	
	public void steeringRight() { 
speed = speed * 0.6; 
		
		System.out.println("Car is turning right, speed is now = " + speed);

		
	}
	
	
	
	
	public void brakes() { 
		
		for (int i = 0; i < speed; i++) {
			speed = speed - i; 
			System.out.println("car is slowing down to " ); 
			
		} 
		
		
		System.out.println("Car is coming to a stop"); 
		
		
		
	} 
	
	
	public void accelerate(double rateofacceleration ) {  
		 
	double newspeed = speed * rateofacceleration ; 
	System.out.println("new speed = " + newspeed); 
	this.speed= newspeed;
	
		
	} 	
	
	

	public double getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getWheels() {
		return Wheels;
	}
	public void setWheels(String wheels) {
		Wheels = wheels;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getTypeofDrive() {
		return typeofDrive;
	}
	public void setTypeofDrive(String typeofDrive) {
		this.typeofDrive = typeofDrive;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}  
	
	


}

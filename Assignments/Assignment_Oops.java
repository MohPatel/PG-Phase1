package Assignments;

abstract class Vehicle {
	
	int speed;
	long distance;
	
	public Vehicle() {
		
	}
	public Vehicle(int speed, long distance) {
		this.speed = speed;
		this.distance = distance;
	}
	
	public abstract void run();
	
	public abstract void stop();
	
	public void fuel(int fuel) {
		System.out.println("Total fuel is consumed " + fuel);
	}
	
	public void fuel(float fuel, String typeOfVechile)
	{
		System.out.println(typeOfVechile + " is consumed fuel in litre " + fuel);
	}
	
	public void fuel(char wheelers, int fuel)
	{
		System.out.println("Anonymous vehicle " + wheelers + " wheelers is consumed fuel in litre " + fuel);
	}
	
}

class Wheeler2 extends Vehicle{

	int nos_of_tyre = 2;
	
	Wheeler2(){
		super(100, 500);
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("2 Wheeler vehilcle is running");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("2 Wheeler vehilcle is stopped running");
	}
	
	public void display() {
		System.out.println(nos_of_tyre + " Wheeler Vehicler's speed in km/h" + super.speed + " to cover distance " + super.distance);
	}
	
}

class Wheeler3 extends Vehicle{

	int nos_of_tyre = 3;
	
	Wheeler3(){
		super(95, 200);
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("3 Wheeler vehilcle is running");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("3 Wheeler vehilcle is stopped running");
	}
	
	public void display() {
		System.out.println(nos_of_tyre + " Wheeler Vehicler's speed in km/hr" + super.speed + " to cover distance " + super.distance);
	}
}
class Wheeler4 extends Vehicle{

	int nos_of_tyre = 4;
	
	Wheeler4(){
		super(121, 300);
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("4 Wheeler vehilcle is running");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("4 Wheeler vehilcle is stopped running");
	}
	
	public void display() {
		System.out.println(nos_of_tyre + " Wheeler Vehicler's speed in km/hr " + super.speed + " to cover distance " + super.distance);
	}
}
class Wheeler8 extends Vehicle{

	int nos_of_tyre = 8;
	
	Wheeler8(){
		super(25, 100);
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("8 Wheeler vehilcle is running");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("8 Wheeler vehilcle is stopped running");
	}
	
	public void display() {
		System.out.println(nos_of_tyre + " Wheeler Vehicler's speed in km/hr " + super.speed + " to cover distance " + super.distance);
	}
	
	
	
}
public class Assignment_Oops {
	
	public static void main(String args[])
	{
		Vehicle v;
		
		v = new Wheeler2();
		v.run();
		v.stop();
		((Wheeler2) v).display();
		v.fuel(150, v.getClass().getName());
		
		v = new Wheeler3();
		v.run();
		v.stop();
		((Wheeler3) v).display();
		v.fuel(200);
		
		v = new Wheeler4();
		v.run();
		v.stop();
		((Wheeler4) v).display();
		v.fuel(75);
		
		v = new Wheeler8();
		v.run();
		v.stop();
		((Wheeler8) v).display();
		v.fuel('8',15);
	}

}


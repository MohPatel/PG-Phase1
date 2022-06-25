package Assignments;

class Factorail extends Thread{
	int factorialno;
	int factorailResult;
	
	Factorail(int factorialno){
		this.factorialno = factorialno;
	}
	
	synchronized void factorial(int factorialno) {
		factorailResult = 1;
		for(int i = 1; i <= factorialno; i++)
		{
			factorailResult = factorailResult * i;
		}
		System.out.println("Factorail value " + Thread.currentThread().getName() + " : " + factorailResult);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		factorial(factorialno);
	}
}
class Sum extends Thread {
	int factorailResult;
	int sumResult;
	int value1;
	int value2;
	
	Sum(int a, int b)
	{
		this.value1 =a;
		this.value2 =b;
		
	}
	synchronized void sum(int value1, int value2) {
		factorailResult = 0;
		sumResult = value1 + value2;
		System.out.println("sum value is: " + Thread.currentThread().getName() + " : " + sumResult);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sum(this.value1, this.value2);
	}
} 
public class MathFunction {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorail t1 = new Factorail(4);
		Factorail t2 = new Factorail(6);
		Sum t3 = new Sum(4,5);
		Sum t4 = new Sum(10,20);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");

		t2.start();
		t4.start();
		t1.start();
		t3.start();
		
		
		

	}

}

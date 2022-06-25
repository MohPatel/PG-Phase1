package Assignments;

class BankAccount{
	int amount = 10000;
	
	// withdraw method
	synchronized void withDraw(int amount) {
		if (this.amount < amount) {
			System.out.println("Less Balance.. waiting for Deposit");
			try {
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		this.amount-=amount;  
		System.out.println("withdraw completed...the lefft over amount is: "+ this.amount);  

	}
	synchronized void deposit(int amount) {
		System.out.println("goint to deposit");
		this.amount += amount;
		
		System.out.println("Deposit completed, Total amount is in account : " + this.amount);
		notify();
	}
}
public class WithDrawDeposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final BankAccount account = new BankAccount();
		
		new Thread() {
			public void run() {
				account.withDraw(5000);
			};
		}. start();
		
		new Thread() {
			public void run() {
				account.withDraw(4000);
			};
		}. start();
		
		new Thread() {
			public void run() {
				account.withDraw(10000);
			};
		}. start();
		
		new Thread() {
			public void run() {
				account.deposit(20000);
			};
		}. start();
		

		
	}

}

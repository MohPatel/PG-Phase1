package Assignments;

public class ThreadPriority extends Thread {

	public void run() {
		
		for (int i = 1; i < 4; i++)
		{
			try {
				Thread.sleep(4000);
				
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
		  System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
		  System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
		  System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
		  System.out.println("Is my thread Daemon or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isDaemon()); // this thread always run in background
		  

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ThreadPriority m1=new ThreadPriority();  
		  ThreadPriority m2=new ThreadPriority();  
		  ThreadPriority m3=new ThreadPriority();
		  
		  m1.setName("Panipuri");
		  m2.setName("Vadapav");
		  m3.setName("PavBhaji");
		 
		  m1.setPriority(Thread.MAX_PRIORITY);  
		  m2.setPriority(Thread.NORM_PRIORITY);  
		  m3.setPriority(Thread.NORM_PRIORITY); 
		  
		  m2.setDaemon(true); 
		  
		  m1.start();  
		  m2.start();  
		  m3.start();


	}

}

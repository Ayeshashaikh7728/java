package Thread;

public class TestThread {
	
		 public static void main(String[] args) {
			
			multiThread th1=new multiThread("Thread1");
			multiThread th2=new multiThread("Thread2");
			multiThread th3=new multiThread("thread3");
			//ThreadExample th3=new ThreadExample("Thread3");
			 th1.setPriority(Thread.MAX_PRIORITY);
			 th2.setPriority(Thread.MIN_PRIORITY);
			 th3.setPriority(Thread.MAX_PRIORITY);
			System.out.println("Starting Threads....");
			th1.start();
			th2.start();
			th3.start();
			//th1.start();
			//th.run(); we can call it by run method but stack is not created for run method 
		}
	 
}

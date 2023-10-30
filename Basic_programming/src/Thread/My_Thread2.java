package Thread;


	public class My_Thread2 extends Thread
	{
		public My_Thread2(String name) {
			super(name);
		}
		public void run()
		{
			System.out.println("r1 "+currentThread().getName());
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ie) 
			{ 
				// do something
			}
			System.out.println("r2 "+currentThread().getName());
		}
		public static void main(String[] args)
		{
			My_Thread2 t1=new My_Thread2("Thread1");
			My_Thread2 t2=new My_Thread2("Thread2");
			t1.start();
			try{
	  			t1.join();	//Waiting for t1 to finish
			}catch(InterruptedException ie){}
			t2.start();
			System.out.println(t1.isAlive());
			System.out.println(t2.isAlive());
		}
	}


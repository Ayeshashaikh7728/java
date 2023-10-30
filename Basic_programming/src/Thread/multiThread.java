package Thread;

public  class multiThread extends Thread {

	
	
	private int sleepTime;
	// PrintThread constructor assigns name to thread 
	// by calling superclass Thread constructor
	public multiThread(String name){
		super(name);
		// sleep between 0 and 5 seconds
		sleepTime = (int) ( Math.random() * 5000 );
		// display name and sleepTime
		System.err.println( "Name: " + getName() + ";  sleep: " + sleepTime );
	}
	public void run()
	{
//		System.out.println("run method is called");
//		System.out.println(currentThread().getName());
		
		
		
		
		// put thread to sleep for a random interval
				try {
					System.err.println( getName() + " going to sleep" );
					// put thread to sleep
					Thread.sleep( sleepTime );
			//Thread.sleep(500);
					  System.err.println( getName() + " done sleeping" );
				}
//				catch(Exception e) {
//					System.out.println(e.getMessage());
//					//System.err.println( interruptedException.toString() );
//		          
//				}
				catch ( InterruptedException interruptedException ) {
		            System.err.println( interruptedException.toString() );
		          }
	}
	

}
  
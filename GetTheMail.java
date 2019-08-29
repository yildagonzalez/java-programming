// Every 10 seconds it check if there's new mail
public class GetTheMail implements Runnable {

	private int startTime;
	
	// constructor, startTime is how long to take before executing
	public GetTheMail(int startTime) {
		this.startTime = startTime;
	}
	
	// this is the code that executes
	public void run() {
		
		try {
			// ex. if they passed in a startTime of 10, it will sleep
			// for 10 seconds before it does anything.
			Thread.sleep(startTime * 1000);
		}
		catch (InterruptedException e) {
			
		}
		System.out.println("Checking Mail");
	}
}

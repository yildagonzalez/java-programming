import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck {

	private String checkWhat;
	
	// we want to protect the run method from being accessed from
	// two different potential threads at the same time.
	ReentrantLock lock = new ReentrantLock();
	
	public PerformSystemCheck(String checkWhat) {
		this.checkWhat = checkWhat;
	}
	
	// with *synchronized* keyword, whenever any other thread accesses this method,
	// it's going to be locked down, no other thread can access it.
	// but, DON'T synchronize all method, this can slow down java dramatically!
	/*synchronized public void run() {
		
	}*/
	
	// you can also use the lock:
	public void run() {
		lock.lock();
		
		// checking what thread is being called
		System.out.println("Checking " + this.checkWhat);
		
		// to unlock the method after you're done using it
		lock.unlock();
	}
	
	
	
	
	
	
}

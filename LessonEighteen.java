import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit.*;



public class LessonEighteen {
	
	public static void main(String[] args) {
		
		// throwing threads into a pool and accessing to do all
		// kinds of things with them
		addThreadsToPool();
		
		
	}
	
	public static void addThreadsToPool() {
		// allows us to schedule code execution in some time in the future
		// and also execute repeatedly based off of different time periods
		
		// make sure this is big enough to hold all of the threads
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		// we need to add threads individually to pool
		//eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
		//eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
		//eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, TimeUnit.SECONDS);

		System.out.println("Number of Threads: " + Thread.activeCount());
	}
	
	
}

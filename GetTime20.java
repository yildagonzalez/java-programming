// When you say that a block of code is a *thread*, it means that is
// notifying the java interpreter that not only is it going to run, but 
// other threads, or block of code are going to run at exactly the same time
// and execute, or print things to the screen or whatever needs to be done
// all synchronously.
// Ex. Your computer is able to check e-mails, download things, and play games
// ALL AT THE SAME TIME.

import java.util.*;
import java.text.DateFormat;
public class GetTime20 extends Thread{

	// This program will output the current time and at a specific time it's 
	// going to execute other code without stopping the printing of the time 
	// on the screen.
	
	// All the code that the thread executes must be inside the run method
	
	public void run() {
		
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		for (int i = 1;  i <= 20; i++) {
			
			rightNow = new Date();
			currentLocale = new Locale("en");
			
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);

			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				
			}


			
		}
		
		
		
		
		
		
		
		
	}
	
	
}

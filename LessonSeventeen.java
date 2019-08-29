
public class LessonSeventeen {

	public static void main(String[] args) {
		
		// create a thread that executes all the code in class GetTime20
		
		Thread getTime = new GetTime20();
		
		Runnable getMail = new GetTheMail(10);
		
		Runnable getMailAgain = new GetTheMail(20);
		
		getTime.start();
		
		new Thread(getMail).start();
		new Thread(getMailAgain).start();
		
		
	}
}

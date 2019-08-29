import java.util.Scanner;

public class LessonThree {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int i = 1;
		
		while (i <= 20) {
			if(i == 3) {
				i += 2;
				continue; // jumps out of this iterator and continues with outer loop
			}
			System.out.println(i);
			i++;
			
			if (i % 2 == 0) {
				i++;
			}
			if(i > 10) {
				break; // terminate loop all together
			}
		}
		
		// calculate the value for pi
		double myPi = 4.0;
		
		double j = 3.0;
		
		// to calculate pi: 4 - 4/3 + 4/5 - 4/7
		
		// calculate pi up to 11 .. 
		
		while (j < 100001) {
			myPi = myPi - (4/j) + (4/(j+2));
			j += 4;
			System.out.println(myPi);
		}
		System.out.println("value of PI: " + Math.PI);
		
		
		
		// while loop until user says to stop
		
		String contYorN = "Y";
		
		int h = 1;
		
		// can enter Y or y
		while (contYorN.equalsIgnoreCase("y")) {
			System.out.println(h);
			System.out.println("Continue y or n?: ");
			contYorN = in.nextLine();
			h++;
			
		}
		
		
		
		// do while loop: To guarantee code will be executed at least once
		
		int k = 1;
		
		do {
			System.out.println(k);
			k++;
			
		} while (k < 10);
		
		
		// for loop
		
		
		for (int l = 10; l >= 1; l--) {
			System.out.println(l);
		}
		
		int m, n;
		
		for (m=1, n=2; m <= 9; m+=2, n+=2) {
			System.out.println(m + "\n" + n);
		}
		
		
	};
}
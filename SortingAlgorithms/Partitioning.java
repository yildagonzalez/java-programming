package SortingAlgorithms;
import java.util.Arrays;


public class Partitioning {
	
	private static int[] theArray;
	
	private static int arraySize;
	
	public static void main(String[] args) {
		
		Partitioning partitioningArray = new Partitioning(10);
		
		partitioningArray.generateRandomArray();
		
		System.out.println(Arrays.toString(Partitioning.theArray));
		
		partitioningArray.partitionArray(35);
		
		System.out.println(Arrays.toString(Partitioning.theArray));

		
	}
	
	
	public void partitionArray(int pivot) {
		
		// sort through array until it finds item > pivot
		// then stop and wait for right pointer to find item < pivot
		// then those items will be switched
		
		int leftPointer = -1; // start at left side of array before index 0
		int rightPointer = arraySize; // start at right side of array after the last index
		
		while (true) {
			
			// cycle through array until the end is reached
			// or an item bigger than pivot is found. then
			// wait for rightPointer to finish cycling
			while (leftPointer < (arraySize - 1) && theArray[++leftPointer] < pivot)
				
				;
			printHorzArray(leftPointer, rightPointer);
			System.out.println(theArray[leftPointer] + " in index " + leftPointer + " is bigger than the pivot value " + pivot);

			while (rightPointer > 0 && theArray[--rightPointer] > pivot)

				;
			
			printHorzArray(leftPointer, rightPointer);
			System.out.println(theArray[rightPointer] + " in index " + rightPointer + " is smaller than the pivot value " + pivot);
			
			printHorzArray(leftPointer, rightPointer);
			
			if (leftPointer >= rightPointer) {
				break;
			}
			else {
				swapValues(leftPointer, rightPointer);
				
				System.out.println(theArray[leftPointer] + " was swapped for " + theArray[rightPointer]);
			}

		
		}
		
		
	} // END OF partitionArray
	
	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	} // END OF swapValues
	
	Partitioning(int newArraySize) {
		
		arraySize = newArraySize;
		theArray = new int[arraySize];
		generateRandomArray();
	} // END constructor
	
	
	
	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			// Generate a random array with values between
			// 10 and 59

			theArray[i] = (int) (Math.random() * 50) + 10;

		}

	}

	static void printHorzArray(int i, int j) {

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.format("| %2s " + " ", n);

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.print(String.format("| %2s " + " ", theArray[n]));

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		if (i != -1) {

			// Number of spaces to put before the F

			int spacesBeforeFront = 5 * i + 1;

			for (int k = 0; k < spacesBeforeFront; k++)
				System.out.print(" ");

			System.out.print("L");

			// Number of spaces to put before the R

			int spacesBeforeRear = (5 * j + 1 - 1) - spacesBeforeFront;

			for (int l = 0; l < spacesBeforeRear; l++)
				System.out.print(" ");

			System.out.print("H");

			System.out.println("\n");

		}

	}

	
	
	
	
}

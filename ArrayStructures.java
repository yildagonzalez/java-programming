
public class ArrayStructures {

	
	private int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	public void generateRandomArray() {
		
		for(int i = 0; i < arraySize; i++) {
			theArray[i] = (int)(Math.random()*10)+10;
		}
		
	}
	
	public void printArray() {
		System.out.println("----------");
		for(int i = 0; i < arraySize; i++ ) {
			System.out.print(i + " -> ");
			System.out.println(theArray[i] );
			System.out.println("----------");

		}
	}
	
	public int getValueAtIndex(int index) {
		
		if(index < arraySize) {
			return theArray[index];
		}
		return 0;
	}
	
	public boolean doesArrayContainThisValue(int searchValue) {
		
		boolean valueInArray = false;
		
		for(int i = 0; i < arraySize; i++) {
			if(theArray[i] == searchValue) {
				valueInArray = true;
			}
		}
		return valueInArray;
	}
	
	public void deleteIndex(int index) {
		
		// check index is smaller than array size
		if(index < arraySize) {
			
			for(int i = index; i < (arraySize - 1); i++) {
				theArray[i] = theArray[i+1]; // replace values with above index value until end of array
				}
			arraySize--; // decrement arraySize
		}
		
	}
	
	public void insertValue(int value) {
		
		if (arraySize < 50) {
			
			theArray[arraySize] = value; // this works because of the 0 index, we are inserting at the end of the array
			
			arraySize++;
		}
	}
	
	public String linearSearchForValue(int value) {
	
		boolean valueInArray = false;
		
		String indexesWithValue = "";
		
		System.out.println("The value was found in the following: ");
		
		for(int i = 0; i < arraySize; i++) {
			
			if (theArray[i] == value) {
				
				valueInArray = true;
				
				System.out.println(i + " ");
				
				indexesWithValue += i + " ";
				
			}
		}
		
		if (!valueInArray) {
			
			indexesWithValue = "None";
			
			System.out.println(indexesWithValue);
			
		}
		
		System.out.println();
		
		return indexesWithValue;
	}
	
	
	public void bubbleSort() {
		
		for (int i = arraySize - 1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				if (theArray[j] > theArray[j+1]) {
					
					swapValues(j, j+1);
					
					printHorzArray(i, j);
				}
				printHorzArray(i, j);
			}
		}
		
		
	}
	
public void bubbleSort2() {
		
		for (int i = 0; i < arraySize ; i++) {
			
			for (int j = 0; j < arraySize; j++) {
				
				if (theArray[j] < theArray[j+1]) {
					
					swapValues(j, j+1);
					
					printHorzArray(i, j);
				}
				printHorzArray(i, j);
			}
		}
		
		
	}

public void binarySearchForValue(int value) {
	
	int lowIndex = 0;
	int highIndex = arraySize - 1;
	
	while (lowIndex <= highIndex) {
		
		int middleIndex = (highIndex + lowIndex) / 2;
		
		if (theArray[middleIndex] < value) {
			
			lowIndex = middleIndex +1;
		}
		else if (theArray[middleIndex] > value) {
			
			highIndex = middleIndex - 1;
		}
		else {
			System.out.println("Found a match for " + value + " at index: " + middleIndex);
		
			// to exit out of the while loop
			lowIndex = highIndex + 1;
		}
		
		printHorzArray(middleIndex, -1);
		
	}
}


public void selectionSort() {
	
	for (int x = 0; x < arraySize; x++) {
		
		int minimum = x;
		
		for(int y = x; y < arraySize; y++) {
			
			if (theArray[minimum] > theArray[y]) {
				
				minimum = y;
				
			}
		}
		
		swapValues(x, minimum);
		printHorzArray(x, -1);
	}
}

public void insertionSort() {
	
	for (int i = 1; i < arraySize; i++) {
		
		int j = i;
		
		int toInsert = theArray[i];
		
		while ((j > 0) && (theArray[j-1] > toInsert)) {
			
			theArray[j] = theArray[j-1];
			j--;
			
			printHorzArray(i, j);
		}
		
		theArray[j] = toInsert;
		
		printHorzArray(i, j);
		
		System.out.println("\nArray[i] = " + theArray[i] + 
				" Array[j] =  " + theArray[j] + " toInsert = " + toInsert);
	}
}
	
	public void swapValues(int indexOne, int indexTwo) {
		
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}
	
	
	
	public void printHorzArray(int i, int j){

		for(int n = 0; n < 51; n++)System.out.print("-");

		System.out.println();

		for(int n = 0; n < arraySize; n++){

			System.out.print("| " + n + "  ");

		}

		System.out.println("|");

		for(int n = 0; n < 51; n++)System.out.print("-");

		System.out.println();

		for(int n = 0; n < arraySize; n++){

			System.out.print("| " + theArray[n] + " ");

		}

		System.out.println("|");

		for(int n = 0; n < 51; n++)System.out.print("-");

		System.out.println();

		// END OF FIRST PART

		// ADDED FOR BUBBLE SORT

		if(j != -1){

			// ADD THE +2 TO FIX SPACING

			for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");

			System.out.print(j);

		}

		// THEN ADD THIS CODE

		if(i != -1){


			// ADD THE -1 TO FIX SPACING

			for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");

			System.out.print(i);

		}

		System.out.println();
	}



	
	
	public static void main(String[] args) {
		
		ArrayStructures newArray = new ArrayStructures();
		
		newArray.generateRandomArray();
		
		newArray.printArray();
		
	/*	System.out.println(newArray.getValueAtIndex(4));
		System.out.println(newArray.doesArrayContainThisValue(15));
		
		newArray.deleteIndex(2);
		
		newArray.printArray();
		
		newArray.insertValue(27);
		
		newArray.printArray();*/
		
		//newArray.linearSearchForValue(15);
		
		//newArray.bubbleSort();
		//newArray.selectionSort();
		newArray.insertionSort();
		//System.out.println("bubble sort 2");
		//newArray.bubbleSort2();
	/*	System.out.println("**********************************");
		System.out.println("          BINARY SEARCH           ");
		System.out.println("**********************************");
		newArray.binarySearchForValue(11);*/
		
		

	}
}

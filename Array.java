
public class Array {

	// declares array of integers
	int[] intArray = { 1, 2, 3, 4, 5 };

	// size of array
	int arraySize = intArray.length;

	// print out array function
	void printArray() {

		for (int i = 0; i < arraySize; i++) {

			System.out.println("| " + i + " | -> " + intArray[i]);
		}

	}

	// print element at index i
	void printElementByIndex(int i) {

		System.out.println("Element at index " + i + " = " + intArray[i]);
	}

	public static void main(String[] args) {

		Array array1 = new Array();
		array1.printArray();
		array1.printElementByIndex(3);

	}
}

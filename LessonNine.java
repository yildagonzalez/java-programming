import java.util.Arrays;
public class LessonNine {
	public static void main(String[] args) {
		
		// array of ints
		int[] randomArray;
		
		// array of length 10
		int[] numberArray = new int[10];
		
		randomArray = new int[20];
		randomArray[1] = 2;
		
		String[] stringArray = {"just", "random", "words"};
		
		// populating numberArray
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = i;
		}
		
		int k = 1;
		while (k <= 41) {System.out.print('-'); k++;}
		System.out.println();
		
		for (int j = 0; j < numberArray.length; j++) {
			System.out.print("| " + j + " ");
		}
		System.out.println("|");
		
		String[][] multiArray = new String[10][10];
		
		for (int i = 0; i < multiArray.length; i++)
		{
			for(int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = i + " " + j;
			}
		}
		
		
		
		
		for (int i = 0; i < multiArray.length; i++)
		{
			for(int j = 0; j < multiArray[i].length; j++) {
				System.out.print("| " + multiArray[i][j] + " ");			
				
			}
			System.out.println("|");
		}
		
		 k = 1;
		while (k <= 61) {System.out.print('-'); k++;}
		System.out.println();
		
		
		// enhanced for loop to print out array value
		for (int row : numberArray) {
			System.out.println(row);
		}
		System.out.println("\n");
		
		// enhanced for loop for multi dimensional array
		// for (dataType[] varForRow : arrayName {
		// 	for (dataType(of things in array) varForColumn : rows {
		
		for (String[] rows : multiArray) {
			for (String column : rows) {
				System.out.print("| " + column + " ");
			}
			System.out.println("|");
		}
		
		// copying first five elements of numberArray to numberCopy array
		int[] numberCopy = Arrays.copyOf(numberArray, 5);
		
		System.out.println("Printing numberCopy array..");
		for (int row : numberCopy) {
			System.out.println(row);
		}
		System.out.println();
		
		// copy part of an array using a range
		
		numberCopy = Arrays.copyOfRange(numberArray, 0, 5);
		
		System.out.println("New numberCopy array"); // should print 4-7
		
		for (int row : numberCopy) {
			System.out.println(row);
		}
		
		// print out whole array
		System.out.println(Arrays.toString(numberCopy));
		
		int[] moreNumbers = new int[100];
		// fill array with certain value
		Arrays.fill(moreNumbers, 2);
		
		char[][] boardGame = new char[10][10];
		for(char[] row : boardGame) {
			Arrays.fill(row, '*');
		}
		
		
		 k = 1;
		while(k <=30) {System.out.print('-'); k++;}
		System.out.println();
		for (int i = 0; i < boardGame.length; i++) {
			for (int j = 0; j <boardGame[i].length; j++) {
				System.out.print("|" + boardGame[i][j] + "|");
			}
			System.out.println();
		}
		k = 1;
		while(k <=30) {System.out.print('-'); k++;}
		System.out.println();
		
		
		// sorting an array
		
		int[] numsToSort = new int [10];
		
		// filling array with random numbers
		for (int i = 0; i < 10; i++) {
			numsToSort[i] = (int) (Math.random() * 500);
		}
		
		// sorting numsToSort
		Arrays.sort(numsToSort);
		
		System.out.println("Sorted numsToSort Array");
		System.out.println(Arrays.toString(numsToSort));
		
		// binary search; returns index key of number being looked for,
		// otw returns negative number
		
		int whereIs50 = Arrays.binarySearch(numsToSort, 200);
		
		System.out.println("Key of 50 if it exists, otw returns negative number");
		System.out.println(whereIs50);
		
		
		
	}
}

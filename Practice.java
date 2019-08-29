import java.util.*;

public class Practice {

    public static void main(String[] args) {

        System.out.println("Hello World");

        // Implement an array with numbers 1-20
        int[] numbers = new int[20];

        for (int i = 0; i < 20; i++) {
            numbers[i] = i + 1;
        }

        for (int i : numbers) {
            System.out.println(i);
        }

        // make array using collections library
        ArrayList<String> names = new ArrayList<String>();

        names.add("Yilda");
        names.add("Kevin");
        names.add("Alex");

        // check if array contains name "Yilda"
        System.out.println("Names contains name John: " + names.contains("John"));

    }
}
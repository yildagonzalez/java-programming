package PracticeProblems;
import java.util.*;

public class PracticeArrays {

	// 1. Two Sum
	/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	Example:

	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	 * 

	// O(n^2)
	public int[] twoSum(int[] nums, int target) {

		// array to hold returned indices
		int[] indices = new int[2];
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target && nums[i] != nums[j]) {
					indices[0] = i;
					indices[1] = j;
				}
			}
		}

		return indices;
	}
*/
 
	// 2. Two sum -> O(n)
	public int[] twoSum(int[] nums, int target) {
		
		// create HashMap to map value to index
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			
			if (map.containsKey(complement)) {
				return new int [] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sum solution found");
		
	}
	
	
	public static void main(String[] args){
		
		PracticeArrays obj = new PracticeArrays();
		
		int[] nums = {2,3,5,4,1};
		int target = 5;
		
		int[] index = obj.twoSum(nums, target);
		
		for (int i = 0; i < index.length; i++) {
			System.out.println(index[i]);
		}
		
	}
	
	
	
	
	
	
	
	

}

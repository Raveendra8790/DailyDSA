package ARRAYS;

public class FindMaxInArray {
	public static void main(String[] args) {
		
		int[] nums = {1,9,8,17,19,44,22,90};
		System.out.println("The Maximum value is :");
		System.out.println(findMaxInArray(nums));
	}
	
	public static int findMaxInArray(int[] num) {
		int max = Integer.MIN_VALUE ;
		
		for(int i: num) {
			if(i > max) {
				max = i;
			}
		}
				
			return max;	
	}
}

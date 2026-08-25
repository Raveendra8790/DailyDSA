package ARRAYS;

public class FindMinInArray {
public static void main(String[] args) {
		
		int[] nums = {1,9,8,17,19,44,22,90};
		System.out.println("The Maximum value is :");
		System.out.println(findMinInArray(nums));
	}
	
	public static int findMinInArray(int[] num) {
		int min = Integer.MAX_VALUE ;
		
		for(int i: num) {
			if(i < min) {
				min = i;
			}
		}
				
			return min;	
	}
}

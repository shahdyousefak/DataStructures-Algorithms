package ReverseArray;

public class reversearray {
	//running time complexity is O(N) + in-place algorithm (no need for extra memory)
	public int[] reverseArray(int[]nums) {
		int start = 0;
		int end = nums.length-1;
		
		while(end>start) {// N/2 iterations 
			swap(nums, start, end);
			
			start++;
			end--;
		}
		return nums;
	}
	
	private void swap(int[]nums, int s, int e) {
		int temp = nums[s];
		nums[s] = nums[e];
		nums[e] = temp;
	}

}

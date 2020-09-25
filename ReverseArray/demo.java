package ReverseArray;

public class demo {
	
	public static void main(String[] args) {
		int[] nums = {1,2,4};
		reversearray reverseArray = new reversearray();
		int[] revArr = reverseArray.reverseArray(nums);
		
		for(int i=0; i<revArr.length; i++) {
			System.out.println(revArr[i]);
		}
	}
}
	
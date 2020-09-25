package ReverseArray;

public class demo {
	
	public static void main(String[] args) {
		int[] nums = {1,6,4,10,-7,22};
		reversearray reverseArray = new reversearray();//obj in reversearray class
		int[] revArr = reverseArray.reverseArray(nums);
		
		for(int i=0; i<revArr.length; i++) {
			System.out.print(revArr[i] + " ");
		}
	}
}
	
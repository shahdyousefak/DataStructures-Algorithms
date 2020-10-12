package DuplicateInts;

//there is a brute-force approach (comparing item with all the rest): O(N^2)

//an O(N) running time using absolute values

public class RepeatedIntegersProblem {
	public static void solve(int[] arr) {
		//O(N)
		for(int i=0; i<arr.length; i++) {
			//if this value is positive, we have to flip
			if (arr[Math.abs(arr[i])] > 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			//otherwise it is negative: repetition! since we already flipped it in previous iterations
			else
				System.out.println(Math.abs(arr[i]) + " is a repititon! ");
				
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2,0};
		solve(arr);
	}

}

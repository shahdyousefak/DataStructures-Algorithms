
//O(n) time complexity
//O(1) space complexity

public class pairSumSequence {
	
	int pairSumSeq(int n) {
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=pairSum(i,i+1);
		}
		return sum;
	}
	
	int pairSum(int a, int b) {
		
		return a + b;
	}
	
	public static void main(String[] args) {
		pairSumSequence t1 = new pairSumSequence();
		System.out.println(t1.pairSumSeq(4));

	}
}

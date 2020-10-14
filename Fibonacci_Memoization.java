//memoization optimizes exponential time recusrive algorithms.
public class Fibonacci_Memoization {
	/*
	 * At each call tp fib(i), we have already computed and stored the values for fib(i-1) and fib(i-2)
	 * We just need to look up the value (at memo[n-1] and memo[n-2]) sum them and store the new result - and return -> cst time
	 * Constant amount of work n times -> O(n) time
	 */
	static void allFib(int n) {
		int[] memo = new int[n+1];
		for(int i=0; i<n; i++) {
			System.out.println(i + " : " + fib(i, memo));
		}
	}
	static int fib(int n, int[] memo) {
		if(n<=0) return 0;
		else if(n==1) return 1;
		else if(memo[n]>0) return memo[n];
		
		memo[n] = fib(n-1, memo) + fib(n-2, memo);
		return memo[n];
	}
	public static void main(String[] args) {
		allFib(10);
	}
}

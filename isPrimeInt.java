
public class isPrimeInt {
	//checks if a number is prime by checking for divisibility on numbers less than it. 
	//it only needs to go up to the sqrt(n) bc if n is divisible by a number > than its square root, its divisible by something smaller than it.
	static boolean isPrime(int n) {
		for(int x=2; x*x<=n; x++) {//stops when x=sqrt(n) => O(sqrt(n)) runtime.
			if(n%x==0)return false;//O(1) work
		}
		return true;
	}
	public static void main (String[] args) {
		System.out.println(isPrime(7));
		System.out.println(isPrime(8));
		System.out.println(isPrime(33));
		System.out.println(isPrime(41));
	}
}

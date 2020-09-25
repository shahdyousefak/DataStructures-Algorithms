package Anagram;

public class demo {
	public static void main(String [] args) {
		char[] w1 = {'l', 'e', 'a', 'p'};
		char[] w2 = {'p', 'a', 'l', 'e'};
		char [] w3 = {'p', 'a', 'l'};
		char [] w4 = {'p', 'e', 'e', 'l'};
		
		Anagram AnaTemp = new Anagram();
		System.out.println(AnaTemp.solve(w1, w2));
		System.out.println(AnaTemp.solve(w1, w3));
		System.out.println(AnaTemp.solve(w2, w4));
	}
	
}

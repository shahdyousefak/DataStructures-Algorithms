package a1;

//----------------------------------------
//Assignment 1
//Version 2
//Written by: 
//Shahd Yousef 40114313
//Thanh-Nam Nguyen 40099787
//----------------------------------------

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;

/**
* This program takes a string containing 0, 1 and * and prints into an out.txt file all possible combinations by replacing * by 0 and 1.
* 
* @author Shahd Yousef 40114313, Thanh-Nam Nguyen 40099787
*<p>
* COMP352
* Assignment 1
* Version 1
*/
public class v1 {
	static int totaltime=0;
	/**
	 * RevealStr: Finds all possible combinations from the given string containing binary numbers by converting the * given into 1s and 0s
	 * @param in the input string that will be used to generate all possible outcomes.
	 * @param index the index that runs through the length of the in string.
	 */
	public static void RevealStr(String in, int index) {		
		long start = System.nanoTime();
		if (index == in.length()) {																						
			try {																
				File f = new File("out.txt");
				if (!f.exists())
					f.createNewFile();
				PrintWriter writer = new PrintWriter(new FileOutputStream(f, true));
				writer.println(in);
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}
		char[] input = in.toCharArray();
		if (input[index] == '*') {
			input[index] = '0';
			String inputString = String.valueOf(input);
			RevealStr(inputString, index + 1);
			input[index] = '1';
			inputString = String.valueOf(input);
			RevealStr(inputString, index + 1);
			input[index] = '*';
		}
		else {
			RevealStr(in, index + 1);
		}
		long end = System.nanoTime();
		long time = end - start;
		//System.out.println(time);
		totaltime += time;
	}
	
	public static void main(String[] args) {
		String inputString = "10*10*10*10";
		RevealStr(inputString, 0);
		System.out.println("Total runtime execution in milliseconds: " + totaltime/1000000);
	}

}
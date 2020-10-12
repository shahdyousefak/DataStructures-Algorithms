package a1;

//----------------------------------------
//Assignment 1
//Version 
//Written by: 
//Shahd Yousef 40114313
//Thanh-Nam Nguyen 40099787
//----------------------------------------

import java.util.Stack;
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
* Version 2
*/
public class v2 {
  // 
	/**
	 * RevealStr: Finds all possible combinations from the given string containing binary numbers by converting the * given into 1s and 0s
	 * @param in the input string that will be used to generate all possible outcomes.
	 */
  public static void RevealStr(String in)
  {
	  long start = System.nanoTime();
          // Instantiating a new stack
          Stack<String> stack = new Stack();
          stack.push(in);    //Placing the input into the stack
          int index;
          
          // Loop through the entire stack
          while (!stack.empty())
          {
                  // Pull the String out from the stack.
                  String str = stack.pop();
                  // 
                  if ((index = str.indexOf('*')) != -1) {
                          // 
                          for (char ch = '0'; ch <= '1'; ch++)
                          {
                                  str = str.substring(0, index) + ch + str.substring(index + 1);
                                  stack.push(str);
                          }
                  }
                  else {			
                  			try {																
                  				File f = new File("out2.txt");
                  				if (!f.exists())
                  					f.createNewFile();
                  				PrintWriter writer = new PrintWriter(new FileOutputStream(f, true));
                  				writer.println(str);
                  				writer.close();
                  			} catch (IOException e) {
                  				e.printStackTrace();
                  			}
                  }
          }
      	long end = System.nanoTime();
		long time = end - start;
		System.out.println("Execution time in milliseconds: " + time/1000000);
  }

  public static void main(String[] args)
  {
	  String input = "10*10*10*10";
          RevealStr(input);
  }
}

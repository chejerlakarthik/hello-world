/**
 * 
 */
package org.javabrains;

/**
 * @author Yashoda
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello, World.");
		
		if(args.length !=1)
		{
			System.err.println("Need one argument from command-line");
		}
		else
		{
			System.out.println("The developer name is " + args[0]);
		}
	}

}

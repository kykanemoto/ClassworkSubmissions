/**
 * A recursion class 
 * @author Kyla
 */
import java.util.Scanner;
public class ChatBot {

	public static void main(String[] args) {
		//Task 2: In that main method, call a method stupidNumberSayer(). 
		//The method should be static, void, and have no formal parameters.
		stupidNumberSayer();

		//The rest of the tasks are to be done in the stupidNumberSayer() method.
	}

	private static void stupidNumberSayer() {
		//Task 3: Open a Scanner object.
		Scanner Scan = new Scanner(System.in);
		//Task 4: Allow the user to enter a number using the .nextInt() method in the Scanner class. 
		//You may need to refer to old code or look up how to do this again. 
		int a = Scan.nextInt();

		//Task 5: Check if the number entered was "777" and if it is, simply 
		//print out "That is a good number." and close the scanner object.
		if(a == 777)
		{
			System.out.print("That is a good number.");
		}
		//Task 6: If the number is anything else, instead print "That is a stupid number!" 
		//and close the scanner, and also then call stupidNumberSayer().
		else if (a!=777)
		{
			System.out.print("That is a stupid number!");
			stupidNumberSayer();
		Scan.close();
		}
	}

}

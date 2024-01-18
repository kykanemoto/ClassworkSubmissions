package labs;
import java.util.Scanner;
public class DiceRoller 
{
	public static void main(String[] args) 
	{
		//create a scanner to receive and store user's input
		Scanner myScan = new Scanner (System.in);
		//scan in the input
		String dice = myScan.nextLine();
		//call a method to get the first and second numbers of a string (ex. 4d5)
		dicenum(dice);
		//close the scanner
		myScan.close();
		}
		/**
		 * split the input
		 * (ex. 4d5)
		 * take the substring of the string to isolate the first and second numbers
		 * excluding the d
		 * @param dice
		 */
		private static void dicenum(String dice)
		{
		//declare an int mid equal to the indexOf d
		int mid = dice.indexOf("d");
		String first = dice.substring(0,mid);
		String last = dice.substring(mid+1);
		int a = Integer.valueOf(first);
		int b = Integer.valueOf(last);
		//print out the statement
		System.out.println("The first number is " + first + 
				" and the second number is " + last + ". Their sum is " + (a+b) + ".");
		}
}

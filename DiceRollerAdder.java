/**
 * Dice Machine class that will roll a user's dice input
 * @author Kyla
 */
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
		//declare String called first and give it the substring of the dice input from index 0 to the index of mid
		String first = dice.substring(0,mid);
		//declare String called last and give it the substring of the index of mid onward
		String last = dice.substring(mid+1);
		//declare int a and give it the value of first
		int a = Integer.valueOf(first);
		//declare int b and give it the value of last
		int b = Integer.valueOf(last);
		//print out the first and second number and their sum
		System.out.println("The first number is " + first + 
				" and the second number is " + last + ". Their sum is " + (a+b) + ".");
		}
}

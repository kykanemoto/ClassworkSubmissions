package labs;
import java.util.Scanner;
public class DiceMachine 
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
		 * Method to return a number based on how many and what kind of dice are rolled
		 * @param a - how many dice
		 * @param b - kind of dice
		 */
		public static void rollDice(int a, int b) {
		//all final dice rolls with equal 0
		int num = 0;
		//create a for loop to make sure the right numbers of dice are rolled
		for(int i=1; i<=a;i++)
		{
			//use random math method to get a number between 1 and # of sides on dice
			num += (b*Math.random()+1);
		}
		//print the final roll
		System.out.println("Rolling " + a + " " + b + "-sided dice gives " + num + ".");
		}
		
		/**
		 * split the input
		 * (ex. 4d5)
		 * take the substring of the string to isolate the first and second numbers
		 * excluding the d
		 * @param dice
		 */
		public static void dicenum(String dice)
		{
		//declare an int mid equal to the indexOf d
		int mid = dice.indexOf("d");
		//make a string that takes in the user's input and splits it by
		//the d character
		String first = dice.substring(0,mid);
		String last = dice.substring(mid+1);
		//change String into and Integer to add the two numbers together
		int a = Integer.valueOf(first);
		int b = Integer.valueOf(last);
		//print out the statement
		System.out.println("The first number is " + first + 
				" and the second number is " + last + ". Their sum is " + (a+b) + ".");
		//call a method to return a number 
		rollDice(a,b);
	}

}
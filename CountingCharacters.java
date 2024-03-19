package labs;
public class DiceRoller 
{
	public static void main(String[] args) 
	{
		//call a method to check how many times a character appears in a string
		countChars("abbccdd", 'a');
	}
/**
 * method to return count of a character
 * for loop to read all characters in string
 * @param string
 * @param c
 * @return
 */
	private static int countChars(String string, char c) 
	{
		//initialize count
		int count = 0;
		//make a for loop that goes through each character in the string
		for (int i=0;i< string.length();i++)
		{
			//make an if statement to check if the string at the index is c
			if(string.charAt(i) == c)
			{
				//add one to count to keep track of how many characters are c
				count ++;
			}
		}
		//print out statement to check
		 System.out.println(count);
		//if the statement is false return count
		 return count;
	}
}

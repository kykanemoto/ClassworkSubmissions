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
	private static int countChars(String string, char c) {
		int count = 0;
		for (int i=0;i< string.length();i++)
		{
			if(string.charAt(i) == c)
			{
				count ++;
			}
		}
		//print out statement to check
		 System.out.println(count);
		 return count;
	}
}

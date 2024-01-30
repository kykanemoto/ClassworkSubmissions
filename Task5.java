package labs;
public class DiceMachine {

	public static void main(String[] args) 
	{
		//instantiate a new string
		String str = new String ("The apple is red");
		//instantiate a second string with removed strings
		String str2 = new String(noSpace(str));
		//print str2
		System.out.println(str2);
			
		}
	/**
	 * method called noSpace that removes spaces from String
	 * @param str
	 * @return the String with no spaces
	 */
		public static String noSpace (String str)
		{
			//declare int spaces as 0 and keep track of the previous spaces
			int spaces = 0;
			//instantiate a new string called noSpace to store the string with no spaces
			String noSpace = new String ("");
			//create a for loop
			//declare an int i as 0, and i will increase until it isn't less than the 
			//length of the string
			//ensures the loop is run the correct amount of times
			for (int i = 0; i<str.length(); i++)
			{
				//if statement to check each character in the string if the loop is true
				//and if the character at the number at i is a space
				if (str.charAt(i) == ' ')
				{
					//concatenate noSpace to include the String value from the number of prior and current spaces
					//does not include the first character and those after the last space in the string
					noSpace = noSpace.concat(str.substring(spaces + 1, i));
					//reassign int spaces as i to store the current spaces
					spaces = i;
				}
			}	
			//get the value of noSpace with concatenating
			//includes the first character and those after the last space in the string
			//keep outside of the loop
			noSpace = String.valueOf(str.charAt(0)).concat(noSpace).concat(str.substring(spaces + 1));
			//return noSpace
			return noSpace;
		}
}	

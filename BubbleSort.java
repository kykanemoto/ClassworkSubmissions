/**
 * a bubble sorter class that will sort a random array and print it
 * @author Kyla
 */
public class BubbleSorter {

	public static void main(String[] args) 
	{
		//declare an int array randomNumbers
		int [] randomNumbers = makeRandom();
		//call a sort method and put the array in it
		bubbleSort(randomNumbers);
		//call a method that will print the final sorted array
		printArr(bubbleSort(randomNumbers));
	}
	/**
	 * print each element in the sorted array
	 * @param bubbleSort
	 */
	private static void printArr(int[] randomNumbers) 
	{
		//print the first brace to enclose the array
		System.out.print("{");
		//create a for loop to traverse the array
		for (int i = 0; i<randomNumbers.length; i++)
		{
			//print out the current element with a comma following it
			System.out.print(randomNumbers[i] + ", ");
		}
		//end the array with the last element with a comma following it 
		System.out.print(randomNumbers[randomNumbers.length-1]);
		//print the last brace to enclose the array
		System.out.print("}");
		
	}
	/**
	 * this method will look at the current element of the array and 
	 * the one following it. then it will determine which number to put first
	 * @return 
	 */
		private static int[] bubbleSort(int[]randomNumbers) 
		{
		//declare an int array to traverse the randomNumbers array
		int[] b = randomNumbers;
		//create a for loop that will repeat this method as many times as needed
		for (int t = 0; t <randomNumbers.length; t++)
		{
			//create a for loop to traverse the elements in the array
			for (int i = 0; i<randomNumbers.length-1; i++)
			{
				//create an if statement: if the number next to an element is greater than it
				if (b[i]> b[i+1])
				{
					//create a placeholder (temp)
					int temp = b[i];
					//set the current element to the element that is after it (lesser number)
					b[i] = b[i+1];
					//set the element in front of the current element to the placeholder (greater number)
					b[i+1] = temp;
				}
			}
		}
		//return the sorted array
		return b;
	}
		/**
		 *  this method will make a random int array that we will need to sort out
		 * @return
		 */
		private static int[] makeRandom() 
		{
			//declare an int array and set it to 2000 blank elements
			int[] bigNums = new int[2000];
			//declare int len and set it equal to the length of bigNums
			int len = bigNums.length;
			//create a for loop to traverse the array
			for (int i = 0; i < len; i++)
			{
				//declare int randomNumber between 1 and 1000
				//cannot be 0
				int randomNumber = (int) ((Math.random() * 1000) + 1);
				//set the array bigNums at the index equal to the random generated number
				//from 1 to 1000
				bigNums[i] = randomNumber;
			}
			//return the new array bigNums
			return bigNums;
	}

}

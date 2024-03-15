/**
 * classwork with traversal methods
 * @author Kyla
 */
package introproblems;

public class TraversalMethods {

	public static void main(String[] args) {
		//declare an int array
		int []arr = {2, 5, 7, 12, 3, 1, 6};
		//call a method that is passed an int array and returns 
		//the highest value in that array
		highvalue(arr);
		//print the highvalue method to check if it works
		System.out.println(highvalue(arr));
		//declare a double array
		double []arr1 = {3.4, 5.7, 4.1, 9.7, 0.1};
		//call a method that is passed an array of doubles 
		//and returns a double consisting of their average.
		averagearr(arr1);
		//print the averagearr method to check if it works
		System.out.println(averagearr(arr1));
		//declare an int array
		int []arr2 = {1,4,9};
		//call a method that is passed an int array and 
		//returns whether or not the array has any even numbers in it
		evens(arr2);
		//print the evens method to check if it works
		System.out.println(evens(arr2));
		//declare an int array
		int []arr3 = {2, 6, 14};
		//call a method that is passed an int array and 
		//returns whether or not the array has ALL even numbers in it
		alleven(arr3);
		//print the all even method to check if it works
		System.out.println(alleven(arr3));
		//declare a double array
		double []arr4 = {2.2, 2.2, 2.2, 4.5, 6.9};
		//call a method that is passed a double array and 
		//returns whether or not three consecutive doubles 
		//of the same value appear in the array
		consecdubs(arr4);
		//print the consecdubs method to check if it works
		System.out.println(consecdubs(arr4));
	}
	/**
	 * 5. Make a method that is passed a double array and 
	 * returns whether or not three consecutive doubles 
	 * of the same value appear in the array.
	 * Ex: { 2.0, 8.8, 8.8, 8.8, 9.0, 3.1} --> returns true
	 * Ex: {3.1, 7.1, 6.6, 9.3} --> returns false
	 * Precondition: the array will always be at least length three.
	 * @param arr4
	 */
	public static boolean consecdubs(double[] arr4) {
		//make a for loop to traverse the array
		for(int i = 0; i<=arr4.length-3; i++)
		{
			//make an if statement to check if there are 3 consecutive doubles
			if (arr4[i] == arr4[i+1] && arr4[i]== arr4[i+2])
			{
				//if so return true
				return true;
			}
		}
		//if not return false
		return false;
	}
	/**
	 * 4. Make a method that is passed an int array and 
	 * returns whether or not the array has ALL even numbers in it.
	 * Ex: { 1, 6, 9} --> returns false
	 * Ex: { 4, 2, 18} --> returns true
	 * Precondition: the array will always be at least length three.
	 * @param arr3
	 */
	public static boolean alleven(int[] arr3) {
		//make a for loop to traverse the array
		for (int i = 0; i<arr3.length; i++)
		{
			//make an if statement to check if an element
			//in the array is odd
			if(arr3[i]%2 != 0)
			{
				//if so return false
				return false;
			}
		}
		//if not return true
		return true;
	}
	/**
	 * 3. Make a method that is passed an int array and 
	 * returns whether or not the array has any even numbers in it.
	 * Ex: { 1, 6, 9} --> returns true
	 * Ex: { 1, 5, 7} --> returns false
	 * Precondition: the array will always be at least length three.
	 * @param arr2
	 * @return 
	 */
	public static boolean evens(int[] arr2) {
		//make a for loop to traverse the array
		for (int i = 0; i<arr2.length; i++)
		{
			//make an if statement to check if an element in an array is even
			if (arr2[i]%2 == 0)
			{
				//if so return true
				return true;
			}
		}
		//if not return false
		return false;
	}
	/**
	 * 2. Make a method that is passed an array of doubles 
	 * and returns a double consisting of their average. 
	 * Ex: { 3.1, 4.2, 5.0, 6.2, 6.9} --> returns 5.08
	 * Precondition: the array will always be at least length three.
	 * @param arr1
	 */
	public static double averagearr(double[] arr1) {
		//initialize sum
		double sum = 0;
		//make a for loop to traverse the array
		for (int i = 0; i<arr1.length; i++)
		{
			//add up each element in the array and divide it by the 
			//number of elements to get the average of the array
			sum += arr1[i]/arr1.length;
		}
		//return the sum
		return sum;
	}
	/**
	 * 1. Make a method that is passed an int array and returns the highest value in that array.
	 * Ex: { 2, 6, 3, 9, 1, 1, 4} ---> returns 9
	 * Precondition: the array will always be at least length three
	 * @param arr
	 */
	public static int highvalue(int[] arr) {
		//initialize highest element
		int high = arr[0];
		//make a for loop to traverse the array
		for (int i = 0; i<arr.length; i++)
			//make an if statement to check for the highest element in the array
			if (arr[i] > high)
			{
				//set high to arr[i] if the if statement is true
				high = arr[i];
			}
		//return high to get the highest element in the array
		return high;
	}

}

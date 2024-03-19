/**
 * a class to get the n'th element and divide it by 2, and return 
 * the first and last elements in an array
 * @author Kyla
 */
public class ArraysPractice 
{

	public static void main(String[] args) 
	{
		//TASK 1: Create a method divideElementByTwo that is passed an int array arr and an int n, 
		//and the method will change arr such that its n'th element is divided by two.
		//For example, if you have an array evens {2, 4, 6, 8, 10, 12} 
		//and you execute: divideElementByTwo( evens, 4 ) then evens should now be equal to
		//{2, 4, 6, 8, 5, 12}
		int[]evens = {2, 4, 6, 8, 10, 12};
		divideElementByTwo(evens, 2);
		//print the divideElementByTwo method
		System.out.println(divideElementByTwo(evens, 4));

		//TASK 2:Create a method giveFirstAndLastArray that if passed an array, 
		//will return an array consisting of ONLY the first and last two elements. 
		//For example, if you have an array evens {2, 4, 6, 8, 10, 12} 
		//and you execute: giveFirstAndLastArray( evens ) then the method will return {2, 12}
		int[]firstLast = giveFirstAndLastArray(evens);
		//print the first and last elements int the array
		System.out.println(firstLast[0] + "" + firstLast[firstLast.length-1]);
	}
	/**
	 * Create a method giveFirstAndLastArray that if passed an array, 
         * will return an array consisting of ONLY the first and last two elements.
	 * @param evens
	 * @return newArr
	 */
	
	private static int[] giveFirstAndLastArray(int[] evens) 
	{
		//make a newArr equal to the first and last elements
		int[] newArr = {evens[0],evens[evens.length-1]};
		//return newArr
		return newArr;	
	}
	/**
	 * method to divide the n'th element by 2 
	 * @param evens
	 * @param n
	 * @return evens[n]
	 */
	private static int divideElementByTwo(int[] evens, int n) 
	{
		//grab the n'th element and divide it by 2
		evens[n]/=2;
		//return arr[n] to get the new array value at n
		return evens[n];
	}
	
}

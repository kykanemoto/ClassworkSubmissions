/**
 * class to print out the number before and after the n'th element
 * @author Kyla
 */
public class printPrevNextElement {

	public static void main(String[] args) {
		//Make a method that is passed an array of doubles nums and an int n. 
		//The method should print out the number before and after the n'th element.
		//For example, if the method is passed actual parameters in main like so:
		//Precondition: the method will never be passed an index that creates an 
		//ArrayIndexOutOfBoundsException error.
		double[] arr = {1.01, 3.22, 5.99, 6.78, 7.80, 9.32 14.37};
		int index = 3;
		
		//call a method get the previous and next number of an element
		printPrevnextElement(arr, index);

	}
	/**
	 * method to print the number before and after the index
	 * @param arr
	 * @param n
	 */
	private static void printPrevnextElement(double[] num, int n) {
		//print the number before and after the index
		System.out.println(num[n-1] + " " + num[n+1]);
		System.out.println("The number before the element at index " + n + " is "
		+ num[n-1] + " and the number after the element at index " + n + " is " 
		+ num[n+1] + ".");
	}

}

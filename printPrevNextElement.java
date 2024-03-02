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
		double[] arr = {1.01, 3.22, 5.99, -6.78, 14.37};
		double index = 2;
		
		//call a method get the previous and next number of an element
		printPrevnextElement(arr, index);

	}
	/**
	 * method to get the number before and after the index
	 * @param arr
	 * @param index
	 */
	private static void printPrevnextElement(double[] arr, double index) {
		//print the number before and after the index
		System.out.println(arr[(int)index-1] + " " + arr[(int)(index+1)]);
		System.out.println("The number before the element at index 2 is "
		+ arr[(int)index-1] + " and the number after the element at index 2 is " 
		+ arr[(int)(index+1)]);
	}

}

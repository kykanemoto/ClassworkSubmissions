
public class sumArrElements {

	public static void main(String[] args) {
		//declare an array
		double []arr = {2.3, 5.4, 6.1, 5.8};
		//Create a method sumArrElements that is passed an array 
		//of doubles and returns the sum of all its elements. 
		//For example, when the method is passed 
		//{ 3.1, 2.1, 8.4}
		//the method should return 13.6. 
		//To make sure your code works, you should probably 
		//make a class with a main method. In that main method, 
		//make an array, pass the method the array, and print out whatever it returns. 
		sumArrElements(arr);

		//declare a new array
		int []arr1 = {8, 3, 7, 23, 18, 43};
		//Create a method makeEveryOtherOne that is passed an array of ints and changes that array. 
		//It should make every other element in the array '1' starting with the second element.  
		//For example, when the method is passed 
		//{ 3, 17, 12, 8, 9, 4, 12 }
		//the method should change it into 
		//{ 3, 1, 12, 1, 9, 1, 12 }
		
		//Precondition: the array will always be at least length 2. 
		makeEveryOtherOne(arr1);

	}
	/**
	 * method that is passed an array of ints and changes the array
	 * to make every other element '1' beginning with the second element
	 * @param arr1
	 */
	private static void makeEveryOtherOne(int[] arr1) {
		//make a for loop to traverse the array
		//declare i and set it equal to one since you want it to 
		//change every other element from starting from 2
		for(int i=1; i<arr1.length; i+=2)
		{
			//set the element at the index equal to one
			arr1[i]=1;
		}
	}
		
	/**
	 * method that is passed an array of doubles and returns the sum of all its elements
	 * @param arr
	 */
	public static double sumArrElements(double [] arr) {
		//declare int sum
		double sum = 0;
		//make a for loop to traverse the array
		for(int index = 0; index < arr.length; index++)
		{
			//add the value of the element at the index to sum
			sum += arr[index];
		}
		//return the sum of all the elements in the array
		return sum;
	}
	
}

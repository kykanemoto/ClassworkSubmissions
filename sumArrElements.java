
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
		printsumArrElements(arr);

		//declare a new array
		int []arr1 = {8, 3, 7, 23, 18, 43};
		//Create a method makeEveryOtherOne that is passed an array of ints and changes that array. 
		//It should make every other element in the array '1' starting with the second element.  
		//For example, when the method is passed 
		//{ 3, 17, 12, 8, 9, 4, 12 }
		//the method should change it into 
		//{ 3, 1, 12, 1, 9, 1, 12 }
		
		//Precondition: the array will always be at least length 2. 
		printmakeEveryOtherOne(arr1);

	}
	/**
	 * method that is passed an array of ints and changes the array
	 * to make every other element '1' beginning with the second element
	 * @param arr1
	 */
	private static void printmakeEveryOtherOne(int[] arr1) {
		//make a for loop to traverse the array
		//declare i and set it equal to one since you want it to 
		//change every other element from starting from 2
		for(int i=1; i<arr1.length; i+=2)
		{
			arr1[i]=1;
		}
		//check if it works
		//print a bracket
		System.out.print("{");
		//for loop to traverse the array
		for(int traverser = 0; traverser < arr1.length; traverser++)
		{
			//print out the array
			System.out.print(arr1[traverser]);
		//print a comma if counter isn't on last element
		if (traverser != arr1.length-1)
			//print a comma after each element
			System.out.print(", ");
		}
		//print a bracket
		System.out.print("}");
		}
		
	/**
	 * method that is passed an array of doubles and returns the sum of all its elements
	 * @param arr
	 */
	private static void printsumArrElements(double [] arr) {
		//declare int sum
		double sum = 0;
		//make a for loop to traverse the array
		for(int index = 0; index < arr.length; index++)
		{
			//get the sum of all the elements in the array
			sum = sum + arr[index];
		}
		//print the sum
		System.out.println(sum);
	}
	
}

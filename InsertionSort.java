/**
 * Make a class called InsertionSorter with a main method. 
 * You'll use it to call the methods you make in order to test they work.
 * @author Kyla
 */
public class InsertionSort {

	public static void main(String[] args) {
		//declare an int array
		int [] arr = {2, 5, 7, 8, 10, 6};
		//declare a new int array
		int [] arr1 = {4, 5, 7, 2, 1, 9};
		//call an arrayShifter method and pass the arr through it
		//will check and sort every element in the arr starting from the last one
		arrayShifter(arr1, 3);
		//call an insertionSort method and pass the arr through it
		//will sort the arr
		insertionSort(arr);

	}
	/**
	 * Create a method insertionSort (that is passed an int array) with a for loop that
	 * traverses the array from left to right. On each iteration of the loop (in the work) write
	 * code that calls the arrayShifter method and passes it the array and the current loop index.
	 * @param arr
	 */
	private static void insertionSort(int[] arr) {
		//create a for loop that traverses the array
		//set int i equal to 1 and increment i until it isn't less than the length of arr
		for (int i = 1; i<arr.length;i++)
		{
			//call an arrayShifter1 method and pass the arr and a specific index through it
			//will check and sort every element in arr at the specified index
			arrayShifter(arr,i);
		}
		
	}
	/**
	 * Change the previous method so that it is passed an int index and
	 * will sort the value at that index instead of the last index. (Precondition: the rest of the array will be sorted)
	 * Example input and resulting array: ( {2, 4, 6, 8, 5, 10, 12} , 4 ) -----> {2, 4, 5, 6, 8, 10, 12}
	 * @param arr
	 * @param i
	 */
	private static void arrayShifter(int[] arr, int index) {
		//declare an int index that takes the element at a specific index
		int j = arr[index];
		//create a for loop that sets int i equal to index minus 1 and decrements i until it isn't >= 0
		for (int i = index-1; i>=0; i--)
		{
			//create an if statement to chek if the element of the specific index is less than the arr at i
			if(j<arr[i])
			{
				//if so, swap the two arr elements
				//declare an int temp equal to j
				int temp = j;
				//assign arr[i+1] equal to arr at the current index i
				arr[i+1] = arr[i];
				//assign arr at the current index i to temp
				arr[i] = temp;
				//assign j to the arr at the current index i, which is the
				//element that is being checked
				j = arr[i];
			}
		}
		
	}
	/**
	 * Create a method arrayShifter that when passed an array of ints, will take
	 * the last element and sort it into the right place. 
	 * Precondition: The array will be sorted except for the last element.)
	 * Example input array and resulting array: {2, 5, 7, 8, 10, 6} -----> {2, 5, 6, 7, 8, 10}
	 * @param arr
	 */

	private static void arrayShifter(int[] arr) {
		//create a for loop to traverse the array
		//set int i equal to 1 and increment i until it isn't less than the length of arr
		for (int i = 1; i<arr.length; i++)
		{
			//declare int k and assign it arr at index i
			int k = arr[i];
			//declare int j and assign it the index minus 1
			int j = i-1;
			
			//create while to check if j is >= to 0 and if the 
			//k is smaller than the value of j
			while (j>=0 && arr[j]>k)
			{
				//make arr at the index of j+1 equal to arr at the index of j
				arr[j+1] = arr[j];
				//make j equal to j-1 so that it goes back to the start of the while loop
				j = j - 1;
			}
			//make arr at the index j+1 equal to k so that it the initial value at arr[k] 
			//is brought to the front
			arr[j+1] = k;
		}
		//create a for loop to traverse the array
		//set int i equal to 0 and increment i until it isn't less than the length of arr
		for(int i = 0; i<arr.length; i++)
		{
		}
	}
}

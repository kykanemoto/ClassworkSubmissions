/**
 * Make a class ArrayListSorters with a main method.
 */
import java.util.ArrayList;
public class ArrayListSorters {

	public static void main(String[] args) {
		//Task 1: In the main method, instantiate two ArrayLists nums and names of Integers 
		//(remember ints wouldn't work for ArrayLists) and Strings respectively. 
		//Fill them with five unsorted values (nums out of numerical order and names out of alphabetical order). 
		ArrayList <Integer> nums = new ArrayList <Integer>();
		nums.add(7);
		nums.add(3);
		nums.add(5);
		nums.add(11);
		nums.add(2);
		
		ArrayList <String> names = new ArrayList <String>();
		names.add("Keanu");
		names.add("Bob");
		names.add("Adam");
		names.add("Jubilee");
		names.add("Duncan");
		
		//call a bubbleSortNumbers method
		bubbleSortNumbers(nums);
		//call a bubbleSortStrings method
		bubbleSortStrings(names);

	}
	/*
	 * Task 3: Create a void method bubbleSortStrings that is passed an ArrayList 
	 * and bubble sorts it into alphabetical order. 
	 */
private static void bubbleSortStrings(ArrayList<String> names) {
	//create a for loop that will repeat this method as many times as needed
		for (int t = 0; t <names.size(); t++)
		{
			//create a for loop to traverse the elements in the array
			for (int i = 0; i<names.size()-1; i++)
			{
				//create an if statement: compare current element and to number next to it and see if 
				//it's greater than zero
				if (names.get(i).compareTo(names.get(i+1))>0)
				{
					//create a placeholder (temp)
					String temp = names.get(i);
					//set the current element and element that is after it
					names.set(i, names.get(i+1));
					//set the element after i and temp
					names.set(i+1, temp);
				}
			}
		}
		
	}
/*
 * Task 2: Create a void method bubbleSortNumbers that is passed an ArrayList
 * and bubble sorts it just like we did for arrays. 
 * his method will look at the current element of the array and 
 * the one following it. then it will determine which number to put first
 */
	private static void bubbleSortNumbers(ArrayList<Integer> nums) {
		//create a for loop that will repeat this method as many times as needed
		for (int t = 0; t <nums.size(); t++)
		{
			//create a for loop to traverse the elements in the array
			for (int i = 0; i<nums.size()-1; i++)
			{
				//create an if statement: if the number next to an element is greater than it
				//if this doesn't work use compareTo
				if (nums.get(i)> nums.get(i+1))
				{
					//create a placeholder (temp) and set it equal to nums at i to nums at i+1
					Integer temp = nums.set(i, nums.get(i+1));
					//set the element in front of the current element to i+1 and the placeholder
					nums.set(i+1, temp);
				}
					
			}
		}
	}		
}

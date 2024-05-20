/**
 * ArrayList methods are a little unique. They usually do something and return something, for extra functionalities. 
 * The point of this assignment is to practice the unique methods:
 */
import java.util.ArrayList;
public class ArrayListMethodInDepth {

	public static void main(String[] args) {
		//In the main method, instatiate an empty ArrayList foods that stores Strings. 
		ArrayList<String> foods = new ArrayList<String>();
		//Then add the following Strings to foods: "Apples", "Bread", "Cookies". 
		//After each task (except task 1) print out the length of the foods ArrayList.
		foods.add("Apples");
		foods.add("Bread");
		foods.add("Cookies");
		
		//Task 1: Print out the length of the foods ArrayList.
		//.size() method will get the length of an ArrayList. 
		//In this case, it will take the ArrayList and return the length which is 3.
		System.out.println(foods.size());
		
		//Task 2: Inside of a print statement, add the String "Dole Whip" to foods. 
		//It will print true.
		//.add(E) method will add another element to the end of the ArrayList (here it will be Dole Whip)
		//It will add Dole Whip to the end of the ArrayList and return a boolean (here it will be true)
		System.out.println(foods.add("Dole Whip"));
		System.out.println(foods.size());

		//Task 3: Inside of a print statement, use the .set(E) method to change "Bread" in foods to "Butter".
		//It will print Bread
		//.set(int, E) method replace the element of an ArrayList at the specific index (here it is Bread at index 1)
		//and replaces it with a new element (here it is Butter)
		//In this case, it will change Bread to Butter and return Bread.
		System.out.println(foods.set(1, "Butter"));
		System.out.println(foods.size());

		//Task 4: Inside of a print statement, use the .remove(int) method to remove "Cookies" from foods.
		//It will print Cookies
		//.remove() method removes an element from an ArrayList at the specific index (here it is Cookies at index 2)
		//and will return the element that was removed (here it is Cookies)
		//In this case, it will remove Cookie from the ArrayList and return Cookies.
		System.out.println(foods.remove(2));
		System.out.println(foods.size());
		

	}

}

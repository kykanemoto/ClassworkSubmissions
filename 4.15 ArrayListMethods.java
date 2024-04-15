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
		//Method will print the ArrayList length. In this case, it take the ArrayList and return 3.
		System.out.println(foods.size());
		
		//Task 2: Inside of a print statement, add the String "Dole Whip" to foods. 
		//In the line comment for this code, state what it prints. 
		//It will print true.
		//Method will add another String to the end of the ArrayList. In this case, it will add Dole Whip to the
		//end of the ArrayList and return true.
		System.out.println(foods.add("Dole Whip"));
		System.out.println(foods.size());

		//Task 3: Inside of a print statement, use the .set(E) method to change "Bread" in foods to "Butter". Comment what it prints.
		//It will print Bread
		//Method will change the string at that index to the new string. In this case, it will change Bread to Butter and return Bread.
		System.out.println(foods.set(1, "Butter"));
		System.out.println(foods.size());

		//Task 4: Inside of a print statement, use the .remove(int) method to remove "Cookies" from foods. Comment what it prints.
		//It will print true
		//Method will remove the String from the ArrayList. In this case, it will remove Cookie from the ArrayList and return true.
		System.out.println(foods.remove("Cookies"));
		System.out.println(foods.size());
		
		//Task 5: For each task, go back and comment what the method you are calling does, 
		//and what the method returns (both in general and in this case).
		

	}

}

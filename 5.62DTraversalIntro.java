/**
 * 2D Array Traversal Class
 * @author Kyla
 */
public class TwoDArrTrav {

	public static void main(String[] args) {
		//Task 1: Declare a 2D array of Strings with 7 rows and 6 columns. 
		String [][] names1 = {{"hey", "yay", "bye","nice", "cry", "pie" },
								{"way", "may", "ice","like", "night", "key" },
								{"hey", "yay", "bye","nice", "cry", "pie" },
								{"way", "may", "ice","like", "night", "key" },
								{"hey", "yay", "bye","nice", "cry", "pie" },
								{"way", "may", "ice","like", "night", "key" },
								{"hey", "yay", "bye","nice", "cry", "pie" }};
		
		//Task 2: One by one, print out the first element in each row, from top to bottom. 
		//Task 3: The code from Task 2 looks like it could be done using a loop. 
		//Use a loop to print out each row's first element. 
		for(int i = 0; i<names1.length; i++)
		{
			System.out.println(names1[i][0]);
		}
		
		//Task 4: One by one, print out each element in the first row only, from left to right. 
		//Task 5: Huh, that last task also looks like it could be done using a loop. 
		//Please use a loop to print out each element in the first row. 
		for(int i = 0; i<names1[0].length; i++)
		{
			System.out.println(names1[0][i]);
		}
		
		//Task 6: Copy your code from task 3 and paste it wherever you are doing this task. 
		//Edit it so it prints every element in each row, instead of just the first element. 
		//(Hint: first, make it print the first AND second elements of each row. 
		//Then make it print the first, second, AND the third element of each row. 
		//See a pattern? If you turn this code into a loop, your nested loops will print out every element.) 
		for(int i=0; i<names1.length;i++)
		{
			for(int j=0; j<names1[0].length;j++)
			{
				System.out.print(names1[i][j]);
			}
		}

	}

}

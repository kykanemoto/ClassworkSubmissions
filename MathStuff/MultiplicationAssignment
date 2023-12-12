/**
 * Make a loop that multiplies two numbers
 * but doesn't use an asterisk
 */
package labs;

import java.util.Random;

public class MathStuff 
{

	public static void main(String[] args) 
	{
		int q = 7;
		int r = 2;
		multTwoIntegers(q,r);
		
		int integerSum = multTwoIntegers(q,r);
		System.out.println(integerSum);
		
		//call a method with parameters that are both ints
		multTwoNums(6,7);
	}
	//create a method to multiply the two ints without an asterisk
	//print the product you found and return nothing
	private static void multTwoNums(int x, int y) 
	{
		//initialize a variable
		//z equal to x
		int z = x;
		//create a for loop
		//add x to itself y times
		for(int i=1;i<y;i++)
	{		
			//add x to z 
			x*=z;
	}
			//print x
			System.out.println(x);
			
		//declare two methods to test Math methods on
		int myInt = -4;
		double myDub = -16.0;
		
		//test the sqrt method. it should find the square root.
		double mySqrt = Math.sqrt(myDub);
		System.out.println(mySqrt);
		
		//test the abs method. it should produce what?
		double myAbsNum = Math.abs(myDub);
		System.out.println(myAbsNum);
		
		double myAbsInt = Math.abs(myInt);
		System.out.println(myAbsInt);
		
		//test the pow method. it raises the first number
		//to the power of the second number
		//it only works with doubles
		double base = 2;
		double exp = 5;
		double prod = Math.pow(base, exp);
		System.out.println(prod);
		
		//TASK 1: Instantiate an Integer object
		Integer myInteger = 4;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		//TASK 2: Instantiate a Double object
		Double myDouble = 6.6;
		
		//print our the max and min values a Double object can store
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		//Wrapper Classes (Integer and Double)
		//like primitive data types but made into a class
		
		//TASK 3: Declare an int and print it as a double
		int a = 5;
		System.out.println((double)a);
		
		//TASK 4: Declare a double and print it as a n int
		//this is another example of casting
		double b = 6.2;
		System.out.println((int)b);
		
		
		//TASK 1:Create a method that generates a random number 
		//from 1-10 inclusive
		Random random = new Random();
		//instantiate rand equal to 0
		int rand = 0;
		//create a while loop to keep 1-10 inclusive
		while (true) {
			rand=random.nextInt(11);
			//if rand doesn't equal 0, break it
			if (rand!=0);
			break;
		}
			//print the random number
			System.out.println(rand);
		
		//TASK 2:Declare two ints called intA and intB 
		//that have values of -36 and +12 respectively
		int intA = -36;
		int intB = 12;
		
		//TASK 3:Declare two doubles called dubA and dubB 
		//that have values of -100.0 and 0.64 respectively.
		double dubA = -100.0;
		double dubB = 0.64;
		
		//TASK 4:Instantiate two Integer objects 
		//called integerA and integerB 
		//with the same values as the ints
		Integer integerA = -36;
		Integer integerB = 12;

		//TASK 5:Instantiate two Double objects 
		//called doubleA and doubleB 
		//with the same values as the doubles
		Double doubleA = -100.0;
		Double doubleB = 0.64;

		//You should have a method that raises one number to another
		//Do not change this method

		//TASK 6:Use your method to print out one int 
		//raised to the power of the other int
		expoTwoNums(intA,intB);
		
		//TASK 7:Use your method to print out one Integer
		//raised to the power of the other Integer '
		expoTwoNums(integerA, integerB);	
			
		//TASK 8:Use your method to print out one double 
		//raised to the power of the other double
		expoTwoNums((int)dubA, (int)dubB);
		
		//TASK 9:Use your method to print out one Double
		//raised to the power of the other Double
		expoTwoNums(doubleA.intValue(), doubleB.intValue());
		
		//For the rest of the problems, use the 
		//Math class methods to complete the task

		//TASK 10:Print out the absolute value of 
		//intA, integerA, dubA, and doubleB
		System.out.println(Math.abs(intA));
		System.out.println(Math.abs(integerA));
		System.out.println(Math.abs(dubA));
		System.out.println(Math.abs(doubleB));

		//TASK 11:Print out the square root of dubB and doubleB
		System.out.println(Math.sqrt(dubB));
		System.out.println(Math.sqrt(doubleB));

		//TASK 12:Print out the square root of the 
		//absolute value of intA and integerA
		System.out.println(Math.sqrt((Math.abs(intA))));
		System.out.println(Math.sqrt(Math.abs(integerA)));
		
		//TASK 13:Print out one double raised to the power of the other double
		System.out.println(Math.pow(dubA, dubB));
		
		//TASK 14:Print out one int raised to the power of one of your doubles
		System.out.println(Math.pow(dubB, (double) intA));
		
		//TASK 15:Print out one Double raised to the power of one of your Integers
		System.out.println(Math.pow(doubleA.intValue(), integerA.doubleValue()));
		
		}
		//create a method to multiply the two ints without an asterisk
		//print the product you found and return nothing
		private static void expoTwoNums(int x, int y) 
		{
			//initialize a variable
			//z equal to x
			int z = x;
			//create a for loop
			//add x to itself y times
			for(int i=1;i<y;i++)
		{		
				//add x to z 
				x*=z;
		}
				//print x
				System.out.println(x);
		}
		
		/**
		 * this method takes in two Integer objects and returns their sum
		 * as an int. even though the formal parameters are Integers,
		 * it will turn passed ints into Integers automatically,
		 * this process is called autoboxing
		 * @param a the first additive
		 * @param b the second additive
		 * @return the sum and a and b as an int
		 */
		public static int multTwoIntegers(Integer a, Integer b)
		{
			return a*b;
	}
}

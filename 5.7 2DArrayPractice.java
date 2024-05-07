		//Task 1: Create a method print2DArray() that is passed a 2D String array and will print out each 
		//element in row-major order (instead of column-major order like we did yesterday). 
		String [][]names2 = new String [6][7];
		//traverse the 2D array
		for(int i = 0; i<names2[0].length; i++)
		{
			for(int j = 0; j<names2.length; j++)
			{
				//set the elements of the 2D array to abc
				names2[j][i] = "abc";
				//print the 2D array
				System.out.print(names2[j][i] + " ");
			}
			//print spaces
			System.out.println(" ");
		}

		//declare an array
		double [][]arr = {{}};
		//call a allOnes2D method
		allOnes2D(arr);
	}

	/**
	 * Task 2: Create a method allOnes2D() that is passed a 2D double array, makes an array of the 
	 * same column and row length but all its literals are 0.0 called copyArr, and then changes each 
	 * element inside to 1.0 and returns copyArr. (So it is passed a 2D array and returns a 2D array with all 0.0).
	 * @param arr 
	 */
	private static void allOnes2D(double[][] arr) {
		//declare an array with the same rows and columns
		double [][] copyArr = new double[6][6];
		//for loop to traverse the 2D array
		for(int i = 0; i<copyArr.length;i++)
		{
			for(int j =0; j<copyArr[0].length;j++)
			{
				//set the elements in the 2D array to 1.0
				copyArr[i][j]=1.0;
				//print the 2D array
				System.out.print(copyArr[i][j] + " ");
			}
			//print spaces
			System.out.println(" ");
		}
		
	}

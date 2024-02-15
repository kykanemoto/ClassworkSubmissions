/**
 * Create a Student class that is meant to
 * store the grades of a student.
 * 
 * create three attributes,
 * a constructor,
 * and some methods. We will make a getVolume method
 * that is the only one public
 * 
 * @author Kyla
 */
public class Student {
	//list the properties/data attributes
	private double scienceGrade;
	private double mathGrade;
	private double theologyGrade;
	private int gradeLevel;
	
	//a property that stores the student's name
	String name = new String();
	/**
	 * This constructor lets us make Student objects.
	 * We pass it numbers to be the initial value
	 * for the data attributes.
	 * @param a scienceGrade
	 * @param b mathGrade
	 * @param c theologyGrade
	 * @param d gradeLevel
	 * @param e name
	 */
	public Student (double a, double b, double c, int d, String e)
	{
		scienceGrade = a;
		mathGrade = b;
		theologyGrade = c;
		gradeLevel = d;
		name = e;
	}
	/**
	 * returns the average of all grade values 
	 * (data attributes) aka the average GPA. 
	 * 
	 * @return GPA to get the average GPA
	 */
	public double getGPA()
	{
		double GPA = (scienceGrade + mathGrade
				+ theologyGrade) / 3;
		return GPA;
	}
	/**
	 *  a method that prints 
	 *  "I am a student in grade gradeLevel. 
	 *  My name is name. My average GPA is getGPA()."
	 */
	public void introduceSelf()
	{
		System.out.println("I am a student in grade " +
				gradeLevel + ". My name is " + name +
				". My average GPA is " + getGPA() + ".");
	}

}

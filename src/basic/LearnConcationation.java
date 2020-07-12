package basic;

public class LearnConcationation {
	
	//concat-e-nation
	
	static String firstName = "Maruf";
	static String lastName = "Sanny";
	static String studentId = "1234NY";
	
	static String fullName = firstName + ' ' + lastName;
	
	String stName = "Antor"; 
	
	public static void main (String args[]) {
		
		System.out.println ("My full name is " + fullName + ".");
		
		int num1 = 3;
		int num2 = 5;
		int num3 = 6;
		int sum = num1 + num2 + num3;
		
		System.out.println(sum);
		
		System.out.println(studentId + "_" + firstName);
		
		LearnConcationation obj = new LearnConcationation();
		System.out.println(obj.stName);
		
	}

}

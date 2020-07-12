package basic;

public class LearnDataType {

	
	
	
	// Data Type
    // primative data type 
	
	/**
	 
	 * byte
	 * short
	 * int
	 * long
	 * 
	 * float
	 * double
	 * 
	 * char
	 * 
	 * boolean
	 */
	
	
	boolean isPizzaAvaiable= true;
	boolean isAllowed= false;
	
	char nameStaerWith ='a';
	
	byte number = 30;
	short price = 20;
	int age = 24;
	long annualBudget = 3844845774L;
	
	
	float salary = 5000.5000f;
	double courseFee = 3444.60;
	
	
	
	
	
	//non primative data type 
	
	/**
	 * String 
	 * Object 
	 * Array
	 * 
	 */
	
	
	
	String name = "antor"; 
	
	
	
	public static void main(String args[]) {
		
		LearnDataType obj = new LearnDataType ();
		obj.age = 34;
		System.out.println(obj.age);
		System.out.println(obj.annualBudget);
		System.out.println(obj.name);
	}
	
}

package basic;



public class LearnVariable {
	
	
	//variable
	// left side = right side 
	//variable syntaxt; datatype 
	
	int age = 14; 
	//int means integer 
	//
	static int a = 39;
	
	String name = "akash";
	
	public static void main(String args[]) {
		
		
		//LearnDataType obj = new LearnDataType ();
		LearnVariable obj = new LearnVariable ();
		int c = 36;
		
		System.out.println(c + obj.age);
		System.out.println(LearnVariable.a);
		
		System.out.println(c + obj.age + LearnVariable.a);
		
		System.out.println(a);
		
		obj.name= "Shakib";
				
		System.out.println(obj.name);
		
		
		
		
		
		
		
		
	}

}

package basic;

public class LearnBlock {
	
	{ // block start 
		
	String name = "Arman";
	System.out.println(name);
		
	} // Block end 
	
	//String name = "Arman";
	
	public void display() {
		System.out.println("TV display");
	}
		public void car() {
			System.out.println("My car");
		}
	
	
	public static void main (String args []) {
		
		LearnBlock obj = new LearnBlock();
		//System.out.println(name);
		
		obj.display();
		obj.car();
	}
	

}

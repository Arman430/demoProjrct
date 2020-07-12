package basic;

import basic.pizza.Pizza;

public class LearnObject {
	
	String phoneBrand = "Apple";
	int phonePrice = 1200;
	
	public void phoneDisplay() {
		
		System.out.println("my phone display is 6 inch");
		
	}
	
	public void phoneInfo () {
		System.out.println("phone brand " + phoneBrand+ ' '+"price " + phonePrice );
	}
		
	public static void main (String args []) {
		
		LearnObject obj = new LearnObject();
		
		//System.out.println(obj.phoneBrand);
		obj.phoneInfo();
		obj.phoneBrand= "Samsong";
		
		System.out.println("Phrane brand is " + obj.phoneBrand);
		
		LearnObject myobj = new LearnObject();
		
		Pizza mypizza = new Pizza();
		
		LearnDataType ldt = new LearnDataType();
		
		ldt.age=34;
		System.out.println(ldt.age);
			
		
			
		
	}

}

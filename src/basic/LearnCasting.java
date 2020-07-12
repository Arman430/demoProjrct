package basic;

public class LearnCasting {
	
	public static void main(String args []) {
		double price = 5000.500;
		System.out.println("prive is " + price);
		
		
		int newprice  = (int) price;
		System.out.println("New price is " + newprice);
		
		
		
		int newpricenow = (int) price;
		System.out.println("another prive is " + newpricenow);
	}

}

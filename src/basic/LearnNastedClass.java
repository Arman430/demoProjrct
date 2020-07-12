package basic;

public class LearnNastedClass {
	
	//parent class
	public static void main(String args[]) {
		//car.carPrice=60000;
		
		System.out.println("my car price is "+ car.carPrice);
		car.carPrice=60000;
		System.out.println("new value" + car.carPrice);
		}
	
	public static class car {
		
		static int carPrice = 500000;
		
		
		
	}

}

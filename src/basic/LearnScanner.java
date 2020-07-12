package basic;

import java.util.Scanner;

public class LearnScanner {
	
	public static void main(String args[]) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name = input.nextLine();
		System.out.println("My name is " + name);
		
		System.out.println("Enter your student ID: ");
		int id = input.nextInt();
		System.out.println("My student id is " + id);
		
		System.out.println("is the student here: ");
		boolean isPresent = input.nextBoolean();
		System.out.println("is present  " + isPresent);
		
		System.out.println("Did Arman came to class: ");
		boolean went = input.nextBoolean();
		System.out.println("Arman was in class: " + went);
	}

}

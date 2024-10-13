package userDemo;
import java.util.Scanner;
public class userDemo {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name =scan.nextLine();
		
		System.out.println("Enter Your Native Place: ");
		String place =scan.nextLine();
		
		
		System.out.println("Enter Your Age: ");
		int age =scan.nextInt();
		
		//scan.nextLine();  
		
		System.out.println("Enter Your Floating Number: ");
		float num = scan.nextFloat();
		
		System.out.println("TRUE or FALSE: ");
		boolean letter = scan.nextBoolean();
		
		scan.nextLine();
		
		System.out.println("Enter Your Name Char: ");
		char ch = scan.next().charAt(1);
		
		System.out.println("Your Name is    : "  + name);
		System.out.println("Your Native is  : "  + place);
		System.out.println("Your Age is     : "  + age);
		System.out.println("Floating num for: "  + num);
		System.out.println("enter ur choice : "  + letter);
		System.out.println("Enter a Char    : "  + ch);
	}

}

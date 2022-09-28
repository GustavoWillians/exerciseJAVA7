import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write the number");
		int number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("This numer is negative");
		}
		else {
			System.out.println("This number is positive");
		}
		
	

	} 

}

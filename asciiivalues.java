package asciiiii;

public class asciiivalues {

	public static void main(String[] args) {
		// Displaying ASCII values
		System.out.println("ASCII Value of 'A' is : " + (int) 'A' ); //i am assigning the value and variable directly for simpler way and time saving
		System.out.println("ASCII Value of 'a' is : " + (int) 'a' );
		System.out.println("ASCII Value of '0' is : " + (int) '0' );
		System.out.println("ASCII Value of '@' is : " + (int) '@' );
		
		//1 more way
		
		System.out.println("\n"
				+ "1 more way to perform this"
				+ "\n");
		
		
		int num1 = 'A'; // long way or the traditional way
		int num2 = 'a';
		int num3 = '0';
		int num4 = '@';
		
		// Printing 
		System.out.println("ASCII Value of 'A' is : " + num1 );
		System.out.println("ASCII Value of 'A' is : " + num2 );
		System.out.println("ASCII Value of 'A' is : " + num3 );
		System.out.println("ASCII Value of 'A' is : " + num4 );
	}

}

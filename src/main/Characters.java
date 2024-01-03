package main;

public class Characters {
	
	public static void main(String[] args) {
		
		char character1 = 'A';
		char character2 = '\u0041';//unicode
		char character3 = 65;
		String octalString = Integer.toOctalString('A');
		
		System.out.println("Result 1: " + character1); // Result 1: A
		System.out.printf("Result 2: %c%n", character2);
		System.out.print("Result 3: " + character3 + "\n");
		System.out.println("Result 4: " + octalString);
		System.out.println("Result 5: " + Integer.parseInt(octalString, 8));
		System.out.println("Result 6: " + Integer.toOctalString('\u0041'));
		System.out.println("Result 7: " + (char) 0101);
		System.out.println("Result 8: " + ('\u0041' == 65));
		
		System.out.println(Character.BYTES);
		System.out.println(Character.SIZE);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
	}
	
}

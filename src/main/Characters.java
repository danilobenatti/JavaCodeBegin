package main;

import java.lang.reflect.Array;

import static org.apache.commons.lang3.StringUtils.*;

public class Characters {
	
	public static void main(String[] args) {
		
		char character1 = 'A';
		char character2 = '\u0041';//unicode
		char character3 = 65;
		String octalString = Integer.toOctalString('A');
		
		System.out.println(joinWith(SPACE, "Result 1:", character1)); // Result 1: A
		System.out.printf("Result 2: %c%n", character2);
		System.out.print("Result 3: " + character3 + "\n");
		System.out.println(join(new String[]{"Result 4:", octalString}, SPACE));
		System.out.println("Result 5:\t" + Integer.parseInt(octalString, 8));
		System.out.println(join("Result 6:", SPACE, Integer.toOctalString('\u0041')));
		System.out.println("Result 7:" + '\u0020' + (char) 0101);
		System.out.println("Result 8:" + SPACE + ('\u0041' == 65));
		
		System.out.println(Character.BYTES);
		System.out.println(Character.SIZE);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
	}
	
}

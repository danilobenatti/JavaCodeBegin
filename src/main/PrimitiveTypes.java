package main;

public class PrimitiveTypes {
	
	public static void main(String[] args) {
		
		byte numberByte = 127;
		System.out.println("\nNumberByte = " + numberByte);
		System.out.printf("NumberByte to binary = %s%n", Integer.toBinaryString(numberByte));
		System.out.println("Byte.BYTES = " + Byte.BYTES);
		System.out.println("Byte.SIZE = " + Byte.SIZE);
		System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
		System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
		System.out.println("Byte.toUnsignedInt = " + Byte.toUnsignedInt(numberByte));
		
		short numberShort = 32767;
		System.out.println("\nNumberShort = " + numberShort);
		System.out.printf("NumberShort to binary = %s%n", Integer.toBinaryString(numberShort));
		System.out.println("Short.BYTES = " + Short.BYTES);
		System.out.println("Short.SIZE = " + Short.SIZE);
		System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
		System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
		System.out.println("Short.toUnsignedInt = " + Short.toUnsignedInt(numberShort));
		
		int numberInteger = 2147483647;
		System.out.println("\nNumberInteger = " + numberInteger);
		System.out.printf("NumberInteger to binary = %s%n", Integer.toBinaryString(numberInteger));
		System.out.println("Integer.BYTES = " + Integer.BYTES);
		System.out.println("Integer.SIZE = " + Integer.SIZE);
		System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("Integer.toUnsignedLong = " + Integer.toUnsignedString(numberInteger, 10));
		
		long numberLong = 9223372036854775807L;
		System.out.println("\nNumberLong = " + numberLong);
		System.out.printf("NumberLong to binary = %s%n", Long.toBinaryString(numberLong));
		System.out.println("Long.BYTES = " + Long.BYTES);
		System.out.println("Long.SIZE = " + Long.SIZE);
		System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
		System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
		System.out.println("Long.toUnsignedLong = " + Long.toUnsignedString(numberLong, 10));
		
		float numberFloat = 3.4028235E38F;
		System.out.println("\nNumberFloat = " + numberFloat);
		System.out.printf("NumberFloat to binary = %s%n", Float.floatToIntBits(numberFloat));
		System.out.println("Float.BYTES = " + Float.BYTES);
		System.out.println("Float.SIZE = " + Float.SIZE);
		System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
		System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
		System.out.println("Float.toHexString = " + Float.toHexString(numberFloat));
		
		double numberDouble = 1.7976931348623157E308;
		System.out.println("\nNumberDouble = " + numberDouble);
		System.out.printf("NumberDouble to binary = %s%n", Double.doubleToLongBits(numberDouble));
		System.out.println("Float.BYTES = " + Double.BYTES);
		System.out.println("Float.SIZE = " + Double.SIZE);
		System.out.println("Float.MAX_VALUE = " + Double.MAX_VALUE);
		System.out.println("Float.MIN_VALUE = " + Double.MIN_VALUE);
		System.out.println("Double.toHexString = " + Double.toHexString(numberDouble));
		
	}
}

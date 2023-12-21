package main;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class FloatingPointNumbers {
	static final Locale brLocale = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
	static NumberFormat nfBR = NumberFormat.getNumberInstance(brLocale);
	static NumberFormat nfEN = NumberFormat.getNumberInstance(Locale.of("en", "US"));
	
	public static void main(String[] args) {
		
		nfBR.setMaximumFractionDigits(4);
		nfBR.setMinimumFractionDigits(2);
		nfBR.setRoundingMode(RoundingMode.HALF_EVEN);
		
		float numberFloat = 1.6e4f;
		System.out.printf("%n%s", nfEN.format(numberFloat));
		
		double numberDouble = 1.6e-4;
		System.out.printf("%n%s%n", nfBR.format(numberDouble));
		
		System.out.printf("%n%d", Float.BYTES);//bytes
		System.out.printf("%n%d%n", Float.SIZE);//bits
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.printf("%n%d", Double.BYTES);
		System.out.printf("%n%d%n", Double.SIZE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
	}
}

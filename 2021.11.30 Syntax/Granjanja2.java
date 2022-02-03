package javaBasic;

import java.util.Scanner;

public class Granjanja2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Molim vas unesite sirinu prostoije");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		System.out.println("Molim vas unesite duzinu zida");
		double b = s.nextDouble();
		System.out.println("Molim vas unesite visinu zida");
		double c = s.nextDouble();
		
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("Izracunavanje nije moguce, uneli ste negativan broj, pokusajte ponovo!");
			
		} else {
		
		double p = (a*b) + 2 * (c * b ) + 2 * ( c * a);
		 System.out.println("Povrsina zida je " + p);}
		
	}
}

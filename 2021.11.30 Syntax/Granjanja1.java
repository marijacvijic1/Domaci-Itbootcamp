package javaBasic;

import java.util.Scanner;

public class Granjanja1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Molimo vas unesite broj");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("Broj je paran");
			
		} else {
			System.out.println("Broj je neparan");
		}
	}

}

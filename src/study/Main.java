package study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long fact = 1;
		int n;
		
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	} // end of main
} // end of class

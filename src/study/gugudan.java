package study;

import java.util.Scanner;

public class gugudan {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		
		for(int i = temp; i <= temp; i++) {
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(  i + " * " + j + " = " +  (i*j));
			}
			
		}
		
	}

}

package study;

import java.util.Scanner;

public class factorial {
			
			public static void main(String[] args) {
				
				long fact = 1;
				int num;
				
				System.out.println("정수를 입력하세요");
				Scanner sc = new Scanner(System.in);
				num = sc.nextInt();
				
				for(int i = 1; i <= num; i++)
					fact = fact * i;
				
				System.out.print(fact);
				
				
				
			
				
				
			}
			
}

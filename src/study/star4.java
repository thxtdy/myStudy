package study;

public class star4 {
	
	public static void main(String[] args) {
		
		for(int i  = 0; i <= 6; i++) {
			for(int j = 6; j >= i; j--) {
				if(j == 0) {
					
				}
				System.out.print(" ");
			}
			for(int e = 0; e <= i; e++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}

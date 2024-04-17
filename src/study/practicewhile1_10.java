package study;

public class practicewhile1_10 {
	
	public static void main(String[] args) {
		
		int temp = 0;
		int result = 0;
		boolean flag = true;
		
		while(flag) {
			if(temp <= 10) {
				flag = false;
				
			} // end of if
			
			temp +=2;
            result += temp;
			
			
		} // end of while
		System.out.println(result);
		
		
	}// end of main

}

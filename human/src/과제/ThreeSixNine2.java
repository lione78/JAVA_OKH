package 과제;

public class ThreeSixNine2 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int one = i % 10;			
			int ten = i / 10;			
			boolean one369 = false; 
			boolean ten369 = false;
			
			one369 = (one == 3 || one == 6 || one == 9);
			ten369 = (ten == 3 || ten == 6 || ten == 9);
			
			if(one369 && ten369) {
				System.out.println("**");
			}
			else if(one369 || ten369) {
				System.out.println("*");
			}
			else {
				System.out.println(i);
			}
			
		}
		
	}
}
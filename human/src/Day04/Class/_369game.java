package Day04.Class;

public class _369game {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if( i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.println("*");
			} 
			else if ( i / 10 == 3 || i / 10 == 6 || i / 10 == 9 ) {
				System.out.println("**");
			}
			else {
				System.out.println(i);
			}
			
		}
	}
}

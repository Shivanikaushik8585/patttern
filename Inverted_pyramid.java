package starr;

public class Inverted_pyramid {
	/* inverted half pyramid
	 *           *
	 *          **
	 *         ***  
	 *        ****
	 *       *****   
	 * 
	 */

	public static void pattern(int  n) {
		for(int i=-0;i<=n;i++) {
		
//				for spaces 
				for(int spaces=0;spaces<=n-i;spaces++) {
					System.out.print(" ");
				}
//				for star
				for(int star =0;star<=i;star++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(6);

	}

}

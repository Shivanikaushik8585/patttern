package starr;

public class InvertedStarPattern {
	/*  inverted star pattern:
	 *    ****
	 *    ***
	 *    **
	 *    *
	 * 
	 * 
	 */
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);

	}

}

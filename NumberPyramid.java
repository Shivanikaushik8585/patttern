package starr;

public class NumberPyramid {
	/*  NumberPyramid
	 *         1
	 *       2 2
	 *     3 3 3
	 *   4 4 4 4
	 * 5 5 5 5 5
	 * 
	 */
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(6);
		

	}

}

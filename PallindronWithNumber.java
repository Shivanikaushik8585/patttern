package starr;

public class PallindronWithNumber {
	/*
	 *   PalindronNumber With Number
	 *             1
	 *           2 1 2 
	 *         3 2 1 2 3 
	 *       4 3 2 1 2 3 4
	 *     5 4 3 2 1 2 3 4 5  
	 * 
	 */
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k+" ");
			}
			for(int s=2;s<=i;s++) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(6);

	}

}

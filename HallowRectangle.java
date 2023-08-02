package starr;

public class HallowRectangle {

	/* print Hallow rectangle
	 *     *****
	 *     *   *
	 *     *   *
	 *     *   *
	 *     *   *
	 *     *****
	 */
	public static void pattern(int n) {
		for(int i=0;i<=n;i++) {
			for(int j =0;j<=n;j++) {
				if(i==0 || i==n || j==0 ||j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
		

	}

}

package starr;

public class Butterfly {
	 /*   butterfly
	  *    *        *
	  *    **      **
	  *    ***    ***
	  *    ****  ****
	  *    **********
	  *    **********
	  *    ****  ****
	  *    ***    *** 
	  *    **      ** 
	  *    *        * 
	  */
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
//			for spaces
			for(int sp=1;sp<=2*(n-i);sp++) {
				System.out.print(" ");
				
			}
			for(int st=1;st<=i;st++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
//			for spaces
			for(int sp=1;sp<=2*(n-i);sp++) {
				System.out.print(" ");
				
			}
			for(int st=1;st<=i;st++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(4);

	}

}

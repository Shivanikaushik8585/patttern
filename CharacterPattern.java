package starr;

public class CharacterPattern {
//	* print character pattern
	
	/* A
	 * B C
	 * D E F
	 * G H I J
	 * 
	 * 
	 */

	public static void pattern(int n) {
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i;j++) {
			 System.out.print(ch+" ");
			 ch++;
				
				
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern(5);
	}

}

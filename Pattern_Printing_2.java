package nikhiljava;

public class Pattern_Printing_2 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1) {
					System.out.print("* ");
				}
			}
			System.out.println( );
		}

	}

}

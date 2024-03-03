package nikhiljava;

public class Left_Upper_Hallow_Triangle {
public static void main(String[] args) {
	int n=4;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1||i==4||i==j) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println( );
	}
}
}

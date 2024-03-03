package nikhiljava;

public class Mens_Ipl extends Indian_Premier_league {
		String teams="TOTAL 10 ";
		void fav() {
			System.out.println("CSK");
		}
		public static void main(String[]args) {
			Indian_Premier_league ipl=new Mens_Ipl();
			System.out.println(ipl.BCCI);
			ipl.ipl();
			Mens_Ipl ipl17=( Mens_Ipl)ipl;
			System.out.println(ipl17.BCCI);
			System.out.println(ipl17.teams);
			ipl17.ipl();
			ipl17.fav();
			
			
		}
}

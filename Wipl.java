package nikhiljava;

public class Wipl extends Indian_Premier_league  {

		String teamss="TOTAL 6 ";
		void favv() {
			System.out.println("MI");
		}
		public static void main(String[]args) {
			Indian_Premier_league ipll=new Wipl();
			System.out.println(ipll.BCCI);
			ipll.ipl();
			Wipl ipl2=( Wipl)ipll;
			System.out.println(ipl2.BCCI);
			System.out.println(ipl2.teamss);
			ipl2.ipl();
			ipl2.favv();

	}

}

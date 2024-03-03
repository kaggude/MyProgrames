package nikhiljava;

public class Mi extends Wipl {

		String captain="Harmanpreet ";
		void strong() {
			System.out.println("batting");
		}
		public static void main(String[]args) {
			Indian_Premier_league ipll=new Mi();
			System.out.println(ipll.BCCI);
			ipll.ipl();
			Mi ipl2=( Mi)ipll;
			System.out.println(ipl2.BCCI);
			System.out.println(ipl2.teamss);
			ipl2.ipl();
			ipl2.favv();

	}

}

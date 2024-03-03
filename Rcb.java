package nikhiljava;

public class Rcb extends Mens_Ipl {
	String slogan="E SALA CUP NAMDE ! IN DREAMS ";
	void rcb() {
		System.out.println(" CHANNASWAMI STADIUM IS HOME GROUND OF RCB ! MOST LOYAL FANS ");
	}
	public static void main(String[] args) {
		Mens_Ipl mens=new Rcb();
		System.out.println(mens.BCCI);
		System.out.println(mens.teams);
		mens.ipl();
		mens.fav();
		Rcb ff=(Rcb)mens;
		System.out.println(ff.BCCI);
		System.out.println(ff.teams);
		System.out.println(ff.slogan);
		ff.ipl();
		ff.fav();
		ff.rcb();
		
		
	}

}

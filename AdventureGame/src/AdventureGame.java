import java.util.Scanner;

public class AdventureGame {

	static float h�lsa = 100;
	static int pengar = 10;
	static String f�rnamn = "";
	static String efternamn = "";
	static String spelarnamn = "";
	static int �lder;
	static int str�cka = 0;
	static int posX = 0;
	static int posY = 0;
	
	public static void main(String[] args) {
		
		// presentera spelet
		System.out.println("Ett �ventyrsspel!");
		System.out.println("LYCKA TILL!");
		//L�s in spelarens namn och karakt�rsnamn
		
		//B�rja spelet
		
		String kommando = "";
		System.out.print("Vad ska vi g�ra? ");
		Scanner in = new Scanner(System.in);
		kommando = in.nextLine();
			
		// H�ll p� s� l�nge det magiska ordet INTE �r matat
		while ( !(kommando.equals("Exit!!")))
		{
			if(kommando.equalsIgnoreCase("N")){
				System.out.println("Norr!");
				posY +=1;
			}
			
			if(kommando.equalsIgnoreCase("S")){
				System.out.println("S�der!");
				posY -=1;
			}
			
			if(kommando.equalsIgnoreCase("�")){
				System.out.println("�ster!");
				posX +=1;
				
			}
			
			if(kommando.equalsIgnoreCase("V")){
				System.out.println("V�ster");
				posX -=1;
			}
			h�lsa -=0.1;
			System .out.println("Du �r p�("+posX+","+posY+") och har h�lsan:"+h�lsa);
			
			
			System.out.print("Vad ska vi g�ra? ");
			kommando = in.nextLine();
							
		}
			
		System.out.println("Hejd�����");

	

	}

}

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
	static int snorPengar = "";


	
	public static void main(String[] args) {
		
		// presentera spelet
		System.out.println("Ett �ventyrsspel!");
		System.out.println("LYCKA TILL!");
		//L�s in spelarens namn och karakt�rsnamn
		
		//Spelet b�rjar
		
		String kommando = "";
		System.out.print("Vad ska du g�ra? ");
		Scanner in = new Scanner(System.in);
		kommando = in.nextLine();
		
		static void Npc(){
			if probability() < 90{
				int alntalPengar = probability(10)+1;
				System.out.println("Du m�tte en Npc som gav dig " + antalPengar "guld!");
		}
			else
			{
				int snorPengar = 30 + probability(41);
				pengar = pengar - pengar*((float)snorPengar) /100
				
				
			}
		
		}
			
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
			
			
			System.out.print("Vad ska du g�ra? ");
			kommando = in.nextLine();
							
		}
			
		System.out.println("Goodbye my friend");

	

	}


	}

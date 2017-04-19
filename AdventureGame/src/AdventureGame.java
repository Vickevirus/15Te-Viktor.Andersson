import java.util.Scanner;

public class AdventureGame {

	static float hälsa = 100;
	static int pengar = 10;
	static String förnamn = "";
	static String efternamn = "";
	static String spelarnamn = "";
	static int ålder;
	static int sträcka = 0;
	static int posX = 0;
	static int posY = 0;
	static int snorPengar = "";


	
	public static void main(String[] args) {
		
		// presentera spelet
		System.out.println("Ett Äventyrsspel!");
		System.out.println("LYCKA TILL!");
		//Läs in spelarens namn och karaktärsnamn
		
		//Spelet börjar
		
		String kommando = "";
		System.out.print("Vad ska du göra? ");
		Scanner in = new Scanner(System.in);
		kommando = in.nextLine();
		
		static void Npc(){
			if probability() < 90{
				int alntalPengar = probability(10)+1;
				System.out.println("Du mötte en Npc som gav dig " + antalPengar "guld!");
		}
			else
			{
				int snorPengar = 30 + probability(41);
				pengar = pengar - pengar*((float)snorPengar) /100
				
				
			}
		
		}
			
		// Håll på så långe det magiska ordet INTE är matat
		while ( !(kommando.equals("Exit!!")))
		{
			if(kommando.equalsIgnoreCase("N")){
				System.out.println("Norr!");
				posY +=1;
			}
			
			if(kommando.equalsIgnoreCase("S")){
				System.out.println("Söder!");
				posY -=1;
			}
			
			if(kommando.equalsIgnoreCase("Ö")){
				System.out.println("Öster!");
				posX +=1;
				
			}
			
			if(kommando.equalsIgnoreCase("V")){
				System.out.println("Väster");
				posX -=1;
	
			}
			

			hälsa -=0.1;
			System .out.println("Du är på("+posX+","+posY+") och har hälsan:"+hälsa);
			
			
			System.out.print("Vad ska du göra? ");
			kommando = in.nextLine();
							
		}
			
		System.out.println("Goodbye my friend");

	

	}


	}

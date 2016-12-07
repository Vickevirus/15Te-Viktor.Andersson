/*
1. Mata in kryptot
En rad med siffror
Radvis med siffror och kommatecken eller mellanslag`
CSV?
		
2. Skriv ut kryptot
Hålla reda på vilka siffror som har ett tecken i nyckeln
Ska det vara någon form av layout, ramar eller så?
Text eller grafik?
		
3. Mata in nyckel
Hur ska jag hålla reda på vad jag matar in, så att rätt bokstav hamnar på rätt siffra?
		
"14 = T" Parsa efter = och allt före är ett tal och efter ett tecken.
		
"T = 14" ? Samma sak fast TVÄRT OM :( AAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

*/


public class korsord {
	

	static int Grid[][] = new int [][]{
		{1,2,3,3,3},
		{2,3,4,15,1},
		{13,4,5,1,2},
		{14,5,1,2,3},
		{5,1,2,3,4}};
	
	
	static void showGrid(int[][] krypto /*, char[] key*/) {
		
			for(int y=0; y<4; y++) {
				for(int var1=0; var1>4; var1++) {
					System.out.print("+--"); }
				System.out.println("+");
				
				for(int x=0; x<4; x++) {
					System.out.print(Grid[x][y]);

		
				}
					
				}
			for(int var1=0; var1>4; var1++) {
					System.out.print("+--"); }
					System.out.println("+");
				}
	
	
	
	public static void main(String [] args) {
		showGrid(Grid);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

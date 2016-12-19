import java.util.Scanner;

public class KryptoLite {

static int sizeX, sizeY;


public static void main(String[] args) {
// TODO Auto-generated method stub
	
System.out.println("Skriv in storleken p� ditt korsord!");
	
	// L�s in antal rader i kryptot
	System.out.print("Rader: ");
	Scanner in = new Scanner(System.in);	
	sizeY = in.nextInt();
	System.out.print("Kolumner: ");
	sizeX = in.nextInt();
	// Skapa korsordet
	int[][] korsord = new int[sizeX][sizeY];
	char[] nyckel = new char[30];
	for(int i = 0; i < nyckel.length; i++) {
		nyckel[i] = ' ';
	}

// Stoppa in siffror i korsordet:
	System.out.println("Skriv in en rad med siffror, avsluta med ENTER");
	for (int y=0; y < sizeY; y++){
	for (int x=0; x < sizeX; x++){
	System.out.print("Skriv in siffra p� rad "+y+":"+"plats"+x+":");
	korsord[x][y] = in.nextInt();
	}
	}

	// Skriv ut korsordet
	while(true) {
	System.out.println("Korsordet ser ut s� h�r:");
	for(int y=0; y < sizeY; y++){
		for(int x=0; x < sizeX; x++){
			if (nyckel[korsord[x][y]] != ' '){
				System.out.print(nyckel[korsord[x][y]]+ " ");
	}
			else 
				System.out.print(String.format("%2d",  korsord[x][y]) + " ");
		}
		System.out.println();
	}
	
	//Skriv ut nyckeln med de bokst�ver som �r ifyllda
	for (int i = 0; i<26; i++){
		if (nyckel [i] != ' '){
			System.out.println("Siffra " + Integer.toString(i) + " = "+nyckel[i]);
		}
	}
		System.out.println("Skriv in siffra och bokstav att byta ut den med.");
		int bytut = in.nextInt();
		String bytuttill = in.nextLine();
		nyckel [bytut] = bytuttill.charAt(1);
		
		}
		
	
		
}
}
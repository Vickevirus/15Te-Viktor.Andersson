package palindrom;

import java.util.Scanner;
public class palindrom {

 public static void main(String[] args) {
	 
	 String mening = new String();
	 int antaltecken;
	 
	 System.out.print("Skriv in en mening:  ");
	 Scanner tangentbord = new Scanner(System.in);
	 
	 mening = tangentbord.nextLine();
	 
	 antaltecken = mening.length();
	 System.out.println("Meningen �r "+antaltecken+"tecken l�ng");
	 tangentbord.close();
	 
	 //Vi v�nder p� meningen och skriver ut den
	 
	 for(int plats = antaltecken-1; plats >= 0; plats--)
	 {
		 System.out.print(mening.charAt(plats));
	 }

	 String reversed = new StringBuilder(mening).reverse().toString();
	 
	 System.out.println(" Bakl�nges: "+reversed);
	 
	 reversed = reversed.replaceAll(" ", "");
	 mening = mening.replaceAll(" ", "");
	 	if(mening.equalsIgnoreCase(reversed)) {
		System.out.println("Ett palindrom!");
	 }
	 
	}

}

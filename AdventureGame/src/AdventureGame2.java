
import java.util.Scanner;
 
public class AdventureGame2 {
   
    static float health = 100;
    static int money = 10;
    static String f�rnamn = "";
    static String efternamn = "";
    static String spelarnamn = "";
    static int �lder;
    static int str�cka = 0;
    static int posY = 0;
    static int posX = 0;
 
    public static void main(String[] args) {
 
        //Presentera spelet. Ex. Vilka monster man kan st�ta p�
        System.out.print("An adventure game...");
        System.out.println("Good luck.");
        System.out.println("");
       
        //L�s in spelarens namn och karakt�rsnamn
       
       
        //B�rja spelet
       
        String kommando = "";
        System.out.println("Next move?");
        Scanner in = new Scanner(System.in);
        kommando = in.nextLine();
       
       
        //H�ll p� s� l�nge det magiska ordet inte skrivs
        while ( !(kommando.equals("EXIT")) )
        {
            //Hantera alla olika saker som ska h�nda.
           
           
            //Hantering av riktningar
           
            if(kommando.equalsIgnoreCase("W") ){
                System.out.println("North");
                health -= 0.1;
                posY += 1;
            }
           
            if(kommando.equalsIgnoreCase("S") ){
                System.out.println("South");
                health -= 0.1;
                posY -= 1;
            }
           
            if(kommando.equalsIgnoreCase("D") ){
                System.out.println("East");
                health -= 0.1;
                posX += 1;
            }
           
            if(kommando.equalsIgnoreCase("A") ){
                System.out.println("West");
                health -= 0.1;
                posX -= 1;
            }
           
            System.out.println("You are on("+posX+","+posY+")");
            System.out.println("Health = "+health);
            System.out.println("");
           
            System.out.println("Next move?");  
            kommando = in.nextLine();
           
        }
        System.out.println("Wow.");
    }
 
    static void NPC(){
        if(probability() < 90){
            int antalPengar = probability(10)+1;
            System.out.println("You met an NPC that gave you "+antalPengar+" gold!");
        }
        else{
            int snorPengar = 30 + probability(41);
        }
    }
   
    private static int probability() {
        // TODO Auto-generated method stub
        return 0;
    }
 
    private static int probability(int i) {
        // TODO Auto-generated method stub
        return 0;
    }
 
    static void MONSTER(){
        //30% chance to kill in one hit
        //else, take damage from 1-10
        if (probability() < 70){
            int skada = probability(10)+1;
            health -= skada;
            System.out.println("You killed the monster, but lost "+skada+" health!");
            }
        else {
            System.out.println("You killed the monster without being hit. Impressive.");
        }
    }
 
    static void PIT() {
       
    }
   
    static void MONEY(){
       
    }
   
}
import java.util.Scanner;
public class calculator {
	
	

	    public static void main(String[] args) {
	        double n1, n2;
	        String operation;
	        Scanner scannerObject = new Scanner(System.in);

	        System.out.println("F�rsta numret TACK");
	        n1 = scannerObject. nextDouble();

	        System.out.println("Andra numret TACK");
	        n2 = scannerObject. nextDouble();

	        Scanner op = new Scanner(System.in);
	        System.out.println("Vilket mattematiskt r�knesett vill du anv�nda?");
	        operation = op.next();

	        switch (operation)  {
	        case "+":
	            System.out.println("Ditt nummer �r " + (n1 + n2));
	            break;

	        case "-":
	            System.out.println("Ditt nummer �r " + (n1 - n2));
	            break;

	        case "/":
	            System.out.println("Ditt nummer �r " + (n1 / n2));
	            break;

	        case "*":
	            System.out.println("Ditt nummer �r " + (n1 * n2));
	            break;

	        default:
	            System.out.println("s�d�r f�r du faktiskt inte skriva, d� blir jag ju ledsen :(");

	        }
	    }
}

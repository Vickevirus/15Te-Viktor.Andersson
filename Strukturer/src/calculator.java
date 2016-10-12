import java.util.Scanner;
public class calculator {
	
	

	    public static void main(String[] args) {
	        double n1, n2;
	        String operation;
	        Scanner scannerObject = new Scanner(System.in);

	        System.out.println("Första numret TACK");
	        n1 = scannerObject. nextDouble();

	        System.out.println("Andra numret TACK");
	        n2 = scannerObject. nextDouble();

	        Scanner op = new Scanner(System.in);
	        System.out.println("Vilket mattematiskt räknesett vill du använda?");
	        operation = op.next();

	        switch (operation)  {
	        case "+":
	            System.out.println("Ditt nummer är " + (n1 + n2));
	            break;

	        case "-":
	            System.out.println("Ditt nummer är " + (n1 - n2));
	            break;

	        case "/":
	            System.out.println("Ditt nummer är " + (n1 / n2));
	            break;

	        case "*":
	            System.out.println("Ditt nummer är " + (n1 * n2));
	            break;

	        default:
	            System.out.println("sådär får du faktiskt inte skriva, då blir jag ju ledsen :(");

	        }
	    }
}

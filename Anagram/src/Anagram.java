import java.util.Random;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		StringBuilder remainder = new StringBuilder(sc.nextLine());

		while (remainder.length() > 0) {
			int index = r.nextInt(remainder.length()); // Random plats till en bokstav
			System.out.print(remainder.charAt(index)); // skriver bokstaven som valdes
			remainder.deleteCharAt(index); // tar bort bokstaven s� den inte blir vald igen
		}

		System.out.println();

		sc.close();
	}
}
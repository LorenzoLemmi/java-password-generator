
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome:");
        String name = scan.nextLine();

        System.out.println("Inserisci il tuo cognome:");
        String surname = scan.nextLine();

        System.out.println("Inserisci il tuo colore preferito:");
        String favouriteColor = scan.nextLine();

        System.out.println("Inserisci la tua data di nascita (formato: gg/mm/aaaa):");
        String dateOfBirth = scan.nextLine();
        String[] parts = dateOfBirth.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        int sumDate = day + month + year;

		System.out.println(name + "-" + surname + "-" + favouriteColor + "-" + sumDate);

        scan.close();
    }
}

import java.util.Scanner;

public class job01 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée
        Scanner scanner = new Scanner(System.in);
        
        // Exemple 1: Saisie d'une chaîne de caractères
        System.out.println("Entrez votre nom :");
        String nom = scanner.nextLine();
        System.out.println("Bonjour " + nom + " !");

        // Fermer le scanner
        scanner.close();
    }
}
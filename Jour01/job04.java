import java.util.Scanner;

public class job04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre : ");
        double nombre = scanner.nextDouble();
        double carré = nombre * nombre;
        System.out.println("Le carré de " + nombre + " est : " + carré);
        scanner.close();
    }
}

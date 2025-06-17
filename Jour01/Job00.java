public class VariablesExample {
    public static void main(String[] args) {
        // Déclaration et initialisation des variables
        char monChar = 'A';
        String maString = "Bonjour Java";
        int monInt = 42;
        long monLong = 123456789L;
        float monFloat = 3.14f;
        boolean monBoolean = true;
        
        // Affichage des valeurs stockées
        System.out.println("=== Affichage des variables ===");
        System.out.println("char: " + monChar);
        System.out.println("String: " + maString);
        System.out.println("int: " + monInt);
        System.out.println("long: " + monLong);
        System.out.println("float: " + monFloat);
        System.out.println("boolean: " + monBoolean);
        
        System.out.println("\n=== Test avec int TOTO ===");
        
        // Déclaration de TOTO et tentative de stockage de 3.817
        int TOTO;
        TOTO = (int) 3.817; // Cast nécessaire pour convertir double vers int
        
        System.out.println("Valeur de TOTO après stockage de 3.817: " + TOTO);
        
        // Démonstration de ce qui se passe sans cast (commenté car ne compile pas)
        // TOTO = 3.817; // Erreur de compilation !
    }
}
public class job03 {
    public static void main(String[] args) {
        int[] T = new int[10];
        for (int i = 0; i < 10; i++)
            {T[i] = i;}

        System.out.println("\nContenu du tableau T :");
        for (int i = 0; i < T.length; i++)
            {System.out.println("T[" + i + "] = " + T[i]);}

        System.out.println("\nValeurs spécifiques :");
        System.out.println("T[0] = " + T[0]);
        System.out.println("T[1] = " + T[1]);
        System.out.println("T[5] = " + T[5]);
        System.out.println("T[9] = " + T[9]);
        System.out.println("\nNormalement afficher T[10] devrait renvoyer une erreur puisque que le tableau ne contient que des entiers compris entre 0 et 9\n");
        System.out.println("T[10] = " + T[10]);
    }}
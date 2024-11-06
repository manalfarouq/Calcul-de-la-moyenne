import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Etudiant> etudiants = new ArrayList<>();

        boolean continuer = true;
        while (continuer) {
            System.out.print("\nEntrez le nom et prénom de l'étudiant : ");
            String nom = sc.nextLine();
            Etudiant myEtudiant = new Etudiant(nom);
            System.out.print("\nCombien de notes vous allez entrer ? : ");
            int number = sc.nextInt();
            sc.nextLine(); // Consume newline left-over
            for (int i = 0; i < number; i++) {
                System.out.print("\nEntrez la note : ");
                float note = sc.nextFloat();
                myEtudiant.ajouterNote(note);
            }
            etudiants.add(myEtudiant);
            System.out.print("\nVous voulez ajouter un autre étudiant (oui/non) ? : ");
            String reponse = sc.next();
            if (reponse.equalsIgnoreCase("non")) {
                continuer = false;
            }
            sc.nextLine(); // Consume newline left-over
        }

        System.out.println("\n================================================");
        System.out.println("Les étudiants de la classe : ");
        for (Etudiant etudiant : etudiants) {
            System.out.println("\nNom : " + etudiant.getNom() + " | Moyenne : " + etudiant.moyenne());
        }
        

        sc.close();
    }
}

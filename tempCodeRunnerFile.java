// package Pratique.Java.Calcul de la moyenne;
import java.util.Scanner;
import java.util.ArrayList;

public class tempCodeRunnerFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Etudiant> etudiants = new ArrayList<>(); // Liste pour stocker les étudiants

        boolean continuer = true;
        while(continuer) {
            System.out.print("\nEntrez le nom et prénom de l'étudiant : ");
            String nom = sc.nextLine();
            Etudiant myEtudiant = new Etudiant(nom); // Création d'une nouvelle instance d'Etudiant
            System.out.print("\nCombien de notes vous allez entrer ? : ");
            int number = sc.nextInt();
            sc.nextLine(); // Pour consommer le retour à la ligne après nextInt()
            for(int i = 0; i < number; i++) {
                System.out.print("\nEntrez la note : ");
                float note = sc.nextFloat();
                myEtudiant.ajouterNote(note);
            }
            etudiants.add(myEtudiant); // Ajout de l'étudiant à la liste
            System.out.println("\nVous voulez ajouter un autre étudiant (oui/non) ? : ");
            String reponse = sc.next();
            if(reponse.equalsIgnoreCase("non")) {
                continuer = false;
            }
            sc.nextLine(); // Pour consommer le retour à la ligne après next()
        }
        
        // Affichage des informations de tous les étudiants
        System.out.println("\n================================================");
        System.out.println("Les étudiants de la classe : ");
        for (Etudiant etudiant : etudiants) {
            System.out.println("\nNom : " + etudiant.getNom() + " | Moyenne : " + etudiant.moyenne());
        }

        sc.close();
    }
}

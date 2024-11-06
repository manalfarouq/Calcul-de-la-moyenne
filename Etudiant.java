import java.util.ArrayList;

class Etudiant {
    private String Nom;
    private ArrayList<Float> Notes ;

    public Etudiant(String nom) {
        this.Nom = nom;
        this.Notes = new ArrayList<>(); // ArrayList pour stocker les notes
    }

    public String getNom() {
        return Nom;
    }

    public void ajouterNote(float note) {
        Notes.add(note);
    }

    public float moyenne() {
        float somme = 0;
        int counter = 0;
        for (float note : Notes) {
            somme += note;
            counter++;
        }
        return somme / counter;
    }
    
}
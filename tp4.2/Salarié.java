package tp4;

public class Salarié {
    protected int Martricule;
    protected String Nom;
    protected double Recrutement;

    Salarié(int Martricule, String Nom, double Recrutement) {
        this.Martricule = Martricule;
        this.Nom = Nom;
        this.Recrutement = Recrutement;
    }

    @Override
    public String toString() {
        return " [Martricule=" + Martricule + ", Nom=" + Nom + ", Recrutement=" + Recrutement + "]";
    }

    public void affiche() {
        System.out.println("Caractéristiques du salarié - Nom: " + Nom + ", Matricule: " + Martricule + ", Recrutement: " + Recrutement);
    }

    public double salaire() {
        int salaire;
        if (this.Recrutement < 2005) {
            salaire = 400;
        } else {
            salaire = 280;
        }
        return salaire;
    }
}

package tp4;

public class Entreprise {

    public static void main(String[] args) {
        Salarié[] t = new Salarié[5];
        t[0] = new Employe(12345, "Walid", 2002, 15, 4);
        t[1] = new Vendeure(23445, "Yessine", 2007, 1000, 0.1);
        t[2] = new Vendeure(65478, "Nassime", 2000, 700, 0.1);
        t[3] = new Employe(87698, "Aymen", 2003, 19, 5);
        t[4] = new Employe(54321, "Khaled", 2008, 7, 4);
        
        System.out.println("******************************** Liste des Employés*****************************");
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Employe) {
                t[i].affiche();
            }
        }
        
        System.out.println("******************************** Liste des Vendeurs *****************************");
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Vendeure) {
                t[i].affiche();
            }
        }
        
        double min = t[0].Recrutement;
        String nomAncien = t[0].Nom;
        for (int i1 = 1; i1 < t.length; i1++) {
            if (t[i1].Recrutement < min) {
                min = t[i1].Recrutement;
                nomAncien = t[i1].Nom;
            }
        }
        System.out.println("Le salarié le plus ancien de l'entreprise : " + nomAncien + " recruté en l'an " + min);
        
        System.out.println("******************************** Matricule *****************************");
        double matriculeSalaire = 0;
        double maxSalaire = 0;
        for (int i1 = 0; i1 < t.length; i1++) {
            if (t[i1] instanceof Vendeure) {
                if (t[i1].salaire() > maxSalaire) {
                    maxSalaire = t[i1].salaire();
                    matriculeSalaire = t[i1].Martricule;
                }
            }
        }
        System.out.println("Matricule: " + matriculeSalaire + " Salaire: " + maxSalaire);
    }
}

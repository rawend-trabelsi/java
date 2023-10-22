package td4;

public class Librerie {
    Livre[] liste;
    private int capacite;
    private int nb;


    public Librerie(int capacite) {
        this.capacite = capacite;
        liste = new Livre[capacite];
        nb = 0;
    }

    public int getNb() {
        return nb;
    }

    public void inventaire() {
        for (int i = 0; i < nb; i++) {
            System.out.println(liste[i].toString() + ", Prix=" + liste[i].calculePrix());
        }
    }

    public void inventaire(String categ) {
        for (int i = 0; i < nb; i++) {
            if (liste[i].getClass().getSimpleName()==categ) {
                System.out.println(liste[i].toString() + ", Prix=" + liste[i].calculePrix());
            }
        }
    }

    public void ajoutLiv(Livre liv) {
        if (nb < capacite) {
            liste[nb] = liv;
            nb++;
        } else {
            System.out.println("La librairie est pleine, impossible d'ajouter plus de livres.");
        }
    }

    public void suppLiv(int num) {
        int index = -1;
        for (int i = 0; i < nb; i++) {
            if (liste[i].identifiant == num) {
                index = i;
            }
        }
        if (index != -1) {
            for (int i = index; i < nb - 1; i++) {
                liste[i] = liste[i + 1];
            }
            nb--;
        } else {
            System.out.println("Livre avec l'identifiant " + num + " non trouvé dans la librairie.");
        }
    }
}

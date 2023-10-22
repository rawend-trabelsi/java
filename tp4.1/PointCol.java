package tp41;

public class PointCol extends Point {
    private String couleur;

    PointCol(char nom, int abs, int ord, String couleur) {
        super(nom, abs, ord);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void modifierCouleur(String nouvelleCouleur) {
        this.couleur = nouvelleCouleur;
    }
    
    public void afficher(){
		 super.affichier();
	        System.out.println("Couleur: " + couleur);
	    
}}
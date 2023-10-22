package td4;

public class Roman extends Livre {
	private String auteur;
	 private String editeur;
	 Roman(String titre, int identifiant, String domaine, int nb_pages,String auteur, String editeur) {
		super(titre, identifiant, domaine, nb_pages);
	
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	@Override
	public String toString() {
		super.toString();
		return "Roman [auteur=" + auteur + ", editeur=" + editeur + "]";
	}
	@Override
	 public double calculePrix() {
		super.calculePrix();
	        return (0.05 * nb_pages) * (1 + TVA);
	    }
	

}

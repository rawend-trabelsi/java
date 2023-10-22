package td4;


public class Livre {
	protected String titre;
	protected int identifiant;
	protected String domaine;
	protected int nb_pages;
	protected final double TVA=10/100;
	Livre(String titre,int identifiant,String domaine,int nb_pages)
	{
		this.titre=titre;
		this.identifiant=identifiant;
		this.domaine=domaine;
		this.nb_pages=nb_pages;
		
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", identifiant=" + identifiant + ", domaine=" + domaine + ", nb_pages="
				+ nb_pages + ", TVA=" + TVA + "]";
	}
	 public double calculePrix() {
	        return (0.075 * nb_pages) * (1 + TVA);
	    }
}


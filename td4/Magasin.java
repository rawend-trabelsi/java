package td4;

public class Magasin extends Livre{
	private int moisParution;
Magasin(String titre, int identifiant, String domaine, int nb_pages,int moisParution) {
		super(titre, identifiant, domaine, nb_pages);
		this.moisParution = moisParution;
	}


public double calculePrix(int bonus) {
    return (0.35 * nb_pages) * (1 + TVA) + bonus;
}



@Override
public String toString() {
	super.toString();
	return "Magasin [moisParution=" + moisParution + "]";
}



}

package tp4;

public class Vendeure extends Salarié{
	private double vente;
	private double pourcentage;
	Vendeure(int Martricule, String Nom, double Recrutement,double vente,double pourcentage) {
		super(Martricule, Nom, Recrutement);
		this.vente=vente;
		this.pourcentage=pourcentage;
		
	}
	@Override
	public  String toString()
	{
		return this.getClass().getSimpleName()+" "+ super.toString()+"vente :"+vente+"pourcentage:"+pourcentage;
	}
	@Override
	public void affiche() 
	{
		System.out.println(toString());
		
	}
	@Override
	public double salaire ()
	{
		double salaire=0;
		super.salaire();
		return salaire+vente*pourcentage;
		
	}
	public double getVente() {
		return vente;
	}
	public void setVente(double vente) {
		this.vente = vente;
	}
	public double getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}
	

}

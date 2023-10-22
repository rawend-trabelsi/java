package tp4;

public class Employe extends Salarié{
	private double Hsupp;
	private double PHsupp;

	Employe(int Martricule, String Nom, double Recrutement, double Hsupp, double PHsupp) {
		super(Martricule, Nom, Recrutement);
		this.Hsupp=Hsupp;
		this.PHsupp= PHsupp;
		
	}
	@Override
	public  String toString()
	{
		return this.getClass().getSimpleName()+" "+ super.toString()+"l'heure supp"+Hsupp+"prix d'heure:"+PHsupp;
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
		return salaire+Hsupp*PHsupp;
		
	}

	public double getHsupp() {
		return Hsupp;
	}
	public double getPHsupp() {
		return PHsupp;
	}

	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}

	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}
	
}

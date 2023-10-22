package td4;

public class Main {

	

	private static double montantTotalRomans;

	public static void main(String[] args) {
		Librerie Librerie =new Librerie(4);
		Livre l1 = new Livre("l1",100,"sciences",100);
		Roman R1=new Roman("riwaya", 711,"horor",100,"Maiaa", "ty");
		Magasin M1 =new Magasin("celebrities", 200, "romance", 78,1400);
		
		Librerie.ajoutLiv(R1);
		Librerie.ajoutLiv(l1);
		Librerie.ajoutLiv(M1);
		System.out.println("****************Inventaire de la librairie****************** :");
		Librerie.inventaire();
		
		Roman R2=new Roman("ronda", 711,"sciences",1070,"Mayaa", "tly");
		Librerie.ajoutLiv(R2);
		Librerie.inventaire("sciences");
		Librerie.inventaire();
		 montantTotalRomans = 0;
	        for (int i = 0; i < Librerie.getNb(); i++) {
	            Livre livre = Librerie.liste[i];
	            if (livre instanceof Roman) {
	                montantTotalRomans += livre.calculePrix();
	                System.out.println("montant totales des romans"+montantTotalRomans);
	            }
	        }
	       
		

		
		
		
	}

}

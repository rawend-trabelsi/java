package isetdsiannimalerie;

public class Chien extends Animal {
    String race;

    Chien() {
    }

    Chien(String couleur, int poids, String race) {
        super(couleur, poids);  
        this.race = race;
    }
    @Override
	public
    void boire()
    {
    	super.boire();
    }
    public
    void manger()
    {
    	super.manger();
    }
    
    public void crier()
    {
    	super.crier();
    }
}


package isetdsiannimalerie;

public class Chat extends Animal {
	boolean sauvage;
	Chat()
	{
		
	}
	Chat(String couleur,int poids,boolean sauvage)
	{
	super(couleur,poids);
	this.sauvage=false;
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

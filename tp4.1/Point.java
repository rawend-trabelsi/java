package tp41;

	public class Point {
		protected char nom;
		protected int abs;
		protected int ord;
		
		void affichier()
		{
			System.out.println(nom+"("+abs+","+ord+")");

		}
		Point()
		{
			nom='o';
			abs=5;
			ord=10;
		}

		Point(Point P)
		{
			nom=P.nom;
			abs=P.abs;
			ord=P.ord;
			
		}

	  Point(char nom,int abs,int ord)
	  {
		    this.nom=nom;
			this.abs=abs;
			this.ord=ord;

	  }


		
		void deplacer(int x,int y)
		{
			abs+=x;
			ord+=y;
		}
		void reset(int x,int y)
		{
			abs-=x;
			ord-=y;
		}
	    @Override public String toString()
		{
			return nom+"("+abs+","+ord+")";
		}
	    
	    boolean coincide_V1(Point p) {
	    	
	    	return this.abs==p.abs && this.ord==p.ord;
	    		
	    	
	    }
	       static boolean coincide_V2(Point p1,Point p2) {
	    	
	    	return ((p1.abs==p2.abs) && (p1.ord==p2.ord));
	    		
	    	
	    }



}



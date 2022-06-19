package exercice3;
import java.lang.Character;
public class Chaine {
	private String ch ;
	public Chaine(String ch1) {
		this.ch=ch1;
	}
	public int longueur() {
		return ch.length();
	}
    public void affiche() {
    	for (int i=0;i<ch.length();i++) {
    	System.out.print(ch.charAt(i));
    	System.out.print('\n');
    	}
    	
    }
    public void affiche2() {
    	System.out.println(this.ch);
    }
	public boolean appartient(char x ) {
		boolean y=false;
		for (int i=0;i<ch.length();i++) {
			if (ch.charAt(i) == x ) {
				y=true;
			}
	}
	return y;
	
	}
	public int nbChiffres() {
	int nb =0;
		for (int i=0;i<ch.length();i++) {
			char c=ch.charAt(i);
		
			if (Character.isDigit(c)==true ) {
				nb=nb+1;
			}
		
	}
	return nb;



}
	public int nbLettres() {
		int nb =0;
			for (int i=0;i<ch.length();i++) {
				char c=ch.charAt(i);
			
				if (Character.isLetter(c)==true ) {
					nb=nb+1;
				}
			
		}
		return nb;

}
	public int nbAutres() {
		int nb =0;
		for (int i=0;i<ch.length();i++) {
			char c=ch.charAt(i);
			if (Character.isLetter(c)==false && Character.isDigit(c)==false ) {
				nb =nb+1;
			}
	}
	return nb;
}
	public boolean estEgale(Chaine S2) {
		boolean y=false;
		if (this.ch.compareTo(S2.ch)==0 ) {
			y=true;
		}
		return y ;
	}
	public boolean estPalind() {
		boolean y=false ; 
		int i=0,j=ch.length()-1;
		while(i<j&&ch.charAt(i)==ch.charAt(j)) {
		
			i=i+1;
			j=j-1;
		}
		if (i>=j) {
			y=true;
		}
		return y;
		
	}
	public boolean estInverse(Chaine S2) {
		boolean y=false;
		int j=S2.ch.length()-1;
		int i =0;
		for (int k=0;k<this.ch.length()-1;k++) {
			if (this.ch.charAt(i)==S2.ch.charAt(j)) {
			  i++;
			  j--;
			}
			 
		}
		if ( i == this.ch.length()-1 ) {
			y=true;
		}
		return y;
		}
	public String inverse() {
		String S=new String ("");
		int i=this.ch.length()-1;

		for (int k=0;k<this.ch.length();k++) {
			
			S=S+this.ch.charAt(i);
			i--;
		
			
		}
		return S;
		
		
	}
		
		
		
		
		
	}
















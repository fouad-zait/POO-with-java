package boite.mail;
import java.util.Scanner;
public class AdrMail {
    private String pseudo;
    private String site;
    private String mot_de_passe;
    public  AdrMail(String ps,String s,String  mdp) {
    	this.pseudo=ps;
    	this.mot_de_passe=mdp;
    	this.site=s;
    }
    public String get_pseudo() {
    	return(pseudo);
    }
    public String get_mdp() {
    	return(mot_de_passe);
    }
    public String get_site() {
    	return (site);
    }
    public void set_pseudo(String s) {
    	pseudo=s;
    }
    public void set_mdp(String s) {
    	mot_de_passe=s;
    }
       public void set_site(String s ) {
    	   site=s;
       }
    
    public AdrMail() {}
     public boolean pseudovalide() {
    	 int i=1;
         int j=0;
		if ((Character.isLetter( get_pseudo().charAt(0))==true)) {
			 for (i=1;i< get_pseudo().length();i++) {
				 if(((Character.isLetterOrDigit( get_pseudo().charAt(i))==true))||( get_pseudo().charAt(i)=='-')||( get_pseudo().charAt(i)=='_')||( get_pseudo().charAt(i)=='.')){
	           j++;	
			 }}}
			 if (j== get_pseudo().length()-1) 
				 return true;
			 else return false ;
		}
     
     
     public boolean mdpvalide() {
    	 int i=0,j=0,k=0,s=0;
    	 if (get_mdp().length()>=8) {
    		 for(i=0;i<get_mdp().length();i++) {
    			 if (Character.isLetter(get_mdp().charAt(i))==true ) {
    				 j++;
    			 }
    			 if (Character.isDigit(get_mdp().charAt(i))==true) {
    				 k++;
    			 }
    			 else s++;
    			 
    		 }}
    	 if (s>=1&&k>=1&&j>1) {
    		 return true;
    	 }
    	 else return false;
     }
   public String toString() {
	   return ("adresse mail: "+get_pseudo()+'@'+get_site()+"\n"+"mot de passe: "+get_mdp());
   }
   public String affiche_adr() {
	   return ("adresse mail: "+get_pseudo()+'@'+get_site());
	   
   }
   
   
   
    public boolean equals (Object o) {
    	if(this==o) {return true ;}
    	if (o==null) {return false;}
    	if(this.getClass()!=o.getClass()) {return false;}
    	AdrMail a= (AdrMail)o;
    	if((this.get_pseudo().equals(a.get_pseudo()))&&(this.get_site().equals(a.get_site())) ){
        return true;
    }
    	else { return false;
     }}
    public void saisir() {
    	Scanner e =new Scanner(System.in);
    	System.out.println("donner le pseudo et le site ");
    	set_pseudo(e.nextLine());
    	set_site(e.nextLine());
    	while(pseudovalide()==false) {
    		System.out.println("pseudo non valide saisisez un pseudo valide");
    		set_pseudo(e.nextLine());
    	}
    	System.out.println("donner le mot de passe");
    	set_mdp(e.nextLine());
    	while(mdpvalide()==false) {
    		System.out.println("mot de passe non valide saisissez un mot de passe valide ");
    		set_mdp(e.nextLine());
    	}
    
    	
    }
    
    public void saisir_pseudo_site() {
    	Scanner e =new Scanner(System.in);
    	System.out.println("donner le pseudo et le site ");
    	set_pseudo(e.nextLine());
    	set_site(e.nextLine());
    	while(this.pseudovalide()==false) {
    		System.out.println("pseudo non valide saisisez un pseudo valide");
    		set_pseudo(e.nextLine());
    	} }
    public void modif_mot_de_passe() {
    	
    	Scanner e =new Scanner(System.in);
    		System.out.println("Saisissez votre ancien mot de passe ");
    		set_mdp(e.nextLine());
    		while(this.mdpvalide()==false) {
        		System.out.println("mot de passe non valide ressaisissez  ");
        		set_mdp(e.nextLine());
        	}
    		System.out.println("le mot de passe a ete modifié");
    }
    
    
 public void modif_pseudo() {
    	Scanner e =new Scanner(System.in);
    		System.out.println("saisissez le nouveau pseudo");
    		while(this.pseudovalide()==false) {
        		System.out.println("pseudo non valide ressaisissez  ");
        		set_pseudo(e.nextLine());
        	}
    		System.out.println("le pseudo a ete modifié");
    }
 
 

   
}








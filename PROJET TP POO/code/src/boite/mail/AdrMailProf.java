package boite.mail;
import java.util.Scanner;
public class AdrMailProf extends AdrMail{
	private String nom_entreprise;
	private String domaine_activite;
	public AdrMailProf(String pseudo,String site,String mdp,String nom_entreprise,String domaine_activite) {
		super(pseudo,site,mdp);
		this.nom_entreprise=nom_entreprise;
		this.domaine_activite=domaine_activite;
	}
	public AdrMailProf() {}
	public String toString() {
		return(super.toString()+"\n " +"nom de l'entreprise: "+get_nom_entreprise()+"\n"+"domaine d'activité: "+get_domaine_dactivite());
	}
	public void saisir() {
		super.saisir();
		Scanner e=new Scanner(System.in);
		System.out.println("donner le nom de l'entreprise suivi du domaine d'activité");
		set_nom_entreprise(e.nextLine());
		set_domaine_dactivite(e.nextLine());
	}
	public boolean equals (Object o) {
    	if(this==o) {return true ;}
    	if (o==null) {return false;}
    	if(this.getClass()!=o.getClass()) {return false;}
    	AdrMailProf a= (AdrMailProf)o;
    	if(super.equals(a)==true && get_nom_entreprise().equals(a.get_nom_entreprise())&&get_domaine_dactivite().equals(a.get_domaine_dactivite())){
        return true;
    }
    	else { return false;
     }}
	 public String get_nom_entreprise() {
	    	return (nom_entreprise);
	    }
	    public void set_nom_entreprise(String s) {
	    	nom_entreprise=s;
	    }
	    public String get_domaine_dactivite() {
	    	return (domaine_activite);
	    }
	    public void set_domaine_dactivite(String s) {
	    	domaine_activite=s;
	    }
	    
	    
	    

}

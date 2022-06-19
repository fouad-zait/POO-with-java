package boite.mail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class BoiteMail {
	private AdrMail ad;
	private ArrayList<Message >   re�us;
	private  ArrayList<Message > envoy�s;
	private  ArrayList<Message > brouillons;
	private ArrayList<Message > archives;
	private ArrayList<Message > corbeille;
	private ArrayList<Message > spam;
	
	private final long stockageMAX=2000;
     private ArrayList<Message > lu ;
    private  ArrayList<Message > nonlu;
  
	public BoiteMail() {}
	public BoiteMail(AdrMail ad ) {
		
		this.ad =ad ;
		this.re�us=new ArrayList<Message >();
		this.envoy�s=new ArrayList<Message >();
		this.brouillons=new ArrayList<Message >();
		this.archives=new ArrayList<Message >();
		this.corbeille=new ArrayList<Message >();
		this.spam=new ArrayList<Message >();
		this.lu=new ArrayList<Message >();
		this.nonlu=new ArrayList<Message >();
		
		
	}
	public AdrMail getAd() {
		return ad;
	}
	public void setAd(AdrMail ad) {
		this.ad = ad;
	}
	
	
	
	
	public ArrayList<Message > getRe�us() {
		return re�us;
	}
	
	public ArrayList<Message > getEnvoy�s() {
		return envoy�s;
	}
	
	public ArrayList<Message > getBrouillons() {
		return brouillons;
	}
	
	public ArrayList<Message > getArchives() {
		return archives;
	}
	
	public ArrayList<Message > getCorbeille() {
		return corbeille;
	}
	
	public ArrayList<Message > getSpam() {
		return spam;
	}

	public void setRe�us(Message m) {
		this.re�us.add(m);
	}
	public void setEnvoy�(Message Envoy�) {
		this.envoy�s.add(Envoy�);
	}
	public void setBrouillons(Message brouillons) {
		this.brouillons.add(brouillons);
	}
	public void setArchives(Message archives) {
		this.archives.add(archives);}
	public void setCorbeille(Message corbeille) {
		this.corbeille.add(corbeille);
	}
	public void setSpam(Message Spam) {
		this.spam.add(Spam);
	}
	public long getStockageMAX() {
		return stockageMAX;
	}
	public void envoi_msg(Message m,AdrMail a ) throws Exception {
		System.out.println("� combien de personnes souhaitez vous envoyez votre message saisissez un nombre ");
		Scanner e=new Scanner(System.in);
		int j = e.nextInt();
		for (int i=0 ;i<j;i++) {
			a. saisir_pseudo_site();
			if(a.pseudovalide()==false) throw new Exception("adresse de destinataire est incorrecte");	
		}
		m.saisir();
		if(m.getContenu().equals("")) throw new Exception("le message est vide");
		m.setEtat_msg(�tat.envoy�);
		this.setEnvoy�(m);
	}
	public void recevoir(Message m) {
		
		m.afficheTitre();
		m.setEtat_msg(�tat.re�u);
		�tat.reculu(false);
		nonlu.add(m);
		
		System.out.println("souhaitez vous l'ouvrir tapez oui ou non ");
		Scanner e=new Scanner(System.in);
		           String k=e.nextLine();
		if (k.equals("oui")) {
	    	afficher_msg(m);
	    	nonlu.remove(m);
	    	lu.add(m);
	    	�tat.reculu(true);
		}
		this.setRe�us(m);
	}
	public void afficher_msg(Message m) {
		System.out.println(m.toString());
	}
	public void supprim_msg(Message m) {
		
		if (this.envoy�s.contains(m)||this.re�us.contains(m)) {
			this.setCorbeille(m);
		}}
	 public void supprim_corbeille(Message m) {
		 this.corbeille.remove(m);
	 }
	 public void deplacer_spam_recus(Message m) {
		this.setRe�us(m);
		this.spam.remove(m);
		 }
	 public void archiver_msg (Message m) {
	  this.setArchives(m);
	}
	 public void cree_msg_(AdrMail a) throws Exception {
		 Message  p=new Message ();
		    p=creation_msg.creation();
		 this.setBrouillons(p);
		 this.envoi_msg(p,a);
		 this.brouillons.remove(p);
		  }
	 public int nb_recu_lu() {	 
	return(lu.size());
	 }
	 public int nb_recu_non_lu() {	 
			return(nonlu.size());
			 }
	 public int nb_msg_envoy�() {
		 return(envoy�s.size());
                  }
	 public int nb_archive() {	 
          			return(archives.size());
          			 }
	 public int nb_corbeille() {	 
			return(corbeille.size());
			 }
	 public int nb_spam() {	 
			return(spam.size());
			 }
	 public long stockage_array(ArrayList L) {
		 
		 long nb=0;
		 for(int i=0;i<L.size();i++) {
			 if(L.get(i) instanceof MessageAttach==false ) {
				 nb=nb+((Message) L.get(i)).getTaillemsg();
			 }
			 else if(this.re�us.get(i) instanceof MessageAttach ==true) {
				nb=((MessageAttach)L.get(i)).taille_msg()+nb;
			 }
		 } return nb ;}
	 public long espace_stockage() {
		 long nb=stockage_array(re�us)+stockage_array(envoy�s)+stockage_array(brouillons)+stockage_array(archives)+stockage_array(corbeille)+stockage_array(spam);
		if(nb==(this.stockageMAX*80)/100) {
			System.err.println("ATTENTION ,votre espace de stockage atteint 80% de la capacit� de stockage de la boite.");
}
		 return nb;
		 
	 }
	 public long stockage_restant() {
		 long nb=getStockageMAX() -espace_stockage();
		 return nb;
	 }
	 
	public void affiche() {
		
	System.out.println(	getAd().toString());
	System.out.println("dossier re�u");
	System.out.println(getRe�us().toString());
	System.out.println("dossier envoy�s ");
	System.out.println(getEnvoy�s().toString());
	System.out.println("dossier brouillons");
	System.out.println(getBrouillons().toString());
	System.out.println("dossier archives");
	System.out.println(getArchives().toString());
	System.out.println("dossier corbeille");
	System.out.println(getCorbeille().toString());
	System.out.println("dossier spam");
	System.out.println(getSpam().toString());
	}
	 
	
	
	
	 
	 
	 
	 
}
	
	
	


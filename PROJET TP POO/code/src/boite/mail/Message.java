package boite.mail;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public  class Message {
	private String titre;
	private String contenu;
	private Date date_de_creation;
	private état etat_msg; 
	private long taille_msg;
	public Message(){
	}
	public Message(String titre,String contenu,Date date_de_creation,état etat_msg,long taille) {
		this.titre=titre;
		this.contenu=contenu;
		this.date_de_creation=date_de_creation;
		this.etat_msg=etat_msg;
		this.taille_msg=taille;}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getDate_de_creation() {
		return date_de_creation;
	}
	public void setDate_de_creation(Date d) {
         date_de_creation=d;
	}
	public état getEtat_msg() {
		return etat_msg;
	}
	public void setEtat_msg(état etat_msg) {
		this.etat_msg = etat_msg;
	}
	

	
	public long getTaillemsg() {
		return taille_msg;
	}
	public void setTaillemsg(long taille) {
		this.taille_msg = taille;
	}
	public String affichedate() {
		 
		 return(this.getDate_de_creation().getYear()+"/"+this.getDate_de_creation().getMonth()+"/"+this.getDate_de_creation().getDate() +"  "+this.getDate_de_creation().getHours());
	}
	public String toString() {
		return("titre: "+getTitre()+"\n"+"contenu:"+getContenu()+"\n"+"Date et heure de creation: "+this.affichedate()+"H"+"\n"+ "état: "+getEtat_msg()+"\n"+"taille: "+getTaillemsg()+"MO"+"\n");
	}
	 public boolean equals (Object o) {
	    	if(this==o) {return true ;}
	    	if (o==null) {return false;}
	    	if(this.getClass()!=o.getClass()) {return false;}
	    	Message a=(Message)o;
	    	if (this.getTitre().equals(a.getTitre())  && this.getContenu().equals(a.getContenu()) && this.getDate_de_creation().compareTo(a.getDate_de_creation())==0 && this.getEtat_msg().equals(a.getEtat_msg()) && this.getTaillemsg()==a.getTaillemsg()   )  {                                        
	        return true;
	        }
	    	else { return false;
	     }}
	 public String creedatesys()//creation du format pour  la saisie //
	 {
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		String dt  = sdf.format(new Date());
		return(dt);
}
	 public void saisir() {
		 Scanner e =new Scanner (System.in);
		 System.out.println("donner le titre de votre message");
		       setTitre(e.nextLine());
		       System.out.println("donner le contenu de votre message");
		       setContenu(e.nextLine());
		       Date d =new Date ();
	            d.setYear(d.getYear()+1900);//lors de la saisie la date recoit la date systeme du jour meme//
	            d.setMonth(d.getMonth()+1);
	            d.setDate(d.getDate());
		     setDate_de_creation(d);
		     
		     setEtat_msg(état.crée);
		     setTaillemsg(this.getContenu().length()+1);
		 }
	  public void modifcontenu() {
		 Scanner e=new Scanner(System.in);
		 setContenu(e.nextLine());
		 }
	  public void afficheTitre() {
		 System.out.println(getTitre());
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
}


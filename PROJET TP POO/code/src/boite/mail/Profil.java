package boite.mail;

import java.util.Scanner;

public class Profil  {
	  private   AdrMail adr;
      private String nom;
      private String prenom;
      private String genre;
      private int age;
      private long numero_tel;
      private String pays_de_residence;
       public AdrMail getAdr() {
		return adr;
	}
	public void setAdr(AdrMail adr) {
		this.adr = adr;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getNumero_tel() {
		return numero_tel;
	}
	public void setNumero_tel(long numero_tel) {
		this.numero_tel = numero_tel;
	}
	public String getPays_de_residence() {
		return pays_de_residence;
	}
	public void setPays_de_residence(String pays_de_residence) {
		this.pays_de_residence = pays_de_residence;
	}
	public Profil() {}
	
       public Profil(AdrMail adr,String nom, String prenom, String genre, int age,long numero_tel, String pays_de_residence) {
       this.adr=adr;
       this.nom=nom;
       this.prenom=prenom;
       this.genre=genre;
       this.age=age;
       this.numero_tel=numero_tel;
       this.pays_de_residence=pays_de_residence;
       }
    public String toString() {
    	return ("nom: "+getNom()+"\n "+"prenom: "+getPrenom()+"\n "+adr.toString()+"\n "+"genre: "+getGenre()+"\n"+"age: "+getAge()+"\n "+"numero telephone: "+getNumero_tel()+"\n "+"pays de residence: "+ getPays_de_residence()   );
    }
  public void saisir(AdrMail m)
  {  Scanner e=new Scanner(System.in);
  setAdr(m);
     System.out.println("donner votre nom , prenom ,genre(masculin ou feminin),age,numero de telephone et pays de residence ");
     setNom(e.nextLine());
     setPrenom(e.nextLine());
     setGenre(e.nextLine());
     setAge(e.nextInt());
     setNumero_tel(e.nextLong());
     setPays_de_residence(e.nextLine()); 
     setPays_de_residence(e.nextLine()); 
}
  public boolean equals (Object j) {
	  if(this==j) {return true ;}
  	if (j==null) {return false;}
  	if(this.getClass()!=j.getClass()) {return false;}
  	Profil o= (Profil)j;
  		if(getAdr().equals(o.getAdr()) && getNom().equals(o.getNom())&& getPrenom().equals(o.getPrenom())&& getGenre().equals(o.getGenre())&&getAge()==o.getAge() && getNumero_tel()==o.getNumero_tel() && getPays_de_residence()==o.getPays_de_residence()){
      return true;
  }
  	else { return false;
   }}

}
       

package boite.mail;
import java.util.Scanner;
public  class  PièceJointe {
     private String nom;
      private long taille;
      public PièceJointe(String nom,long taille) {
    	  this.nom=nom;
    	  this.taille=taille;
      }
     public PièceJointe() {}
	 public  String getNom() {
		return nom;
	}
	public  void setNom(String nom) {
		this.nom = nom;
	}
	public long getTaille() {
		return taille;
	}
	public void setTaille(long taille) {
		this.taille = taille;
	}}
   
      
      


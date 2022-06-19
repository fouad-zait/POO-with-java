package boite.mail;

import java.util.Scanner;

public class MessageAttach extends Message{
	PièceJointe p;
   public  MessageAttach(PièceJointe p) {
	   super();
    	this.p=p;
    }
   public MessageAttach() {}
 
     public  void  saisir() {
    	 super.saisir();
   	   System.out.println("donner le nom de la piece jointe ");
   	   Scanner e=new Scanner (System.in);
   	   p.setNom(e.nextLine());
   	   System.out.println("donner la taille du fichier a envoyer en octets");
   	  p.setTaille(e.nextLong());
   	   
      }
     public  String  toString() {
   	  return(super.toString()+"nom de la piéce jointe : "+p.getNom()+"\n"+"taille de la piéce jointe  : "+p.getTaille()+" OCTETS");
     }
     public  boolean equals(Object o) {
    		if(this==o) {return true ;}
        	if (o==null) {return false;}
        	if(this.getClass()!=o.getClass()) {return false;}
        	MessageAttach a= (MessageAttach)o;
    	 
   	  if (super.equals(o)==true&& p.getNom().equals(a.p.getNom()) && a.p.getTaille()==a.p.getTaille() )
   	   return true;
   	  else return false;
     }
     public long taille_msg() {
    	return super.getTaillemsg()+p.getTaille();
     }
}
   
   

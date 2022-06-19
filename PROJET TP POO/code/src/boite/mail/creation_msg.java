package boite.mail;

import java.util.Scanner;

public class creation_msg {
	
	 public  static Message creation() throws Exception    {
    	 System.out.println("souhaitez vous creer un message avec ou sans attachement entrez oui ou non ");
    	 Scanner e=new Scanner(System.in);
    	 String k=e.nextLine();
    	
    	 if (k.equals("oui") ) {
    	try {
    	PièceJointe p =new PièceJointe(); 
			MessageAttach m=new MessageAttach(p);
         	m.saisir();
         	if(p.getTaille()>10) throw new Exception("la taille de la piece jointe est  plus grande que 10");
         	else {	
        
 	  System.out.println("souhaitez vous modifier votre message entrez oui ou non ");
  	        String t=e.nextLine();
  	      if (t.equals("oui")) {
  		System.out.println("entrez le nouveau contenu ");
  	 m.modifcontenu();
  	 
  	return m;
  	
  	 }}}catch(Exception n) {
  		 System.err.println("vous essayez d’attacher deux fois la même pièce. ");
  	 }}
         	
    	 else if( k.equals("non") ) {
   
    	  Message m=new Message();
    	  m.saisir();
    	  
    	  System.out.println("souhaitez vous modifier votre message entrez oui ou non ");
     	 String t=e.nextLine();
     	 if (t.equals("oui")) {
     		System.out.println("entrez le nouveau contenu ");
     	 m.modifcontenu();
    	  }
     	return  m;}
    	 
		return null;
	
	 }
	 
	
	 
	 
	 
	 
	 
	}
    	 



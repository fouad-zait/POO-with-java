package application;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import boite.mail.*;

public class AppMessagerie {
	public static void main(String[] args) throws Exception {
		ArrayList<AdrMail> adr=new ArrayList();
		ArrayList<BoiteMail> boite=new ArrayList();
		ArrayList<Profil>profil=new ArrayList();
		ArrayList<AdrMail> dest=new ArrayList();//REQUETE6 //
		ArrayList<AdrMail> exp=new ArrayList();//REQUETE 6//
		ArrayList<Message> msg=new ArrayList();//REQUETE 6//
		
		Scanner e =new Scanner(System.in);
		boolean arret_sous_menu=false;
		boolean arret=false;
		
		while(arret==false) {
			int x=menu();
		switch(x) {
		case 1 :CréerAdresses(adr,profil);break;
		case 2 : System.out.println("1.ajouter une adresse mail");
		         System.out.println("2.supprimer une adresse mail");
		         System.out.println("3.modifier une adresse mail");
		         System.out.println("tapez 1,2 ou 3");
		         int n=e.nextInt();
			        switch(n) {
			        case 1:ajouter_adr_mail(adr);break;
			        case 2 :supprimer_adr_mail(adr);break;
			        case 3: modifier_adr_mail(adr);break;
			        
			        }break;
		
		
		case 3 :System.out.println("1.affichage par site");
		        System.out.println("2.affichage par type ");
		        System.out.println("tapez 1 ou 2");
		        int t=e.nextInt();
		        switch(t) {
		        case 1: affiche_adresse_categorie1(adr);break;
		        case 2 : affiche_adresse_categorie2(adr);break;
		        
		        } break;
		case 4 : creation_boite_mail(adr,boite);break;
		case 5 : ajout_boite(adr,boite);break;
		case 6:affichage_boite_mail(boite);break;
		
		
		
		case 7:
			
		     	int y =sous_menu();
		       
		     	if(arret_sous_menu==false) {
	         	
	         	switch(y) {
	         	
	         	case 1:ajou_auto_msg(boite);break;
         		case 2:affiche_boite(boite);break;
	         	case 3:envoi_message(boite,adr,dest,exp,msg);break;
	         	case 4:affiche_msg(boite);break;
	         	case 5:supp_msg(boite);break;
	        	case 6:System.out.println("1.Archiver un message donné");
	       	System.out.println("2.archiver un message reçu avant une date d donnée");
		    System.out.println("tapez 1 ou 2");
			int k=e.nextInt();
			switch(k) {
			case 1:archiver_msg(boite);break;
			case 2:archiver_msg_date(boite);break;
			}break;
		      case 7:restaurer_msg(boite);break;
	         	case 8:repondre_msg(boite,adr,dest,exp,msg);break;
		        case 9:System.out.println("1.vider le dossier spam");
		       System.out.println("2.vider le dossier envoyés");
		      System.out.println("tapez 1 ou 2");
	         	int j=e.nextInt();
		      switch(j) {
		    case 1:vider_spam(boite);break;
		     case 2:vider_envoyés(boite);break;
	 	       }break;
	        	case 10:System.out.println("1.trier par dates");
		    System.out.println("2.trier par objets");
	       	System.out.println("tapez 1 ou 2");
	     	int l=e.nextInt();
	   	switch(l) {
	     	case 1 :trier_msg_par_date(msg);break;
	     	case 2 :trier_msg_par_objet(msg);break;
	      	}break;
		
	        	case 11:arret_sous_menu=true;break;
	        	}}break;
		
	        	
	        	
	        	
			
		case 8: arret=true;break;
		
		
		case 9 : int k =menu_autres_requetes();
			switch(k) {
			case 1 : requete1(boite);break;
			case 2 : requete2(boite);break;
			case 3 :requete3(boite);break;
			case 4 :requete4(profil);break;
			case 5 :requete5(boite);break;
			case 6 :System.out.println("1.afficher les messages par destinataire");
			System.out.println("2.afficher les messages par expediteur");
			System.out.println("3.afficher les messages par mot clé");
			System.out.println("tapez 1,2 ou 3");
			int l=e.nextInt();
			switch(l) {
			case 1:requete6_recherche_destinataire(dest,msg);break;
			case 2 :requete6_recherche_expediteur(exp,msg);break;
			case 3 :requete6_affiche_mot_clé(boite);break;
			
			}break;
			case 7: requete7(boite,profil);break;
			case 8: requete8(boite);break;
			}break;  
		
		
    	 }}
     
     
     
	}
		
		
	
	public static int menu() {
		int x=0;
		
		System.out.println("--Mon menu--");
		System.out.println("1. Création des adresses e-mail (avec les profils)");
		System.out.println("2. Ajouter/suppr/modifier une adresse");
		System.out.println("3. Affichage des adresses créées (par catégorie)");
	    System.out.println("4. Création des boites e-mail correspondantes");
	    System.out.println("5. Ajouter une boite");
	    System.out.println("6. Affichage des boites e-mails (avec leur contenu)");
    	 System.out.println("7. Gestion des boites e-mails");
    	 System.out.println("8. Quitter");
    	 System.out.println("9. Autres requetes");
    	 System.out.println("entrer le numero correspondant à votre choix");
    	 Scanner e=new Scanner(System.in);
    	     x=e.nextInt();
	
	return x;
}


	public static void CréerAdresses(ArrayList L,ArrayList L1) {
		 System.out.println("combien souhaitez vous creer d'adresses e_mail");
	        Scanner e=new Scanner (System.in);
	        int j=e.nextInt();
	       
	     for(int i=0;i<j;i++) {
	    	 ajouter_adr_mail(L);
	    if(L.get(i) instanceof AdrMailProf ==false) {	
	    	Profil p=new Profil();
	    	 p.saisir(((AdrMail)L.get(i)));
	    	 L1.add(p);
	}
	}}
	
	
	
	public static void affiche_adresse_categorie2(ArrayList L) {
		System.out.println("1.affichage des adresses mail simples");
        System.out.println("2.affichage des adresses mail professionnelle");
        System.out.println("tapez 1 ou 2");
        Scanner e =new Scanner(System.in);
        int t=e.nextInt();
        switch(t) {
        case 1:
        	for(int i=0;i<L.size();i++) {
        		if(L.get(i) instanceof AdrMailProf==false ) {
        			System.out.println(L.get(i).toString());
        		}
        	}break;
        case 2 :
        	for(int i=0;i<L.size();i++) {
        		if(L.get(i) instanceof AdrMailProf==true) {
        			System.out.println(L.get(i).toString());
        		}
        		}break;
        	}}
	
	
        	public static void affiche_adresse_categorie1(ArrayList L) {
        		System.out.println("tapez le site dont vous voulez afficher les adresses mail");
        		 Scanner e =new Scanner(System.in);
        	        String t=e.nextLine();
        	        for(int i=0;i<L.size();i++) {
                       if (L.get(i) instanceof AdrMailProf==false) {
                    	  if( ((AdrMail) L.get(i)).get_site().equals(t)) {
                    		  System.out.println(L.get(i).toString());
                    	  }
                    	   
                       }
                    	  else if( L.get(i) instanceof AdrMailProf==true  ) {
                    		  if( ((AdrMailProf) L.get(i)).get_site().equals(t)) {
                        		  System.out.println(L.get(i).toString());
                        	  }
                    	  }
	}}
      
        	
        	public  static AdrMail ajouter_adr_mail(ArrayList L) {
        		 Scanner e=new Scanner (System.in);
         System.out.println("souhaitez vous creer une adresse mail professionnelle oui ou non ");
     	    	 String k=e.nextLine();
     	    	 if (k.equals("oui") ) {
     	    		 AdrMailProf a=new AdrMailProf();
     	    		 a.saisir();
     	    		 L.add(a);return a;
     	    		 
     	    	 }
     	    	 else if( k.equals("non") ) {
     	    		 AdrMail a=new AdrMail();
     	    		 a.saisir();L.add(a);
     	    	  return a;
    	} return null;
     	    	 }
        	
        	
     	  	public static void supprimer_adr_mail(ArrayList L) {
     	  		 Scanner e=new Scanner (System.in);
      System.out.println("souhaitez vous supprimer une adresse mail professionnelle oui ou non ");
 	        	    	 String k=e.nextLine();
    	    	 if (k.equals("oui") ) {
     	        	    		 AdrMailProf a=new AdrMailProf();
     	        	    		 a.saisir();
     	        	    		 if(L.contains(a)) {
     	        	    		 L.remove(a);
     	        	    	 }
      		 else {
    	    			 System.err.println("l'adresse que vous avez saisi n'exite pas");
     	        	    		 }
     	        	    		 }
     	        	    	 else if( k.equals("non") ) {
     	        	    		 AdrMail a=new AdrMail();
     	        	    		 a.saisir();
     	        	    	 Profil p=new Profil();
     	        	    	 p.saisir(a);
     	        	    	 if(L.contains(p)) {
     	        	    		 L.remove(p);
     	        	    	 }
     	        	    	 else {
 	 System.err.println("l'adresse que vous avez saisi n'exite pas");
 	        	    		 }
     	        	    	 }}
     	  	
     	  	
     	    	public static void modifier_adr_mail(ArrayList L)	{
     	    		 Scanner e=new Scanner (System.in);
  System.out.println("souhaitez vous modifier une adresse mail professionnelle oui ou non ");
      	        	    	 String k=e.nextLine();
      	        	    	 if (k.equals("oui") ) {
  System.out.println("saisissez l'adresse mail professionnelle à modifier");
      	        	    	 
      	        	    		 AdrMailProf a=new AdrMailProf();
     	        	    		 a.saisir();
     	        	    		 if(L.contains(a)) {
     	        	    			System.out.println("1. modifier mot de passe");
     	        	     	    	System.out.println("2. modifier pseudo");
     	        	     	    	System.out.println("tapez 1 ou 2");
     	        	     	    	int n=e.nextInt();
     	        	    			 switch(n) {
     	        	    			 case 1 :a.modif_mot_de_passe();break;
     	        	    			 case 2 :a.modif_pseudo();break;
     	        	    			 }
     	        	    			 }
     	        	    		 else {
     	 System.err.println("l'adresse que vous avez saisi n'exite pas");
     	        	    		 	        	    		 }
      	        	    	 }
      	        	    	 if (k.equals("non") ) {
    System.out.println("saisissez l'adresse mail à modifier");
    AdrMail a=new AdrMail();
	 a.saisir();
	
	 if(L.contains(a)) { 	    	 		 
			System.out.println("1. modifier mot de passe");
  	    	System.out.println("2. modifier pseudo");
  	    	System.out.println("3.modifier profil");
  	    	System.out.println("tapez 1,2 ou 3");
  	    	int n=e.nextInt();
 			 switch(n) { 	    	 
 			 case 1 :a.modif_mot_de_passe();break;
 			 case 2 :a.modif_pseudo();break;
 			 case 3 : 
 			               for(int i=0;i<L.size();i++) {
 			            	   if(L.get(i).equals(a)) {
 			            		  Profil p =new Profil();
 		 			                p.saisir(a);
 		 			                L.add(p);
 			            	   }
 			               }break;
 				
 			 }
 			 }
	 else {
     	 System.err.println("l'adresse que vous avez saisi n'exite pas");
     	        	    		 	        	    		 }}}
      	public static void creation_boite_mail(ArrayList L1,ArrayList L2)
      	
      	{
      		for(int i=0;i<L1.size();i++) {
      		
      			
      			BoiteMail b = new BoiteMail(((AdrMail) L1.get(i)));
      			Message m=new Message();
      			m.setTitre("bienvenu");
      			m.setContenu("");
      			m.setEtat_msg(état.reçu);
      			 Date d =new Date ();
      	         d.setYear(d.getYear()+1900);/// lors de la creation d'un message la date recoit la date system///
      	         d.setMonth(d.getMonth()+1);
      	         d.setDate(d.getDate());
      			m.setDate_de_creation(d);
      			m.setTaillemsg(8);
      			b.setReçus(m);
      			L2.add(b);
      			
      	}
}

      	
      	public static void ajout_boite(ArrayList L1,ArrayList L2) {
      		AdrMail a=ajouter_adr_mail(L1);
      		BoiteMail b=new BoiteMail(a);
      		L2.add(b);
      	}
      	
      	
     public static void affichage_boite_mail(ArrayList L) {
    	 for(int i=0;i<L.size();i++) {
    		 if(L.get(i) instanceof BoiteMail ==true)
    	 ((BoiteMail)L.get(i)).affiche();
    	 }
}

     	 

      public static int sous_menu() {
    		int x=0;
    		
    		System.out.println("--sous menu--");
    		System.out.println("1.Ajout automatique de messages (reçus, envoyés, brouillons)");
    		System.out.println("2. Afficher le contenu d’une boite ");
    		System.out.println("3. Envoyer message ");
    	    System.out.println("4. Afficher le contenu d’un message");
    	    System.out.println("5. Supprimer un message");
    	    System.out.println("6. Archiver un message / ou les messages reçus avant une date d donnée");
        	 System.out.println("7. Restaurer un message donné (restituer de la corbeille)");
        	 System.out.println("8. répondre à un message");
        	 System.out.println("9. vider un dossier (« spam » ou « envoyés »)");
     		System.out.println("10. trier les messages par date ou objet");
     		System.out.println("11. Quitter");
     	
        	 System.out.println("entrer le numero correspondant à votre choix");
        	 Scanner e=new Scanner(System.in);
        	     x=e.nextInt();
    	
    	return x;
      }
      
      
     
      
      public static void ajou_auto_msg(ArrayList L) throws Exception {
    	  Scanner e=new Scanner(System.in);
    	  for(int j=0;j<L.size();j++) {
    		  System.out.println("vous etes dans la boite n°"+j);
    	  System.out.println("combien souhaitez vous ajouter de messages");
    	  int n=e.nextInt();
    	  for(int i=0;i<n;i++) {
    		  System.out.println("1.reçus");
    		  System.out.println("2.envoyés");
    		  System.out.println("3.brouillons");
    		  System.out.println("choisissez un numero");
    	  
    		  int k=e.nextInt();
    		  switch(k) {
    		  
    		 
    		  case 1 :
					((BoiteMail)L.get(j)).setReçus(creation_msg.creation());
				break;
    		  case 2:
    			  ((BoiteMail)L.get(j)).setEnvoyé(creation_msg.creation());break;
    		  case 3: 
    			  ((BoiteMail)L.get(j)).setBrouillons(creation_msg.creation());break;  
      }}}}
      
      
      public static void affiche_boite(ArrayList L) {
    	
    		System.out.println("donner l'adresse de la boite mail que vous souhaitez afficher");
        	AdrMail a=new AdrMail();
     		a.saisir();
        	
        	for(int i=0;i<L.size();i++ ) {
        	
        	if( ((BoiteMail)L.get(i)).getAd().equals(a) && L.get(i) instanceof BoiteMail ==true)  {
        		
        		((BoiteMail)L.get(i)).affiche();
    	System.out.println( "espace utilisé: "+((BoiteMail)L.get(i)).espace_stockage()+" MO"+":/ espace restant: "+((BoiteMail)L.get(i)).stockage_restant()+"MO");  
      }}}
      
      
      public static void envoi_message(ArrayList L,ArrayList L1,ArrayList LDEST,ArrayList LEXP,ArrayList M) throws Exception{// les deux arraylist LDEST ET LEXP ET M ON EN AURA BESOIN POUR LA REQUETE 6//
    	 boolean x=false;
    	  System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour envoyer votre message");
    	  AdrMail a=new AdrMail();
   		a.saisir();
   		for(int i=0;i<L.size();i++ ) {
        	if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
    	  Message m = creation_msg.creation();
    	  System.out.println("saisissez l'adresse du destinataire");
    	  AdrMail a1=new AdrMail();
    	  a1. saisir_pseudo_site();
    	  for(int j=0 ;j<L1.size();j++) {
    		if(((AdrMail) L1.get(j)).get_pseudo().equals(a1.get_pseudo()) &&  ((AdrMail) L1.get(j)).get_site().equals(a1.get_site() )    ) { 
    		  x=true;
    		  a1=((AdrMail) L1.get(j));
    		  LDEST.add(a1);//ON EN AURA BESOIN POUR REQUETE 6//
    		  LEXP.add(a);//ON EN AURA BESOIN POUR REQUETE 6//
    		  M.add(m);//ON EN AURA BESOIN POUR REQUETE 6//
    		  m.setEtat_msg(état.envoyé);
    		  ((BoiteMail)L.get(i)).setEnvoyé(m);
    		  m.setEtat_msg(état.reçu);
    		  ((BoiteMail)L.get(j)).setReçus(m);
    		  
    	  }}
    	  if(x==false) throw new Exception ("adresse de destinataire n’existe pas dans le répertoire des adresses"); 
    	
      }}}
      
      
      public static  void affiche_msg(ArrayList L) throws Exception {
    	  System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour afficher un message");
    	  AdrMail a=new AdrMail();
   		a.saisir();
   		for(int i=0;i<L.size();i++ ) {
        	if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
    	   System.out.println("donner le titre du message que vous souhaitez afficher");
    	   Message t= creation_msg.creation();
    	     
    	    	  if (((BoiteMail)L.get(i)).getReçus().contains(t) ||((BoiteMail)L.get(i)).getEnvoyés().contains(t)|| ((BoiteMail)L.get(i)).getArchives().contains(t)||((BoiteMail)L.get(i)).getBrouillons().contains(t)||((BoiteMail)L.get(i)).getCorbeille().contains(t) ||((BoiteMail)L.get(i)).getSpam().contains(t)  ) {
    	    		  System.out.println(t.toString());
    	    	  }
    	      }
      }}
     
      
      public static void supp_msg(ArrayList L) throws Exception {
    	  System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour supprimer un message");
    	  AdrMail a=new AdrMail();
   		a.saisir();
   		for(int i=0;i<L.size();i++ ) {
   			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
    	  System.out.println("donner le message que vous souhaitez supprimer");
    	  Message t= creation_msg.creation();
    	    	  ( (BoiteMail)L.get(i)).supprim_msg(t) ;
    	    	      }
      }}
      

    public static void archiver_msg(ArrayList L) throws Exception {
    	System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour archiver un message");
  	  AdrMail a=new AdrMail();
 		a.saisir();
 		for(int i=0;i<L.size();i++ ) {
 			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
    	  System.out.println("donner le message à archiver");
    	  Message t= creation_msg.creation();
    	 
    	  ( (BoiteMail)L.get(i)).archiver_msg(t);
    	  
  	    	      }}}

    
    public static void archiver_msg_date (ArrayList L) {
    	System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour archiver un message par date");
    	  AdrMail a=new AdrMail();
   		a.saisir();
   		for(int i=0;i<L.size();i++ ) {
   			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
    	Scanner e=new Scanner(System.in);
    	System.out.println("donner l'année");
    	int a1=e.nextInt();
    	System.out.println("donner le mois");
    	int m=e.nextInt();
    	System.out.println("donner le jour");
    	int j=e.nextInt();
    	Date d=new Date(a1,m,j);
    	
    	 for (int k=0;k<((BoiteMail)L.get(i)).getReçus().size();k++) {
   	    		
   	     if(((BoiteMail)L.get(i)).getReçus().get(k).getDate_de_creation().compareTo(d)<0) {
   	    	((BoiteMail)L.get(i)).archiver_msg(((BoiteMail)L.get(i)).getReçus().get(k));
   	     }
    }}}}
    
    
    public static void restaurer_msg(ArrayList L) throws Exception {
    	System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour restaurer un message");
  	  AdrMail a=new AdrMail();
 		a.saisir();
 		for(int i=0;i<L.size();i++ ) {
 			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
    	System.out.println("donner le message a restaurer");
    	Message m= creation_msg.creation();
    	 for (int j=0;j<((BoiteMail)L.get(i)).getCorbeille().size();j++) {
	    		
       	     if(((BoiteMail)L.get(i)).getCorbeille().get(j).equals(m)) {
             
       	    	((BoiteMail)L.get(i)).supprim_corbeille(m);  } 	 
       	     }}}}
    	
    	
      public static void repondre_msg(ArrayList L,ArrayList L1,ArrayList LDEST,ArrayList LEXP,ArrayList M) throws Exception  {
    	  System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour repondre à un message");
      	  AdrMail a=new AdrMail();
     		a.saisir();
     		for(int i=0;i<L.size();i++ ) {
     			if(((BoiteMail)L.get(i)).getAd().equals(a)) {
     				 Message m=creation_msg.creation();
    	  System.out.println("donner l'adresse de celui à qui vous souhaitez repondre");
    	  AdrMail a1 =new AdrMail();
    	  a1. saisir_pseudo_site();
    	  for(int j=0 ;j<L1.size();j++) {
      		if(((AdrMail) L1.get(j)).get_pseudo().equals(a1.get_pseudo()) &&  ((AdrMail) L1.get(j)).get_site().equals(a1.get_site() )    ) { 
      		  a1=((AdrMail) L1.get(j));
      		  LDEST.add(a1);//ON EN AURA BESOIN POUR REQUETE 6//
      		  LEXP.add(a);//ON EN AURA BESOIN POUR REQUETE 6//
      		  M.add(m);//ON EN AURA BESOIN POUR REQUETE 6//
      		  m.setEtat_msg(état.envoyé);
      		  ((BoiteMail)L.get(i)).setEnvoyé(m);
      		  m.setEtat_msg(état.reçu);
      		  ((BoiteMail)L.get(j)).setReçus(m);
      		  
      	  }} 
    	}}}
    	
      
      public static void vider_spam(ArrayList L) {
    	  
    	  System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour vider le dossier spam");
      	  AdrMail a=new AdrMail();
     		a.saisir();
     		for(int i=0;i<L.size();i++ ) {
     			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
     				((BoiteMail)L.get(i)).getSpam().clear();
      }}}
      public static void vider_envoyés(ArrayList L) {
    	  
    	  System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour vider le dossier envoyés");
      	  AdrMail a=new AdrMail();
     		a.saisir();
     		for(int i=0;i<L.size();i++ ) {
     			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
     				((BoiteMail)L.get(i)).getEnvoyés().clear();
      }}}
    	
    	
      
      public static void trier_msg_par_date(ArrayList L) {
    	  System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour trier les messages par dates");
      	  AdrMail a=new AdrMail();
     		a.saisir();
     		for(int i=0;i<L.size();i++ ) {
     			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
     			System.out.println("1.trier par dates les messages reçus");
     			System.out.println("2.trier par dates les messages envoyés");
     			System.out.println("3.trier par dates les messages archivés");
     			System.out.println("4.trier par dates les messages de la corbeille");
     			System.out.println("5.trier par dates les messages spam");
     			System.out.println("6.trier par dates les messages brouillons");
     			System.out.println("choisissez le numero de votre choix ");
     				Scanner e=new Scanner(System.in);
     				int x=e.nextInt();
     			switch(x) {
     			case 1:tri_pardates(((BoiteMail)L.get(i)).getReçus());break;
     			case 2:tri_pardates(((BoiteMail)L.get(i)).getEnvoyés());break;
     			case 3 :tri_pardates (((BoiteMail)L.get(i)).getArchives());break;
     			case 4 :tri_pardates(((BoiteMail)L.get(i)).getCorbeille());break;
     			case 5 :tri_pardates(((BoiteMail)L.get(i)).getSpam());break;
     			case 6 :tri_pardates(((BoiteMail)L.get(i)).getBrouillons());break;
     			
     			}break;
     			}}}
     			
     	public static void tri_pardates(ArrayList L)	{	
       for(int i=0;i<L.size();i++) {
    		  
    	   for(int j=0;j<L.size();j++) {
    		  if(((Message)L.get(j-1)).getDate_de_creation().compareTo(((Message)L.get(j)).getDate_de_creation()) <0 ) {
    			  Message m=new Message();
            m=(Message) L.get(j-1);
            L.set(j-1, (Message) L.get(j))  ;
           L.set(j, m);
    			  
    			  
    		  }
    		  
    	  }
      }}
      
      
      public static void trier_msg_par_objet(ArrayList L) {
    	  System.out.println("donner la boite mail à laquelle vous souhaiter acceder pour trier les messages par objets");
      	  AdrMail a=new AdrMail();
     		a.saisir();
     		for(int i=0;i<L.size();i++ ) {
     			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
     			System.out.println("1.trier par objets les messages reçus");
     			System.out.println("2.trier par objets les messages envoyés");
     			System.out.println("3.trier par objets les messages archivés");
     			System.out.println("4.trier par objets les messages de la corbeille");
     			System.out.println("5.trier par objets les messages spam");
     			System.out.println("6.trier par objets les messages brouillons");
     			System.out.println("choisissez le numero de votre choix ");
     				Scanner e=new Scanner(System.in);
     				int x=e.nextInt();
     			switch(x) {
     			case 1:tri_obj(((BoiteMail)L.get(i)).getReçus());break;
     			case 2:tri_obj(((BoiteMail)L.get(i)).getEnvoyés());break;
     			case 3 :tri_obj (((BoiteMail)L.get(i)).getArchives());break;
     			case 4 :tri_obj(((BoiteMail)L.get(i)).getCorbeille());break;
     			case 5 :tri_obj(((BoiteMail)L.get(i)).getSpam());break;
     			case 6 :tri_obj(((BoiteMail)L.get(i)).getBrouillons());break;
     			
     			}break;
     			}}}
      public static void tri_obj(ArrayList L) {
    	  Collections.sort(L);
      }
    	  
      
    
      
      public static int menu_autres_requetes() {
      
  	int x=0;
		
		System.out.println("--autres requetes-");
		System.out.println("1. Afficher toutes les boites (adresses mail) ayant reçu un message donné on donnera l’objet du message)");
		System.out.println("2. Afficher les boites qui sont remplies à plus de 50% de leur capacité ");
		System.out.println("3. Eclater la collection des boites en deux collections :la première contenant les boites publiques et l’autre contenant les boites professionnelles");
	    System.out.println("4. Pour un site donné, calculer le pourcentage d’utilisation par la catégorie d’âge comprise entre 18 et 35 ans.");
	    System.out.println("5. Afficher les messages ayant des pièces jointes (pour une boite donnée)");
	    System.out.println("6. Rechercher les messages par destinataire, par expéditeur, par mot clé");
  	 System.out.println("7. Afficher les noms, prénoms des profils ayant au moins deux boites de messagerie ");
  	 System.out.println("8. Vider toutes les boites d’un site donné (piratage du site)");
  	 Scanner e=new Scanner(System.in);
  	     x=e.nextInt();
	
	return x;
      }

      
      
      public static void requete1(ArrayList L) throws Exception {
    	  System.out.println("saisissez le message");
    	 Message m= creation_msg.creation();
    	  for(int i=0;i<L.size();i++) {
    		  if ( ((BoiteMail)L.get(i)).getReçus().contains(m)) {
    			((BoiteMail)L.get(i)).affiche();
    		  }
    	  }  
      }
      
      
      public static void  requete2(ArrayList L) {
    	  for(int i=0;i<L.size();i++) {
    		  if ( ((BoiteMail)L.get(i)).espace_stockage()>((BoiteMail)L.get(i)).getStockageMAX()/2) {
    			  ((BoiteMail)L.get(i)).affiche();
    		  }
      }
  
}
      
      
      public static void requete3(ArrayList L) {
    	  ArrayList<BoiteMail> boite_publique=new ArrayList();
    	  ArrayList<BoiteMail> boite_pro=new ArrayList();
    	  for(int i=0;i<L.size();i++) {
    		  if ( ((BoiteMail)L.get(i)).getAd() instanceof AdrMailProf ==false) {
    			  boite_publique.add(((BoiteMail)L.get(i)));
    		  }
    		  else {
    			  boite_pro.add(((BoiteMail)L.get(i)));
    		  }}
      System.out.println("boites publiques");
    	  for(int i=0;i<boite_publique.size();i++) {
    		  boite_publique.get(i).affiche();
}
    	  System.out.println("boites professionnelle");
    	  for(int i=0;i<boite_pro.size();i++) {
    		  boite_pro.get(i).affiche();
}}
      
     
      
      
        public static void requete4(ArrayList L) {
        	int nb=0;
         
    	  System.out.println("donner un site");
    	  Scanner e=new Scanner(System.in);
    	  String k= e.nextLine();
    	  for(int i=0;i<L.size();i++) {
    		  if ( ((Profil)L.get(i)).getAdr().get_site().equals(k)  &&  ((Profil)L.get(i)).getAge()>=18  &&  ((Profil)L.get(i)).getAge()<=35 ) {
    		  nb=nb+1;	  
    		  }}
    	int  pourcentage=((nb*100)/L.size());
    	  
    	  System.out.println(pourcentage+"%");
      }
        
        
        public static void recherche_dossier_affiche(ArrayList L)//pour faire la requete 5
        {
        	for(int i=0;i<L.size();i++) {
        		if(L.get(i) instanceof MessageAttach ==true ) {
        			
        		System.out.println(	L.get(i).toString());
        		}}
        }
        
        
        public static void requete5(ArrayList L) {
        	System.out.println("donner une boite mail dont vous souhaitez afficher les messages ayant des piéces jointes");
    		AdrMail a=new AdrMail();
    		a.saisir();
    		for(int i=0;i<L.size();i++ ) {
     			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
    		recherche_dossier_affiche(((BoiteMail)L.get(i)).getReçus());
    		recherche_dossier_affiche(((BoiteMail)L.get(i)).getEnvoyés());
    		recherche_dossier_affiche(((BoiteMail)L.get(i)).getArchives());
    		recherche_dossier_affiche(((BoiteMail)L.get(i)).getBrouillons());
    		recherche_dossier_affiche(((BoiteMail)L.get(i)).getCorbeille());
    		recherche_dossier_affiche(((BoiteMail)L.get(i)).getSpam());
        }}}

        
        public static void requete6_recherche_destinataire(ArrayList LDEST,ArrayList M) {
        	
          System.out.println("donner l'adresse du destinataire ");
          AdrMail a1 =new AdrMail ();
          a1. saisir_pseudo_site();
          for(int i=0;i<LDEST.size();i++) {
        	  if( ((AdrMail)LDEST.get(i)).get_pseudo().equals(a1.get_pseudo())&& ((AdrMail)LDEST.get(i)).get_site().equals(a1.get_site()) )
        	
        		System.out.println(  M.get(i).toString());
        	  }
          }
        
        
        
        public static void requete6_recherche_expediteur(ArrayList LEXP,ArrayList M)  {
        	
        	 System.out.println("donner l'adresse de l'expediteur");
        	 AdrMail a1 =new AdrMail ();
             a1. saisir_pseudo_site();
             for(int i=0;i<LEXP.size();i++) {
           	  
            	  if( ((AdrMail)LEXP.get(i)).get_pseudo().equals(a1.get_pseudo())&& ((AdrMail)LEXP.get(i)).get_site().equals(a1.get_site()) )
           		System.out.println(  M.get(i).toString());
           	  }
           	  
              }
        
        
        
        public static void requete6_affiche_mot_clé(ArrayList L)
        {
        	System.out.println("donner une boite mail dont vous souhaitez recherchez les messages par mot clé");
        	AdrMail a=new AdrMail();
    		a.saisir();
    		for(int i=0;i<L.size();i++ ) {
      			if(((BoiteMail)L.get(i)).getAd().equals(a)     ) {
    		 System.out.println("donner le mot clé");
             Scanner e=new Scanner (System.in);
             String s= e.nextLine();
           for (int j=0;j<((BoiteMail)L.get(i)).getReçus().size();j++) {
             if (((BoiteMail)L.get(i)).getReçus().get(j).getContenu().contains(s) || ((BoiteMail)L.get(i)).getReçus().get(j).getTitre().contains(s)) {
          System.out.println( ((BoiteMail)L.get(i)).getReçus().get(j).toString());	 
             }
           }
           for (int j=0;j<((BoiteMail)L.get(i)).getEnvoyés().size();j++) {
               if (((BoiteMail)L.get(i)).getEnvoyés().get(j).getContenu().contains(s) || ((BoiteMail)L.get(i)).getEnvoyés().get(j).getTitre().contains(s)) {
              System.out.println(((BoiteMail)L.get(i)).getEnvoyés().get(j).toString()); }
             }
           for (int j=0;j<((BoiteMail)L.get(i)).getArchives().size();j++) {
               if (((BoiteMail)L.get(i)).getArchives().get(j).getContenu().contains(s) || ((BoiteMail)L.get(i)).getArchives().get(j).getTitre().contains(s)) {
              System.out.println(((BoiteMail)L.get(i)).getArchives().get(j).toString()); }
             }
           for (int j=0;j<((BoiteMail)L.get(i)).getBrouillons().size();j++) {
               if (((BoiteMail)L.get(i)).getBrouillons().get(j).getContenu().contains(s) ||((BoiteMail)L.get(i)).getBrouillons().get(j).getTitre().contains(s)) {
              System.out.println(((BoiteMail)L.get(i)).getBrouillons().get(j).toString()); }
             }
           for (int j=0;j<((BoiteMail)L.get(i)).getCorbeille().size();j++) {
               if (((BoiteMail)L.get(i)).getCorbeille().get(j).getContenu().contains(s) || ((BoiteMail)L.get(i)).getCorbeille().get(j).getTitre().contains(s)) {
              System.out.println(((BoiteMail)L.get(i)).getCorbeille().get(j).toString()); }
             }
           for (int j=0;j<((BoiteMail)L.get(i)).getSpam().size();j++) {
               if (((BoiteMail)L.get(i)).getSpam().get(j).getContenu().contains(s) || ((BoiteMail)L.get(i)).getSpam().get(j).getTitre().contains(s)) {
              System.out.println(((BoiteMail)L.get(i)).getSpam().get(j).toString()); }
             }
        }
    		}}
        
        
        public static void requete7(ArrayList L,ArrayList L1) {
        	int nb=0;
        	for(int i=0;i<L.size();i++) {
        	  for(int j=0;j<L.size();j++) {
        	    if( ((BoiteMail)(L.get(i))).getAd().equals(((BoiteMail)(L.get(j))).getAd())) {
        	   	nb++;
        	}}
        	if( nb>=2 ) {
        		AdrMail a =((BoiteMail)(L.get(i))).getAd();
        		for(int k=0;k<L1.size();k++ ) {
        			if( ((Profil)(L1.get(i))).getAdr().equals(a)  ) {
        			System.out.println("nom "+((Profil)(L1.get(i))).getNom()+"prenom"+((Profil)(L1.get(i))).getPrenom());
        				
        			}}}}}
        
        
        		
        public static void requete8(ArrayList L) {
        	 System.out.println("donner un site");
       	  Scanner e=new Scanner(System.in);
       	  String k= e.nextLine();
        	
        	for(int i=0;i<L.size();i++) {
        		if (((BoiteMail)L.get(i)).getAd().get_site().equals(k)        ) {
        			L.remove(i);
        		}
        		
        	}
        	
        	
        	
        	
        }
        
        
        
      	        	    	 
      	        	    	 
      	        	    	 
}
     	    		
     	    		
        	        
        	        
package exercice5;
import java.util.Scanner;
public class ProgEnumPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Pays.affiche();
      System.out.println("donner la taille du tableau");
      Scanner e=new Scanner(System.in);
      int n=e.nextInt();
      Pays [] T =new Pays[n];
      System.out.println("donner les pays a remplir ");
      
      
      
      String j=e.nextLine();
      if (Pays.accepteChaine(j)==true) {
 		 T[0]=Pays.valueOf(j);
 	 }
 	 else {
 		 T[0]=Pays.ALGERIE;
 	 }
      
      for (int i=0;i<n;i++) {
    	 String k=e.nextLine();
    	 if (Pays.accepteChaine(k)==true) {
    		 T[i]=Pays.valueOf(k);
    	 }
    	 else {
    		 T[i]=Pays.ALGERIE;
    	 }
      }
      System.out.println("le tableau de pays est :");
      for (int i=0;i<n;i++) {
      System.out.println(T[i]);
	}
      System.out.println("les pays qui ont pour langue officielle l'arabe sont ");
      for (int i=0;i<n;i++) {
    	  if(T[i].getlangue()=="ARABE") {
    		 Pays.afficher(T[i]);
    	  }
      }
      
      
      
}
}

package exercice2;
import java.util.Scanner;
public class ProgTest {

	public static void main(String[] args) {
		System.out.println("donner la longueur du tableau n");
		Scanner e = new Scanner(System.in);
		int n = e.nextInt();
      String [] T = new String[n]; 
		System.out.println("donner  les chaine de caracteres a remplir");
		String s=e.nextLine();
		T[0]=s;
		for (int i=0;i<T.length;i++) {
			String k=e.nextLine();
			T[i]=k;
		}
		System.out.println("les chaines en majuscule :");
		for (int i=0;i<T.length;i++) {
			System.out.println(T[i].toUpperCase());

		}
		System.out.println("les chaines en minuscule :");
		for (int i=0;i<T.length;i++) {
			System.out.println(T[i].toLowerCase());
	 	}
	 	
	 	System.out.println("les chaines de caracteres ayant comme suffixe 'ant' sont: ");
	 		String S1="ant";
			for (int j=0;j<T.length;j++) {
				if (T[j].length()>3  ) {
				   int a =T[j].length();
				   
			    String 	s2=T[j].substring( a-3);
			    
			       if(S1.equals(s2)==true) {
				System.out.println(T[j]);

			
			}}}
			       System.out.println("donner la chaine S");
				 	String S=e.nextLine();
				 	System.out.println("les chaines superieure a la chaine S sont : ");
				 	for (int i=0;i<T.length;i++) {
				 		if (T[i].compareTo(S)>0) {
				 			 System.out.println(T[i]);
				 		}}
				 	
				 //	remplace les chaines commencant par 'a' par HELLO"//
				 	for (int j=0;j<T.length;j++) {
			 			if(T[j].length() >0 ) {
			 			char c= T[j].charAt(0);
				 		  if (c=='a') {
				 			T[j]="HELLO";
				 		}}}
				 	System.out.println("le nouveau tableau (remplace les chaines commencant par 'a' par HELLO");
			 		for (int j=0;j<T.length;j++) {
			 			
			 			 System.out.println(T[j]);
			             
			}}
	 		
	 		
	 		
	 		
	 		 
	 	}
		
		
		
		
		
		
		
		
		

	
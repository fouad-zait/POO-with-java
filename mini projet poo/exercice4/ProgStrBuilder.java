package exercice4;
import java.util.Scanner;

import java.util.Scanner;

public class ProgStrBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("donner la taille du tableau T");
		Scanner e=new Scanner(System.in);
		int n = e.nextInt();
		StringBuilder [] T =new StringBuilder[n];
		System.out.println("donner les chaines a remplir");
		 String j=e.nextLine();
		 StringBuilder s=new StringBuilder(j);
		 T[0]=s;
		for(int i=0;i<n;i++) {
		String k=e.nextLine();
		StringBuilder ch=new StringBuilder(k);
		       T[i]=ch;
		}
		System.out.println("les chaines de caracteres en majuscules : ");
		for(int i=0;i<n;i++) {
			System.out.println(T[i].toString().toUpperCase());
		}
		System.out.println("le tableau de chaine modifiée (3eme caractere par '-') est:");
		for(int i=0;i<n;i++) {
		T[i].setCharAt(2, '-');
		System.out.println(T[i]);
		}
		System.out.println("le tableau de chaine modifiée (concatener 2020 au chaines de caracteres de longueur inferieure à 5 ) est:");
		for(int i=0;i<n;i++) {
			if(T[i].length()<5) {
				T[i].append(2020);
			}
			System.out.println(T[i]);
		}
		

}}

package exercice3;
import java.util.Scanner;
public class ProgChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb=0,nbr=0,nbrep=0;
		System.out.println("donner la taille du tableau VS");
		Scanner e=new Scanner(System.in);
		int n = e.nextInt();
		 Chaine[] VS =new Chaine[n];
		 
		 System.out.println("donner les chaines a remplir");
		 String k=e.nextLine();
		 VS[0]=new Chaine(k);
		for(int i=0;i<n;i++) {
		String j=e.nextLine();
		 VS[i]=new Chaine(j);
		}
		System.out.println("le tableau de longeur est ");
		int[] VT =new int [n];
		for(int i=0;i<n;i++) {
			VT[i]=VS[i].longueur();
		}
		for(int i=0;i<n;i++) {
			 System.out.println(VT[i]);
	}
		System.out.println(" les chaines qui  comportent ni chiffre  ni lettre sont :)");
	
		for (int j=0;j<n;j++) {
			if (VS[j].nbChiffres()==0 &&  VS[j].nbLettres()==0) {
				VS[j].affiche2();
			}
		}
		System.out.println("les chaines qui comportent le caractere 'z' " );
		
		for (int j=0;j<n;j++) {
			if ( VS[j].appartient('z')==true ) {
				VS[j].affiche2();
			}
		}
		for (int t=0;t<n;t++) {
			for (int j=1;j<n;j++) {
				if (VS[j].estInverse(VS[j-1]) == true ) {
					nb=nb+1;
					
				}
			}}
			if (nb==0) {
				System.out.println("NON ,il n'existe pas de chaine qui est inverse de l'autre");
				
			}
			else {
				System.out.println("OUI,il existe  une chaine qui est inverse d’une autre");
				
			}
			for (int i=0;i<n;i++) {
				if (VS[i].estPalind()==true  ) {
					nbr=nbr+1;
				}
			}
			System.out.println("le nombre de chaines palindrômes dans le vecteur VS est :"+nbr);
			
			for (int i=0;i<n;i++) {
				if (VS[i].estPalind()==true  ) {
					VS[i].affiche2();
				}}
			for (int j=1;j<n;j++) {
				if (VS[0].estEgale(VS[j])==true) {
					nbrep=nbrep+1;
				}}
				if (nbrep==0) {
					System.out.println("NON la chaine VS[0] ne se repete pas dans le vecteur ");
				}
				else {
					System.out.println("oui la chaine VS[0] se repete dans le vecteur "+nbrep+" fois");
			}
			
		}
		
		
	}



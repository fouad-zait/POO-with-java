package exercice1;
import java.util.Arrays;
import java.util.Scanner;

public class ProgDate {

	public static void main(String[] args) {
	date [] V=new date [20];
	V[0]=new date(15,3,2020);
	V[1]=new date(17,6,2027);
	V[2]=new date(5,9,2013);
	V[3]=new date(1,3,2016);
	V[4]=new date(25,4,2018);
	V[5]=new date(30,8,2011);
	V[6]=new date(1,9,2000);
	V[7]=new date(13,8,2014);
	V[8]=new date(12,3,2015);
	V[9]=new date(14,9,2013);
	V[10]=new date(1,5,1999);
	V[11]=new date(5,8,1987);
	V[12]=new date(1,7,2001);
	V[13]=new date(18,3,2010);
	V[14]=new date(19,9,2004);
	V[15]=new date(11,7,2008);
	V[16]=new date(2,5,2003);
	V[17]=new date(4,8,2000);
	V[18]=new date(8,8,2004);
	V[19]=new date(23,9,2002);

    
	for (int i=0;i<V.length;i++) {
	V[i].affiche();
	}
	
	
	for (int i=0;i<V.length-1;i++) {
	    for (int k=1;k<=V.length-1;k++) {
		if (date.compare(V[k], V[k-1])==-1) {
			date x =new date(); 
			x=V[k-1];
			V[k-1]=V[k];
			V[k]=x;
			
		}
		
		}}
	    
		System.out.println("le tableau trié est ");
	for (int i=0;i<V.length;i++) {
		V[i].affiche();

	}
	
	System.out.println("donner un nombre nb");
	Scanner e=new Scanner (System.in);
	int nb = e.nextInt();
	
	for (int i=0;i<V.length;i++) {
		V[i]=date.dateAprés(V[i], nb);
	}
	for (int i=0;i<V.length;i++) {
		V[i].affiche();

	}
	String [] S=new String [20];
	
	for (int i=0;i<V.length;i++) {
	S[i]=V[i].tostring();
	
	}
	System.out.println("le tableau S de string est :");
	for (int i=0;i<S.length;i++) {
        System.out.println(S[i]);

	}


}}



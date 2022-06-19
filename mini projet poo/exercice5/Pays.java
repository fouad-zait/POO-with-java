package exercice5;

public enum Pays {ALGERIE("ALGER","ARABE",41320000),MAROC("RABAT","ARABE",35940000),TUNISIE("TUNIS","ARABE",11530000),EGYPTE("LE CAIRE","ARABE",97550000),FRANCE("PARIS","FRANCAIS",66990000),ALLEMAGNE("BERLIN","ALLEMAND",82790000),ESPAGNE("MADRID","ESPAGNPOL",46660000),PORTUGAL("LISBONNE","PORTUGUAIS",10290000),ITALIE("ROME","ITALIEN",60480000),GRECE("ATHENES","GREQUE",10740000),RUSSIE("MOSCOU","RUSSE",144500000),POLOGNE("VARSOVIE","POLONAIS",37980000),BRESIL("BRASILIA","PORTUGUAIS",209300000),ARGENTINE("BUENOS AIRES","ESPAGNOL",44270000),QATAR("DOHA","ARABE",2639000),COLOMBIE("BOGOTA","ESPAGNOL",49070000),CANADA("OTTAWA","ANGLAIS",37590000),MEXIQUE("MEXICO","ESPAGNOL",129200000),JAPON("TOKYO","JAPONAIS",126800000 ),THAILANDE("BANGKOK","THAI",69040000) ;
private String NomCap;
private String langue;
private int habitant ;
Pays(String NomCap,String langue, int habitant){
	this.NomCap=NomCap;
	this.langue=langue;
	this.habitant=habitant;
}


	
public static void affiche() {
	for(Pays p :Pays.values()) {
		System.out.println(p);
	}
}
public static boolean accepteChaine(String ch) {
	boolean y=false;
	for(Pays p :Pays.values()) {
		if (p.name().equals(ch)==true) {
			y=true;
			
		}
	}
	return y;
}
public static String getpays(int numéro) {
	for (Pays p:Pays.values()) {
		if (p.ordinal()==numéro) {
			return p.name();
		}}
	return null;
}
public static void afficher(Pays p) {
	System.out.println( "nom de la capitale : "+p.NomCap +" / langue officielle : "+p.langue+" / nombre d'habitant : "+p.habitant  );
}
public Pays RechercherParCap(String cap) {
	for (Pays p:Pays.values()) {
		if(p.NomCap.equals(cap)==true) {
			return p;
		}
	}
	return null;
}
public String getlangue() {
	    return langue;
}

}
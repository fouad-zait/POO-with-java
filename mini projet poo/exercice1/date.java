package exercice1;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class date {
	private int jour;
	private int mois ;
	private int ann�e;
	
	public date (int jour ,int mois ,int ann�e) {
	 this.jour=jour;
	 this.mois=mois;
	 this.ann�e=ann�e;
	}
	public date () {
	}
	public Boolean bisextile() {
		if ((ann�e % 4 == 0 && ann�e % 100 !=0 )|| ann�e % 400 ==0  ) {
			return true ;
			
		}
		else {
			return false ;
		}
		
	}
	
	public boolean  verifie( ) {
		boolean x=false ;
		
	if (ann�e>0 && jour >0) {
	if (jour<=31 && (mois==1 || mois==3  || mois ==5  || mois==7 ||mois==8 || mois==10 || mois==12 ))
			{	 x= true ;}
	else if (jour<=30 &&(mois==4 || mois==6  || mois ==9  || mois==11  )) {
	   x= true ;}
	else if (jour<=29 && mois==2 && this.bisextile()==true ) {
		x= true ;
	}
	else if (jour<=28 && mois==2 && this.bisextile()==false ) {
	x= true ;}
	}
	else {
		x= false; 
	}
	return x ;
	}
   public void affiche() {
	   
	   if (jour<10 && mois<10 && ann�e>=1000) {
	   System.out.println("la date est: 0"+jour +"-0"+mois+"-"+ann�e);
	   }
	   if (jour<10 && mois>10 && ann�e>=1000) {
		   System.out.println("la date est: 0"+jour +"-"+mois+"-"+ann�e);
		   }
	   if (jour>10 && mois<10 && ann�e>=1000) {
		   System.out.println("la date est: "+jour +"-0"+mois+"-"+ann�e);
		   }
	   if (jour<10 && mois<10 && 1000 >ann�e && ann�e>=100) {
		   System.out.println("la date est: 0"+jour +"-0"+mois+"-0"+ann�e);
		   }
		   if (jour<10 && mois>10 && 1000>ann�e &&ann�e>=100) {
			   System.out.println("la date est: 0"+jour +"-"+mois+"-0"+ann�e);
			   }
		   if (jour>10 && mois<10 && 1000>ann�e &&ann�e>=100) {
			   System.out.println("la date est: "+jour +"-0"+mois+"-0"+ann�e);
			   }
		   if (jour<10 && mois<10 && 100>ann�e &&ann�e>=10) {
			   System.out.println("la date est: 0"+jour +"-0"+mois+"-00"+ann�e);
			   }
			   if (jour<10 && mois>10 && 100>ann�e && ann�e>=10) {
				   System.out.println("la date est: 0"+jour +"-"+mois+"-00"+ann�e);
				   }
			   if (jour>10 && mois<10 && 100>ann�e && ann�e>=10) {
				   System.out.println("la date est: "+jour +"-0"+mois+"-00"+ann�e);
				   }
			   if (jour<10 && mois<10 && ann�e<10 && ann�e>=1) {
				   System.out.println("la date est: 0"+jour +"-0"+mois+"-000"+ann�e);
				   }
				   if (jour<10 && mois>10 && ann�e<10 && ann�e>=1) {
					   System.out.println("la date est: 0"+jour +"-"+mois+"-000"+ann�e);
					   }
				   if (jour>10 && mois<10 && ann�e<10 &&ann�e>=1) {
					   System.out.println("la date est: "+jour +"-0"+mois+"-000"+ann�e);
					   }
   }
       public void saisir () {
    	boolean y=false;
    	   while (y==false) {
    		   System.out.println("donner le jour : ");
	      		Scanner date =new Scanner(System.in);
    		     this.jour = date.nextInt();
    		   System.out.println("donner le mois : ");

    		   this.mois = date.nextInt();
    		   System.out.println("donner l'ann�e : ");

              this.ann�e = date.nextInt();
    	     
                 y=this.verifie();
       }}
       public boolean inferieure(date date2) {
    	   boolean x=false ;
       if(this.ann�e<date2.ann�e) {
       x= true ;}
       else if (this.ann�e>date2.ann�e) {
    	   x= false ;}
       else {
    	   if(this.mois<date2.mois) {
    		   x= true;
    	   }
    	   else if (this.mois>date2.mois){
    		   x= false;}
    	   else {
    		   if (this.jour<date2.jour) {
    			  x= true ;}
    		   else if (this.jour>date2.jour) {
    			   x= false;}
    		   
    		   }
    		   
       }
       return x;
       }
       
       public boolean superieure(date date2) {
    	   boolean x=false ;
       if(this.ann�e>date2.ann�e) {
       x= true ;}
       else if (this.ann�e<date2.ann�e) {
    	   x= false ;}
       else {
    	   if(this.mois>date2.mois) {
    		   x= true;
    	   }
    	   else if (this.mois<date2.mois){
    		   x= false;}
    	   else {
    		   if (this.jour>date2.jour) {
    			  x= true ;}
    		   else if (this.jour<date2.jour) {
    			   x= false;}
    		   
    		   }
    		   
    	   }   
    	return x;   
    	   
       }
       public static int compare(date date1 ,date date2) {
    	   if (date1.ann�e<date2.ann�e) {
    		   return -1 ;
    	   }
    	   else if (date1.ann�e>date2.ann�e) {
    		 return 1;  
    	   }
    	   else {
    		   if (date1.mois<date2.mois) {
    			   return -1;
    		   }
    		   else if (date1.mois>date2.mois) {
    			   return 1;
    		   } 
    		   else {
    			   if (date1.jour<date2.jour) {
    				   return -1;
    			   }
    			   else if(date1.jour>date2.jour) {
    				   return 1;
    			   }
    			   else { return 0;
    		   }
    		   }}}
         public int compareto(date date1) {
        	 if (this.inferieure(date1)==true) {
        		 return -1;
        	 }
        	 else if (this.superieure(date1)==true) {
        		 return 1;
        	 }
        	 else { return 0;
        		 
        	 }
         }
         public date  Aujourdhui() {
        	 Date d =new Date ();
            this.ann�e=d.getYear()+1900;
            this.mois=d.getMonth()+1;
            this.jour=d.getDate();
            return this ;
         }
         public date lendemain() {
        	 Date d=new Date();
        	 date d1=new date();
        	 this.ann�e=d.getYear()+1900;
        	 this.mois=d.getMonth()+1;
        	 this.jour=d.getDate();
        	 if ((jour>=1 && jour<31 && (mois ==1 || mois==3 ||mois==5 ||mois==7 ||mois==8||mois==10 ||mois==12))||(jour>=1 && jour<30 && (mois ==4 || mois==6 ||mois==9 ||mois==11))|| ( jour>=1 && jour<29 && mois==2 && this.bisextile()==true  )|| (jour>=1 && jour<28 && mois ==2 && this.bisextile()==false) )   {                      
        	 
        		   d1.jour = jour+1;
        		   d1.mois=mois;
        		   d1.ann�e=ann�e;}
            else if( (jour==31 && (mois ==1 || mois==3 ||mois==5 ||mois==7 ||mois==8||mois==10 ) )|| (jour== 30 && (mois ==4 || mois==6 ||mois==9 ||mois==11))|| (jour==29 && mois==2 && this.bisextile()==true)|| (jour==28 && mois==2 && this.bisextile()==false)) {
        		   
        	       d1.jour=1;
        	       d1.mois=mois+1;
        	       d1.ann�e=ann�e;}
            else {
            	d1.jour=1;
        	    d1.mois=1;
        	    d1.ann�e=ann�e+1;
         }
        	 return d1;
        	 }
         public date dateApr�s(int nb) {
        	 
        	 Calendar cal =new GregorianCalendar(this.ann�e,this.mois-1,this.jour);
             cal.add(Calendar.DATE,nb);
             
             Date d=  cal.getTime();
                    this.jour=d.getDate();
                    this.mois=d.getMonth()+1;
                    this.ann�e=d.getYear()+1900;
           System.out.println("la date apr�s le nombre  "+nb+" est "+ this.jour +"-"+this.mois+"-"+this.ann�e  );
           return this ;
                 }
         public static date dateApr�s(date d,int nb) {
        	 Calendar cal =new GregorianCalendar(d.ann�e,d.mois-1,d.jour);
             cal.add(Calendar.DATE,nb);
             Date d1=  cal.getTime();
                    d.jour=d1.getDate();
                    d.mois=d1.getMonth()+1;
                    d.ann�e=d1.getYear()+1900;
                   
           return d ;
                 }
         
         public date dateAvant(int nb) {
        	 
        	 Calendar cal =new GregorianCalendar(this.ann�e,this.mois-1,this.jour);
             cal.add(Calendar.DATE,-nb);
             
             Date d=  cal.getTime();
                    this.jour=d.getDate();
                    this.mois=d.getMonth()+1;
                    this.ann�e=d.getYear()+1900;
           System.out.println("la date avant le nombre  "+nb+" est "+ this.jour +"-"+this.mois+"-"+this.ann�e  );
           return this ;
                 }
         
         public String tostring() {
        	 
        	return this.toString();
   		 }
         
        	 
         }
        	 
         
         
         

         
         
         
         
         
         
         
         
         
         
         
         
         
         

    		   
    		   
    		   
    		   
    		   
    		   
    	
       
        
    	   
    	   
    	   
       
    	   

   

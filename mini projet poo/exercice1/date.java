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
	private int année;
	
	public date (int jour ,int mois ,int année) {
	 this.jour=jour;
	 this.mois=mois;
	 this.année=année;
	}
	public date () {
	}
	public Boolean bisextile() {
		if ((année % 4 == 0 && année % 100 !=0 )|| année % 400 ==0  ) {
			return true ;
			
		}
		else {
			return false ;
		}
		
	}
	
	public boolean  verifie( ) {
		boolean x=false ;
		
	if (année>0 && jour >0) {
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
	   
	   if (jour<10 && mois<10 && année>=1000) {
	   System.out.println("la date est: 0"+jour +"-0"+mois+"-"+année);
	   }
	   if (jour<10 && mois>10 && année>=1000) {
		   System.out.println("la date est: 0"+jour +"-"+mois+"-"+année);
		   }
	   if (jour>10 && mois<10 && année>=1000) {
		   System.out.println("la date est: "+jour +"-0"+mois+"-"+année);
		   }
	   if (jour<10 && mois<10 && 1000 >année && année>=100) {
		   System.out.println("la date est: 0"+jour +"-0"+mois+"-0"+année);
		   }
		   if (jour<10 && mois>10 && 1000>année &&année>=100) {
			   System.out.println("la date est: 0"+jour +"-"+mois+"-0"+année);
			   }
		   if (jour>10 && mois<10 && 1000>année &&année>=100) {
			   System.out.println("la date est: "+jour +"-0"+mois+"-0"+année);
			   }
		   if (jour<10 && mois<10 && 100>année &&année>=10) {
			   System.out.println("la date est: 0"+jour +"-0"+mois+"-00"+année);
			   }
			   if (jour<10 && mois>10 && 100>année && année>=10) {
				   System.out.println("la date est: 0"+jour +"-"+mois+"-00"+année);
				   }
			   if (jour>10 && mois<10 && 100>année && année>=10) {
				   System.out.println("la date est: "+jour +"-0"+mois+"-00"+année);
				   }
			   if (jour<10 && mois<10 && année<10 && année>=1) {
				   System.out.println("la date est: 0"+jour +"-0"+mois+"-000"+année);
				   }
				   if (jour<10 && mois>10 && année<10 && année>=1) {
					   System.out.println("la date est: 0"+jour +"-"+mois+"-000"+année);
					   }
				   if (jour>10 && mois<10 && année<10 &&année>=1) {
					   System.out.println("la date est: "+jour +"-0"+mois+"-000"+année);
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
    		   System.out.println("donner l'année : ");

              this.année = date.nextInt();
    	     
                 y=this.verifie();
       }}
       public boolean inferieure(date date2) {
    	   boolean x=false ;
       if(this.année<date2.année) {
       x= true ;}
       else if (this.année>date2.année) {
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
       if(this.année>date2.année) {
       x= true ;}
       else if (this.année<date2.année) {
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
    	   if (date1.année<date2.année) {
    		   return -1 ;
    	   }
    	   else if (date1.année>date2.année) {
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
            this.année=d.getYear()+1900;
            this.mois=d.getMonth()+1;
            this.jour=d.getDate();
            return this ;
         }
         public date lendemain() {
        	 Date d=new Date();
        	 date d1=new date();
        	 this.année=d.getYear()+1900;
        	 this.mois=d.getMonth()+1;
        	 this.jour=d.getDate();
        	 if ((jour>=1 && jour<31 && (mois ==1 || mois==3 ||mois==5 ||mois==7 ||mois==8||mois==10 ||mois==12))||(jour>=1 && jour<30 && (mois ==4 || mois==6 ||mois==9 ||mois==11))|| ( jour>=1 && jour<29 && mois==2 && this.bisextile()==true  )|| (jour>=1 && jour<28 && mois ==2 && this.bisextile()==false) )   {                      
        	 
        		   d1.jour = jour+1;
        		   d1.mois=mois;
        		   d1.année=année;}
            else if( (jour==31 && (mois ==1 || mois==3 ||mois==5 ||mois==7 ||mois==8||mois==10 ) )|| (jour== 30 && (mois ==4 || mois==6 ||mois==9 ||mois==11))|| (jour==29 && mois==2 && this.bisextile()==true)|| (jour==28 && mois==2 && this.bisextile()==false)) {
        		   
        	       d1.jour=1;
        	       d1.mois=mois+1;
        	       d1.année=année;}
            else {
            	d1.jour=1;
        	    d1.mois=1;
        	    d1.année=année+1;
         }
        	 return d1;
        	 }
         public date dateAprés(int nb) {
        	 
        	 Calendar cal =new GregorianCalendar(this.année,this.mois-1,this.jour);
             cal.add(Calendar.DATE,nb);
             
             Date d=  cal.getTime();
                    this.jour=d.getDate();
                    this.mois=d.getMonth()+1;
                    this.année=d.getYear()+1900;
           System.out.println("la date aprés le nombre  "+nb+" est "+ this.jour +"-"+this.mois+"-"+this.année  );
           return this ;
                 }
         public static date dateAprés(date d,int nb) {
        	 Calendar cal =new GregorianCalendar(d.année,d.mois-1,d.jour);
             cal.add(Calendar.DATE,nb);
             Date d1=  cal.getTime();
                    d.jour=d1.getDate();
                    d.mois=d1.getMonth()+1;
                    d.année=d1.getYear()+1900;
                   
           return d ;
                 }
         
         public date dateAvant(int nb) {
        	 
        	 Calendar cal =new GregorianCalendar(this.année,this.mois-1,this.jour);
             cal.add(Calendar.DATE,-nb);
             
             Date d=  cal.getTime();
                    this.jour=d.getDate();
                    this.mois=d.getMonth()+1;
                    this.année=d.getYear()+1900;
           System.out.println("la date avant le nombre  "+nb+" est "+ this.jour +"-"+this.mois+"-"+this.année  );
           return this ;
                 }
         
         public String tostring() {
        	 
        	return this.toString();
   		 }
         
        	 
         }
        	 
         
         
         

         
         
         
         
         
         
         
         
         
         
         
         
         
         

    		   
    		   
    		   
    		   
    		   
    		   
    	
       
        
    	   
    	   
    	   
       
    	   

   

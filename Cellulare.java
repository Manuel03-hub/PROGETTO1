//Librerie
//import java.util.*;
public class Cellulare {
//Attributi
 String Modello;
 String Marca;
 double Credito;
 boolean Stato_acceso;
 
 //Metodi Costruttori
 public Cellulare(){}
 public Cellulare(String Modello,String Marca, double Credito, boolean Stato_acceso)
 {
 this.Modello=Modello;
 this.Marca=Marca;
 this.Credito=Credito;
 this.Stato_acceso=Stato_acceso;
 }
 
 public Cellulare(String Modello,String Marca, double Credito)
 {
 this.Modello=Modello;
 this.Marca=Marca;
 this.Credito=Credito;
 this.Stato_acceso=false;
 }
 
  public void Stampa()
  {
  System.out.println("Il modello del cellulare : "+ Modello +"   la marca del cellulare: "+ Marca + "    Il credito del cellulare e': "+ Credito + "   Stato "+ Stato_acceso);
  }
  
  // Ricarica
  public void Ricarica(double importo)
  {
  if(importo<0.00){
   System.out.println("Credito insufficiente Non puoi effettuare la ricarica ");  
  }
  else
  {
   Credito=Credito+importo;
  System.out.println(" Il nuovo credito risulta: " + Credito);
  System.out.println(" ho caricato: " + importo);
  }
  }
    public static void main(String[] args) {
      Cellulare mio1=new Cellulare();
        mio1.Modello="Galaxy A2";
        mio1.Marca="Samsung";
        mio1.Credito=12.90;
        mio1.Stato_acceso=false;
        mio1.Stampa();
        
     Cellulare mio2=new Cellulare("Oppo","K21", 50.30, true); 
     mio2.Stampa();
     mio2.Ricarica(20.00);
     mio2.Stampa();   
    }
    
}
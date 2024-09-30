package main;

import modell.JatekModell;
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;


public class KincsesLada {

   
    public static void main(String[] args) {
        //new JatekModell();
        
        JatekModell modell = new JatekModell();
        KonzolNezet nezet = new KonzolNezet();
        
        new KonzolVezerlo(modell, nezet);
        
        
    }
    
}

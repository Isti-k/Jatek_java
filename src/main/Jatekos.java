package main;

import java.util.Random;

public class Jatekos {
    /* ADATTAGOK */
    static Random rnd = new Random();
    int tipp;
    
    /* TAGFÜGGVÉNYEK */
    public int getTipp(){
        return tipp;
    }
    
    
    void tippel(){
        // A privát miatt nem elérhető  a final MAX
        tipp = Jatekos.rnd.nextInt(Jatek.getMAX()+1);
        System.out.println("tippelésem: " + tipp);
    }
}

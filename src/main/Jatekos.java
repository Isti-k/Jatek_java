package main;

import java.util.Random;

public class Jatekos {
    /* ADATTAGOK */
    static Random rnd = new Random();
    int tipp;
    
    /* TAGFÜGGVÉNYEK */
    void tippel(){
        tipp = Jatekos.rnd.nextInt(Jatek.MAX+1);
        System.out.println("tippelésem: " + tipp);
    }
}

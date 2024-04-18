package main;

import java.util.Random;

public class Jatek {
    /* ADATTAGOK */
    static Random rnd = new Random();
    static final int MAX = 9;
    
    /* TAGFÜGGVÉNYEK */  
    /* Konstruktor
      - ua. neve, mint az osztálynak
      - nincs típusa, void sem
      - akkor is van, ha nem írtuk meg, ez az alapértelmezett konstruktor
    */
    public Jatek() {
        start();
    }
    
    void start(){
        System.out.printf("Gondoltam egy számra, 0 és %d között...",MAX);
        
        int szam = rnd.nextInt(MAX+1);
        Jatekos jatekos1 = new Jatekos();
        Jatekos jatekos2 = new Jatekos();
        Jatekos jatekos3 = new Jatekos();
        boolean tipp1Jo, tipp2Jo, tipp3Jo;
        
        boolean vanNyertes;
        do {
            /* PROBLÉMA: többször példányosítunk, ez
             - időigényes (CPU)
             - minde korábbi jatekos1 beállitas resetelődik, hiszen újra példányosítjuk
            Jatekos jatekos1 = new Jatekos();
            */
            System.out.println("a kitalálandó szám: " + szam);
            /* ez jó, de nem OOP */
            //int tipp1 = jatekos1.tippel();
            
            jatekos1.tippel();     
            jatekos2.tippel();
            jatekos3.tippel();
            
            /* HIBÁS megoldások: */
            //System.out.print("1. játékos tippje: ");
            //new Jatekos().tippel();//4. játékos!

            /* a jatekos1 KÉTSZER tippel: */
            //System.out.print("1. játékos tippje: " + jatekos1.tippel());//ha int tippel()

            System.out.println("1. játékos tippje: " + jatekos1.tipp);
            System.out.println("2. játékos tippje: " + jatekos2.tipp);
            System.out.println("3. játékos tippje: " + jatekos3.tipp);
        
            tipp1Jo = jatekos1.tipp == szam;
            tipp2Jo = jatekos2.tipp == szam;
            tipp3Jo = jatekos3.tipp == szam;
            vanNyertes = tipp1Jo || tipp2Jo || tipp3Jo;
            if(!vanNyertes){
                System.out.println("a játékosok újra próbálkoznak!");
            }
        
        } while (!vanNyertes);
        
        System.out.println("van nyertes!");
        System.out.println("1. játékos tippje jó? " + tipp1Jo);
        System.out.println("2. játékos tippje jó? " + tipp2Jo);
        System.out.println("3. játékos tippje jó? " + tipp3Jo);
        
        System.out.println("program vége");
    }
    
}

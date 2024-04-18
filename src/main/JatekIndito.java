package main;

public class JatekIndito {

    public static void main(String[] args) {
        /* nincs referencia az objektumra, 
        referencia nélkül hívjuk az objektum metódusát: */
        //new Jatek().start();
        
        /* adunk referenciát az objektumra: */
        //Jatek referencia = new Jatek();
        /* a referencián keresztül elérjük az objektum tagfüggvényeit: */
        //referencia.start();
        
        /* nincs referencia, csak az objektum konstruktorát hívjuk: */
        new Jatek();
        
        /* Ez a Jatek-ba kell */
        /* 3 játékos tippel: */
//        new Jatekos().tippel();
//        new Jatekos().tippel();
//        new Jatekos().tippel();
        
        /* HIBA: */
        /* 1 játékos tippel háromszor */
//        Jatekos j = new Jatekos();
//        j.tippel();
//        j.tippel();
//        j.tippel();
    }
}

package laskin.laskin;

import javax.swing.JTextField;

public class Logiikka {

    public Logiikka() {

    }

    public int summa(int luku1, int luku2) {
        return luku1 + luku2;
    }

    public int erotus(int luku1, int luku2) {
        return luku2 - luku1;
    }

    public int nollaus() {
        return 0;
    }

    public double jako(int luku1, int luku2) {
        return (double) luku2 / luku1;
    }

    public int kerto(int luku1, int luku2) {
        return luku2 * luku1;
    }

    public double nelioJuuri(double luku) {
        return Math.sqrt(luku);
    }

    public int nelio(int luku) {
        return luku * luku;
    }
    
    public double logaritmi(double luku) {
        return Math.log10(luku);
    }
    
    public int kertoma(int luku ){
        if(luku <= 1) {
            return 1;
        } else {
            return luku * kertoma(luku - 1);
        }
    }
}

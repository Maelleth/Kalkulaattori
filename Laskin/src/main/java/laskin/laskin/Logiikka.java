package laskin.laskin;

import javax.swing.JTextField;

/**
 * Luokka tarjoaa laskimen laskutoimituksiin tarvittavia metodeita.
 */
public class Logiikka {

    public Logiikka() {

    }

    /**
     * Metodi laskee yhteen kaksi lukua.
     *
     * @param luku1 Käyttäjän antama lukusyöte
     * @param luku2 Tuloskentässä oleva luku
     *
     * @return lukujen summa
     */
    public int summa(int luku1, int luku2) {
        return luku1 + luku2;
    }

    /**
     * Metodi laskee kahden luvun erotuksen.
     *
     * @param luku1 Käyttäjän antama lukusyöte
     * @param luku2 Tuloskentässä oleva luku
     *
     * @return lukujen erotus
     */
    public int erotus(int luku1, int luku2) {
        return luku2 - luku1;
    }

    /**
     * Metodi palauttaa luvun nolla.
     *
     * @return nolla
     */
    public int nollaus() {
        return 0;
    }

    /**
     * Metodi jakaa tuloskentässä olevan luvun käyttäjän syöttämällä luvulla.
     *
     * @param luku1 Käyttäjän antama lukusyöte
     * @param luku2 Tuloskentässä oleva luku
     *
     * @return lukujen jakolasku
     */
    public double jako(int luku1, int luku2) {
        return (double) luku2 / luku1;
    }

    /**
     * Metodi kertoo tuloskentässä olevan luvun käyttäjän syöttämällä luvulla.
     *
     * @param luku1 Käyttäjän antama lukusyöte
     * @param luku2 Tuloskentässä oleva luku
     *
     * @return lukujen kertolasku
     */
    public int kerto(int luku1, int luku2) {
        return luku2 * luku1;
    }

    /**
     * Metodi laskee käyttäjän syöttämän luvun neliöjuuren.
     *
     * @param luku Käyttäjän antama lukusyöte
     *
     * @return luvun neliöjuuri jos luku on suurempi kuin nolla
     */
    public double nelioJuuri(int luku) {
        if (luku > 0) {
            return Math.sqrt(luku);
        } else {
            return 0;
        }
    }

    /**
     * Metodi laskee käyttäjän syöttämän luvun neliön.
     *
     * @param luku Käyttäjän antama lukusyöte
     *
     * @return luvun neliö
     */
    public int nelio(int luku) {
        return luku * luku;
    }

    /**
     * Metodi laskee käyttäjän syöttämän luvun kymmenkantaisen logaritmin.
     *
     * @param luku Käyttäjän antama lukusyöte
     *
     * @return luvun kymmenkantainen logaritmi
     */
    public double logaritmi(int luku) {
        return Math.log10(luku);
    }

    /**
     * Metodi laskee käyttäjän syöttämän luvun kertoman.
     *
     * @param luku Käyttäjän antama lukusyöte
     *
     * @return luvun kertoma
     */
    public int kertoma(int luku) {
        if (luku <= 1) {
            return 1;
        } else {
            return luku * kertoma(luku - 1);
        }
    }
}

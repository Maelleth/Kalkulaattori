package laskin.laskin;

public class LaskinUtil {

    /**
     * Utility-luokka apumetodille.
     */
    public LaskinUtil() {

    }

    /**
     * Metodi tarkistaa onko annettu merkkijono double kun se muutetaan luvuksi.
     *
     * @param s Käyttäjän antama syöte
     *
     * @return true jos merkkijonon voi muuntaa double luvuksi
     */
    public static boolean onDouble(String s) {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

}

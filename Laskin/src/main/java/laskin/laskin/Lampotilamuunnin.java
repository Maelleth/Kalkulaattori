package laskin.laskin;

/**
 * Luokan metodit muuntavat Celsiuksia, Fahrenheiteja ja Kelvinejä keskenään.
 */
public class Lampotilamuunnin {

    /**
     * Lampotilamuuntimen konstruktori.
     */
    public Lampotilamuunnin() {

    }

    /**
     * Metodi muuntaa käyttäjän syöttämän luvun eli Celsiukset Fahrenheiteiksi.
     *
     * @param celsius Käyttäjän antama lukusyöte
     *
     * @return luku muunnettuna Fahrenheiteiksi
     */
    public double celsiuksestaFahrenheitiin(double celsius) {
        return celsius * 1.8 + 32;
    }
    
    /**
     * Metodi muuntaa käyttäjän syöttämän luvun eli Celsiukset Kelvineiksi.
     *
     * @param celsius Käyttäjän antama lukusyöte
     *
     * @return luku muunnettuna Kelvineiksi
     */
    public double celsiuksestaKelviniin(double celsius) {
        return celsius + 273.15;
    }

    /**
     * Metodi muuntaa käyttäjän syöttämän luvun eli Fahrenheitit Celsiuksiksi.
     *
     * @param fahrenheit Käyttäjän antama lukusyöte
     *
     * @return luku muunnettuna Celsiuksiksi
     */
    public double fahrenheitistaCelsiukseen(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    /**
     * Metodi muuntaa käyttäjän syöttämän luvun eli Fahrenheitit Kelvineiksi.
     *
     * @param fahrenheit Käyttäjän antama lukusyöte
     *
     * @return luku muunnettuna Kelvineiksi
     */
    public double fahrenheitistaKelviniin(double fahrenheit) {
        return (fahrenheit + 459.67) / 1.8;
    }

    /**
     * Metodi muuntaa käyttäjän syöttämän luvun eli Kelvinit Celsiuksiksi.
     *
     * @param kelvin Käyttäjän antama lukusyöte
     *
     * @return luku muunnettuna Celsiuksiksi
     */
    public double kelvinistaCelsiukseen(double kelvin) {
        return kelvin - 273.15;
    }

    /**
     * Metodi muuntaa käyttäjän syöttämän luvun eli Kelvinit Fahrenheiteiksi.
     *
     * @param kelvin Käyttäjän antama lukusyöte
     *
     * @return luku muunnettuna Fahrenheiteiksi
     */
    public double kelvinistaFahrenheitiin(double kelvin) {
        return kelvin * 1.8 - 459.67;
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

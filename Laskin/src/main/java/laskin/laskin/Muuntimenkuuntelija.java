package laskin.laskin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * Luokka on napinkuuntelija napeille joilla muunnetaan lämpötiloja Celsiuksien,
 * Fahrenheitien ja Kelvinien välillä.
 */
public class Muuntimenkuuntelija implements ActionListener {

    private JTextField tulos;
    private JTextField syote;
    private JButton cF;
    private JButton cK;
    private JButton fC;
    private JButton fK;
    private JButton kC;
    private JButton kF;
    private Lampotilamuunnin muunnin;
    
    /**
     * Muuntimenkuuntelijan konstruktori.
     * 
     * @param tulos Laskutoimituksen tuloksen näyttävä tekstikenttä
     * @param syote Tekstikenttä johon käyttäjä syöttää luvun
     * @param cF Nappi joka muuntaa Celsiukset Fahrenheitiksi
     * @param cK Nappi joka muuntaa Celsiukset Kelvineiksi
     * @param fC Nappi joka muuntaa Fahrenheitit Celsiuksiksi
     * @param fK Nappi joka muuntaa Fahrenheitit Kelvineiksi
     * @param kC Nappi joka muuntaa Kelvinit Celsiuksiksi
     * @param kF Nappi joka muuntaa Kelvinit Fahrenheitiksi
     */
    public Muuntimenkuuntelija(JTextField tulos, JTextField syote, JButton cF, JButton cK,
            JButton fC, JButton fK, JButton kC, JButton kF) {

        this.tulos = tulos;
        this.syote = syote;
        this.cF = cF;
        this.cK = cK;
        this.fC = fC;
        this.fK = fK;
        this.kC = kC;
        this.kF = kF;

        this.muunnin = new Lampotilamuunnin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (onDouble(syote.getText())) {

            double lampotila = Double.parseDouble(syote.getText());

            if (e.getSource() == cF) {
                tulos.setText("" + muunnin.celsiuksestaFahrenheitiin(lampotila));
                syote.setText("");
            } else if (e.getSource() == cK) {
                tulos.setText("" + muunnin.celsiuksestaKelviniin(lampotila));
                syote.setText("");
            } else if (e.getSource() == fC) {
                tulos.setText("" + muunnin.fahrenheitistaCelsiukseen(lampotila));
                syote.setText("");
            } else if (e.getSource() == fK) {
                tulos.setText("" + muunnin.fahrenheitistaKelviniin(lampotila));
                syote.setText("");
            } else if (e.getSource() == kC) {
                tulos.setText("" + muunnin.kelvinistaCelsiukseen(lampotila));
                syote.setText("");
            } else if (e.getSource() == kF) {
                tulos.setText("" + muunnin.kelvinistaFahrenheitiin(lampotila));
                syote.setText("");
            }
        } else {
            syote.setText("");
        }
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

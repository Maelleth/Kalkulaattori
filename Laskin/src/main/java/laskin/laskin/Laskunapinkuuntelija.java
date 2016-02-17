package laskin.laskin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Luokka on napinkuuntelija tavallisille laskutoimitusnapeille.
 */
public class Laskunapinkuuntelija implements ActionListener {

    private JTextField tulos;
    private JTextField syote;
    private JButton summa;
    private JButton erotus;
    private JButton nollaus;
    private JButton jako;
    private JButton kerto;
    private JButton nelioJuuri;
    private JButton nelio;
    private JButton logaritmi;
    private JButton kertoma;
    private Logiikka logiikka;

    public Laskunapinkuuntelija(JTextField tulos, JTextField syote, JButton summa, JButton erotus, JButton nollaus,
            JButton jako, JButton kerto, JButton nelioJuuri, JButton nelio, JButton logaritmi, JButton kertoma) {

        this.tulos = tulos;
        this.syote = syote;
        this.summa = summa;
        this.erotus = erotus;
        this.nollaus = nollaus;
        this.jako = jako;
        this.kerto = kerto;
        this.nelioJuuri = nelioJuuri;
        this.nelio = nelio;
        this.logaritmi = logaritmi;
        this.kertoma = kertoma;

        this.logiikka = new Logiikka();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (onDouble(syote.getText())) {

            double luku1 = Double.parseDouble(syote.getText());
            double luku2 = Double.parseDouble(tulos.getText());

            if (e.getSource() == summa) {
                tulos.setText("" + (logiikka.summa(luku1, luku2)));
                syote.setText("");
            } else if (e.getSource() == erotus) {
                tulos.setText("" + (logiikka.erotus(luku1, luku2)));
                syote.setText("");
            } else if (e.getSource() == jako) {
                tulos.setText("" + (logiikka.jako(luku1, luku2)));
                syote.setText("");
            } else if (e.getSource() == kerto) {
                tulos.setText("" + (logiikka.kerto(luku1, luku2)));
                syote.setText("");
            } else if (e.getSource() == nollaus) {
                tulos.setText("" + (logiikka.nollaus()));
                syote.setText("");
            } else if (e.getSource() == nelioJuuri) {
                tulos.setText("" + (logiikka.nelioJuuri(luku1)));
                syote.setText("");
            } else if (e.getSource() == nelio) {
                tulos.setText("" + (logiikka.nelio(luku1)));
                syote.setText("");
            } else if (e.getSource() == logaritmi) {
                tulos.setText("" + (logiikka.logaritmi(luku1)));
                syote.setText("");
            } else if (e.getSource() == kertoma) {
                tulos.setText("" + (logiikka.kertoma(luku1)));
                syote.setText("");
            }
        } else if (e.getSource() == nollaus) {
            syote.setText("");
            tulos.setText("" + (logiikka.nollaus()));
        } else {
            syote.setText("");
        }

        if (tulos.getText().equals("0.0")) {
            nollaus.setEnabled(false);
        } else {
            nollaus.setEnabled(true);
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

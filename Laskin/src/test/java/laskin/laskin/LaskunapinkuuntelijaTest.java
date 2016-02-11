package laskin.laskin;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Sara
 */
public class LaskunapinkuuntelijaTest {

    Laskunapinkuuntelija kuuntelija;
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

    public LaskunapinkuuntelijaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.tulos = new JTextField();
        this.syote = new JTextField();
        this.summa = new JButton();
        this.erotus = new JButton();
        this.nollaus = new JButton();
        this.jako = new JButton();
        this.kerto = new JButton();
        this.nelioJuuri = new JButton();
        this.nelio = new JButton();
        this.logaritmi = new JButton();
        this.kertoma = new JButton();

        this.kuuntelija = new Laskunapinkuuntelija(tulos, syote, summa, erotus, nollaus,
                jako, kerto, nelioJuuri, nelio, logaritmi, kertoma);
        this.logiikka = new Logiikka();
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void nollausToimii() {
        ActionEvent ae = new ActionEvent(nollaus, 1, "");
        tulos.setText("30");
        kuuntelija.actionPerformed(ae);
        assertEquals("0.0", tulos.getText());
    }

    @Test
    public void summaToimii1() {
        ActionEvent ae = new ActionEvent(summa, 1, "");
        tulos.setText("0");
        syote.setText("20");
        kuuntelija.actionPerformed(ae);
        assertEquals("20.0", tulos.getText());
    }
    
    @Test
    public void summaToimii2() {
        ActionEvent ae = new ActionEvent(summa, 1, "");
        tulos.setText("-50");
        syote.setText("10");
        kuuntelija.actionPerformed(ae);
        assertEquals("-40.0", tulos.getText());
    }
    
    @Test
    public void erotusToimii1() {
        ActionEvent ae = new ActionEvent(erotus, 1, "");
        tulos.setText("0");
        syote.setText("78");
        kuuntelija.actionPerformed(ae);
        assertEquals("-78.0", tulos.getText());
    }
    
    @Test
    public void erotusToimii2() {
        ActionEvent ae = new ActionEvent(erotus, 1, "");
        tulos.setText("0");
        syote.setText("6");
        kuuntelija.actionPerformed(ae);
        assertEquals("-6.0", tulos.getText());
    }
}

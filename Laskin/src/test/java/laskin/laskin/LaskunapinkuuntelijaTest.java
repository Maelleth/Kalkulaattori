package laskin.laskin;

import laskin.laskin.logiikat.Logiikka;
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
    
    @Test
    public void jakoToimii1() {
        ActionEvent ae = new ActionEvent(jako, 1, "");
        tulos.setText("100");
        syote.setText("4");
        kuuntelija.actionPerformed(ae);
        assertEquals("25.0", tulos.getText());
    }
    
    @Test
    public void jakoToimii2() {
        ActionEvent ae = new ActionEvent(jako, 1, "");
        tulos.setText("60");
        syote.setText("10");
        kuuntelija.actionPerformed(ae);
        assertEquals("6.0", tulos.getText());
    }
    
    @Test
    public void kertoToimii1() {
        ActionEvent ae = new ActionEvent(kerto, 1, "");
        tulos.setText("90");
        syote.setText("2");
        kuuntelija.actionPerformed(ae);
        assertEquals("180.0", tulos.getText());
    }
    
    @Test
    public void kertoToimii2() {
        ActionEvent ae = new ActionEvent(kerto, 1, "");
        tulos.setText("13");
        syote.setText("3");
        kuuntelija.actionPerformed(ae);
        assertEquals("39.0", tulos.getText());
    }
    
    @Test
    public void nelioJuuriToimii1() {
        ActionEvent ae = new ActionEvent(nelioJuuri, 1, "");
        tulos.setText("0");
        syote.setText("9");
        kuuntelija.actionPerformed(ae);
        assertEquals("3.0", tulos.getText());
    }
    
    @Test
    public void nelioJuuriToimii2() {
        ActionEvent ae = new ActionEvent(nelioJuuri, 1, "");
        tulos.setText("10");
        syote.setText("-5");
        kuuntelija.actionPerformed(ae);
        assertEquals("0.0", tulos.getText());
    }
    
    @Test
    public void nelioToimii1() {
        ActionEvent ae = new ActionEvent(nelio, 1, "");
        tulos.setText("0");
        syote.setText("2");
        kuuntelija.actionPerformed(ae);
        assertEquals("4.0", tulos.getText());
    }
    
    @Test
    public void nelioToimii2() {
        ActionEvent ae = new ActionEvent(nelio, 1, "");
        tulos.setText("10");
        syote.setText("-5");
        kuuntelija.actionPerformed(ae);
        assertEquals("25.0", tulos.getText());
    }
    
    @Test
    public void logaritmiToimii() {
        ActionEvent ae = new ActionEvent(logaritmi, 1, "");
        tulos.setText("0");
        syote.setText("100");
        kuuntelija.actionPerformed(ae);
        assertEquals(""+ Math.log10(100), tulos.getText());
    }
    
    @Test
    public void kertomaToimii() {
        ActionEvent ae = new ActionEvent(kertoma, 1, "");
        tulos.setText("0");
        syote.setText("4");
        kuuntelija.actionPerformed(ae);
        assertEquals("24.0", tulos.getText());
    }
    
    @Test
    public void doubleTestausToimii() {
        ActionEvent ae = new ActionEvent(summa, 1, "");
        tulos.setText("0");
        syote.setText("moi");
        kuuntelija.actionPerformed(ae);
        assertEquals("", syote.getText());
    }
}

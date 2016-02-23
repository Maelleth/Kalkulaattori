
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
import laskin.laskin.logiikat.Lampotilamuunnin;

/**
 *
 * @author Sara
 */
public class MuuntimenkuuntelijaTest {
    
    private Muuntimenkuuntelija kuuntelija;
    private JTextField tulos;
    private JTextField syote;
    private JButton cF;
    private JButton cK;
    private JButton fC;
    private JButton fK;
    private JButton kC;
    private JButton kF;
    private Lampotilamuunnin muunnin;
    
    public MuuntimenkuuntelijaTest() {
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
        this.cF = new JButton();
        this.cK = new JButton();
        this.fC = new JButton();
        this.fK = new JButton();
        this.kC = new JButton();
        this.kF = new JButton();
        
        this.kuuntelija = new Muuntimenkuuntelija(tulos, syote, cF, cK, fC, fK, kC, kF);
        this.muunnin = new Lampotilamuunnin();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void celsiuksestaFahrenheitiinToimii() {
        ActionEvent ae = new ActionEvent(cF, 1, "");
        tulos.setText("0");
        syote.setText("22");
        kuuntelija.actionPerformed(ae);
        assertEquals("71.6", tulos.getText());
    }
    
    @Test
    public void celsiuksestaKelviniinToimii() {
        ActionEvent ae = new ActionEvent(cK, 1, "");
        tulos.setText("0");
        syote.setText("5");
        kuuntelija.actionPerformed(ae);
        assertEquals("278.15", tulos.getText());
    }
    
    @Test
    public void fahrenheitistaCelsiukseenToimii() {
        ActionEvent ae = new ActionEvent(fC, 1, "");
        tulos.setText("0");
        syote.setText("59");
        kuuntelija.actionPerformed(ae);
        assertEquals("15.0", tulos.getText());
    }
    
    @Test
    public void fahrenheitistaKelviniinToimii() {
        ActionEvent ae = new ActionEvent(fK, 1, "");
        tulos.setText("0");
        syote.setText("80.33");
        kuuntelija.actionPerformed(ae);
        assertEquals("300.0", tulos.getText());
    }
    
    @Test
    public void kelvinistaCelsiukseenToimii() {
        ActionEvent ae = new ActionEvent(kC, 1, "");
        tulos.setText("0");
        syote.setText("286.15");
        kuuntelija.actionPerformed(ae);
        assertEquals("13.0", tulos.getText());
    }
    
    @Test
    public void kelvinistaFahrenheitiinToimii() {
        ActionEvent ae = new ActionEvent(kF, 1, "");
        tulos.setText("0");
        syote.setText("300");
        kuuntelija.actionPerformed(ae);
        assertEquals("80.32999999999998", tulos.getText());
    }
    
    @Test
    public void doubleTestausToimii() {
        ActionEvent ae = new ActionEvent(cF, 1, "");
        tulos.setText("0");
        syote.setText("trololol");
        kuuntelija.actionPerformed(ae);
        assertEquals("", syote.getText());
    }

    
}

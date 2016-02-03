
package laskin.laskin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LampotilamuunninTest {
    
    Lampotilamuunnin muunnin;
    
    public LampotilamuunninTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        muunnin = new Lampotilamuunnin();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void celsiuksestaFahrenheitiinToimii1() {
        double vastaus = muunnin.celsiuksestaFahrenheitiin(24);
        assertEquals(75.2, vastaus, 0.01);
    }
    
    @Test
    public void celsiuksestaFahrenheitiinToimii2() {
        double vastaus = muunnin.celsiuksestaFahrenheitiin(0);
        assertEquals(32, vastaus, 0.01);
    }
    
    @Test
    public void celsiuksestaKelviniinToimii1() {
        double vastaus = muunnin.celsiuksestaKelviniin(15);
        assertEquals(288.15, vastaus, 0.01);
    }
    
    @Test
    public void celsiuksestaKelviniinToimii2() {
        double vastaus = muunnin.celsiuksestaKelviniin(60);
        assertEquals(333.15, vastaus, 0.01);
    }
    
    @Test
    public void fahrenheitistaCelsiukseenToimii1() {
        double vastaus = muunnin.fahrenheitistaCelsiukseen(100);
        assertEquals(37.777, vastaus, 0.01);
    }
    
    @Test
    public void fahrenheitistaCelsiukseenToimii2() {
        double vastaus = muunnin.fahrenheitistaCelsiukseen(15);
        assertEquals(-9.444, vastaus, 0.01);
    }
    
    @Test
    public void fahrenheitistaKelviniinToimii1() {
        double vastaus = muunnin.fahrenheitistaKelviniin(80);
        assertEquals(299.8166, vastaus, 0.01);
    }
    
    @Test
    public void fahrenheitistaKelviniinToimii2() {
        double vastaus = muunnin.fahrenheitistaKelviniin(37);
        assertEquals(275.9277, vastaus, 0.01);
    }
    
    @Test
    public void kelvinistaCelsiukseenToimii1() {
        double vastaus = muunnin.kelvinistaCelsiukseen(290);
        assertEquals(16.85, vastaus, 0.01);
    }
    
    @Test
    public void kelvinistaCelsiukseenToimii2() {
        double vastaus = muunnin.kelvinistaCelsiukseen(350);
        assertEquals(76.85, vastaus, 0.01);
    }
    
    @Test
    public void kelvinistaFahrenheitiinToimii1() {
        double vastaus = muunnin.kelvinistaFahrenheitiin(300);
        assertEquals(80.33, vastaus, 0.01);
    }
    
    @Test
    public void kelvinistaFahrenheitiinToimii2() {
        double vastaus = muunnin.kelvinistaFahrenheitiin(288);
        assertEquals(58.73, vastaus, 0.01);
    }

    
}

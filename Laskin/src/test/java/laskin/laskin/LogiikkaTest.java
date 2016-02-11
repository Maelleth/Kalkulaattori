
package laskin.laskin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LogiikkaTest {
    
    Logiikka logiikka;
    
    public LogiikkaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        logiikka = new Logiikka();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void nollausMetodiToimii() {
        assertEquals(0, logiikka.nollaus(), 0.01);
    }
    
    @Test
    public void summaMetodiToimii1() {
        double vastaus = logiikka.summa(0, 5);
        assertEquals(5, vastaus, 0.01);
    }
    
    @Test
    public void summaMetodiToimii2() {
        double vastaus = logiikka.summa(35, 27);
        assertEquals(62, vastaus, 0.01);
    }
    
    @Test
    public void summaMetodiToimii3() {
        double vastaus = logiikka.summa(-13, 2);
        assertEquals(-11, vastaus, 0.01);
    }
    
    @Test
    public void erotusMetodiToimii1() {
        double vastaus = logiikka.erotus(40, 50);
        assertEquals(10, vastaus, 0.01);
    }
    
    @Test
    public void erotusMetodiToimii2() {
        double vastaus = logiikka.erotus(14, 100);
        assertEquals(86, vastaus, 0.01);
    }
    
    @Test
    public void erotusMetodiToimii3() {
        double vastaus = logiikka.erotus(20, 6);
        assertEquals(-14, vastaus, 0.01);
    }
    
    @Test
    public void jakoMetodiToimii1() {
        double vastaus = logiikka.jako(4, 60);
        assertEquals(15, vastaus, 0.01);
    }
    
    @Test
    public void jakoMetodiToimii2() {
        double vastaus = logiikka.jako(7, 777);
        assertEquals(111, vastaus, 0.01);
    }
    
    @Test
    public void jakoMetodiToimii3() {
        double vastaus = logiikka.jako(3, 10);
        assertEquals(3.333333, vastaus, 0.01);
    }
    
    @Test
    public void kertoMetodiToimii1() {
        double vastaus = logiikka.kerto(8, 3);
        assertEquals(24, vastaus, 0.01);
    }
    
    @Test
    public void kertoMetodiToimii2() {
        double vastaus = logiikka.kerto(12, 9);
        assertEquals(108, vastaus, 0.01);
    }
    
    @Test
    public void nelioMetodiToimii1() {
        double vastaus = logiikka.nelio(2);
        assertEquals(4, vastaus, 0.01);
    }
    
    @Test
    public void nelioMetodiToimii2() {
        double vastaus = logiikka.nelio(15);
        assertEquals(225, vastaus, 0.01);
    }
    
    @Test
    public void nelioJuuriMetodiToimii1() {
        double vastaus = logiikka.nelioJuuri(36);
        assertEquals(6, vastaus, 0.01);
    }
    
    @Test
    public void nelioJuuriMetodiToimii2() {
        double vastaus = logiikka.nelioJuuri(9);
        assertEquals(3, vastaus, 0.01);
    }
    
    @Test
    public void nelioJuuriMetodiToimii3() {
        double vastaus = logiikka.nelioJuuri(5);
        assertEquals(Math.sqrt(5), vastaus, 0.01);
    }
    
    @Test
    public void logaritmiMetodiToimii1() {
        double vastaus = logiikka.logaritmi(20);
        assertEquals(Math.log10(20), vastaus, 0.01);
    }
    
    @Test
    public void logaritmiMetodiToimii2() {
        double vastaus = logiikka.logaritmi(100);
        assertEquals(2, vastaus, 0.01);
    }
    
    @Test
    public void logaritmiMetodiToimii3() {
        double vastaus = logiikka.logaritmi(75);
        assertEquals(Math.log10(75), vastaus, 0.01);
    }
    
    @Test
    public void kertomaMetodiToimii1() {
        double vastaus = logiikka.kertoma(3);
        assertEquals(6, vastaus, 0.01);
    }
    
    @Test
    public void kertomaMetodiToimii2() {
        double vastaus = logiikka.kertoma(5);
        assertEquals(120, vastaus, 0.01);
    }
    
    @Test
    public void kertomaMetodiToimii3() {
        double vastaus = logiikka.kertoma(8);
        assertEquals(40320, vastaus, 0.01);
    }
    
}


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
        assertEquals(0, logiikka.nollaus());
    }
    
    @Test
    public void summaMetodiToimii1() {
        int vastaus = logiikka.summa(0, 5);
        assertEquals(5, vastaus);
    }
    
    @Test
    public void summaMetodiToimii2() {
        int vastaus = logiikka.summa(35, 27);
        assertEquals(62, vastaus);
    }
    
    @Test
    public void summaMetodiToimii3() {
        int vastaus = logiikka.summa(-13, 2);
        assertEquals(-11, vastaus);
    }
    
    @Test
    public void erotusMetodiToimii1() {
        int vastaus = logiikka.erotus(40, 50);
        assertEquals(10, vastaus);
    }
    
    @Test
    public void erotusMetodiToimii2() {
        int vastaus = logiikka.erotus(14, 100);
        assertEquals(86, vastaus);
    }
    
    @Test
    public void erotusMetodiToimii3() {
        int vastaus = logiikka.erotus(20, 6);
        assertEquals(-14, vastaus);
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
        int vastaus = logiikka.kerto(8, 3);
        assertEquals(24, vastaus);
    }
    
    @Test
    public void kertoMetodiToimii2() {
        int vastaus = logiikka.kerto(12, 9);
        assertEquals(108, vastaus);
    }
    
    @Test
    public void nelioMetodiToimii1() {
        int vastaus = logiikka.nelio(2);
        assertEquals(4, vastaus);
    }
    
    @Test
    public void nelioMetodiToimii2() {
        int vastaus = logiikka.nelio(15);
        assertEquals(225, vastaus);
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
    
    
    
}

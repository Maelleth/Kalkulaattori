/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin.laskin;

import laskin.laskin.kuuntelijat.LaskinUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sara
 */
public class LaskinUtilTest {
    
    public LaskinUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void onDOubletoimii1() {
        boolean palautus = LaskinUtil.onDouble("trolol");
        assertEquals(palautus, false);
    }
    
    @Test
    public void onDOubletoimii2() {
        boolean palautus = LaskinUtil.onDouble("20");
        assertEquals(palautus, true);
    }
}

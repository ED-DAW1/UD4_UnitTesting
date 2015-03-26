/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ed.ud4;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class LaberintoTest {
    Laberinto l;    
    
    public LaberintoTest() {
    }
    
    @Before
    public void setUp() {
        l = new Laberinto();
    }

    @Test
    public void testSimplifica() {
        assertEquals("LBLLBSR",l.simplifica("SRR"));
        /* Implementar más casos de prueba significativos */
    }
    
}

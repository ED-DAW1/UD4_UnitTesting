package daw.ed.ud4;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class DireccionIPTest {
    
    public DireccionIPTest() {
        
    }
    
    @Before
    public void setUp() {
    }
    

    @Test
    public void testClase() {
        assertEquals("A",new DireccionIP(0,0,0,0).clase());
        assertEquals("B",new DireccionIP(128,0,0,0).clase());
        assertEquals("C",new DireccionIP(192,168,1,1).clase());
        /* Implementar más casos de prueba significativos */
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testInvalidIP() {
        assertEquals("X",new DireccionIP(-1,0,0,0).clase());
        /* Implementar más casos de prueba significativos */
    }
    
}

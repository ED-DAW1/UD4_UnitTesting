package daw.ed.ud4;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class CalendarTest {
    
    Calendar c;
    public CalendarTest() {
    }
    
    @Before
    public void setUp() {
        c = new Calendar();
    }

    @Test
    public void testNumDia() {
        assertEquals(1,c.numDia(1,1,2012));
        /* Implementar más casos de prueba significativos */
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFechasErroneas() {
        assertEquals(0,c.numDia(-1,1,0));
        /* Implementar más casos de prueba significativos */

    }
    
}

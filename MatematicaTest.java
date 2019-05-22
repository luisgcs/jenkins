import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatematicaTest {
    
    private Numeros n;
    
    public MatematicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        n = new Numeros();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Matematica.
     */
    @Test
    public void testNumeroPar() {
        assertTrue(n.numeroPar(8));
    }
    
    @Test
    public void testAreaQuadrada() {
        
        assertEquals(100, n.areaQuadrado(10));
    }

    @Test
    public void testDivisivel() {
        assertTrue(n.numeroDivisivel(4, 2));
    }
    
    @Test
    public void testEquacao() {
        assertEquals(13, n.equacao(2, 3));
    }
}

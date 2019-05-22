import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteIntegracao {
    
    private Numeros n;
    
    public TesteIntegracao() {
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

    @Test
    public void testEquacao() {
        assertEquals(13, n.equacao(2, 3));
    }
}

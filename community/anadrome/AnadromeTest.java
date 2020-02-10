import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
/**
 * The test class AnadromeTest.
 *
 * @author  Jegors Čemisovs 
 * @version 2020-02-10
 */
public class AnadromeTest
{
    private static PrintStream originalOut;
    private static InputStream originalIn;

    private ByteArrayOutputStream out;

    /**
     * Default constructor for test class AnadromeTest
     */
    public AnadromeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        originalOut = System.out;
        originalIn = System.in;
    }
    
    @Test
    public void testExampeOne() {
        final String expected = "yes";
        var in = new ByteArrayInputStream("SoloSolo".getBytes());
        this.out = new ByteArrayOutputStream(expected.length() * 2);

        System.setIn(in);
        System.setOut(new PrintStream(this.out));
        
        Anadrome.main(null);
        assertEquals(expected, this.out.toString());
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        System.setOut(originalOut);
        System.setIn(originalIn);    
    }
}


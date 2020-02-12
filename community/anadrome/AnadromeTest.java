import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * The test class AnadromeTest.
 *
 * @author Jegors Čemisovs
 * @version 2020-02-10
 */

@RunWith(Parameterized.class)
public class AnadromeTest {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private final String input;
    private final String expected;

    public AnadromeTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"SoloSolo", "yes"}, 
                {"3haha", "yes"}, 
                {"Solo", "no"},
                {"BugaMuga", "yes"},
                {"catycat", "yes"}
        });
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testExampeOne() {
        System.err.printf("In:  %s%nOut: %s%n", input, expected);
        final var in = new ByteArrayInputStream(this.input.getBytes());
        System.setIn(in);
        Anadrome.main(null);
        assertEquals(expected, out.toString());
        System.err.printf("Results: %s / %s%n", expected, out.toString());
    }

    /**
     * Tears down the test fixture.
     * <p>
     * Called after every test case method.
     */
    @After
    public void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}


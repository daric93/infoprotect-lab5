package infoprotect.lab5;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by darya on 15.10.15.
 */
public class SysTest {
    @Test
    public void testReadQuestions() {
        Sys sys = new Sys();
        assertTrue(sys.getQuestions().isEmpty());
    }

    @Test
    public void testReadQuestionsNotEmpty() throws FileNotFoundException {
        Sys sys = new Sys();
        sys.readQuestions();
        assertFalse(sys.getQuestions().isEmpty());
    }
}
package infoprotect.lab5;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by darya on 14.10.15.
 */
public class UserTest {
    @Test
    public void testCorrectAnswer() {
        User user = new User("name", "");
        String question = "Cat name?";
        user.addQuestions(question, "Murka");
        assertTrue(user.checkQuestion(question, "Murka"));
    }

    @Test
    public void testIncorrectAnswer() {
        User user = new User("name", "");
        String question = "Cat name?";
        user.addQuestions(question, "Murka");
        assertFalse(user.checkQuestion(question, "Mur"));
    }
}
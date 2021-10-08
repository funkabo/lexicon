package se.lexicon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import se.lexicon.entity.Student;


/**
 * ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
 * ┃                       Exercise 1 Test                         ┃
 * ┃   unit test: App                                              ┃
 * ┃     version: 1.0                                              ┃
 * ┃      author: Federico Sanders <federico.sanders@hotmail.com>  ┃
 * ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
 */

public class AppTest 
{
    /**
     * Should be Equal
     */
    @Test
    public void shouldBeEqual() {
        Student student = new Student.StudentBuilder().withLastName("Sanders").build();
        assertEquals("Sanders", student.getLastName());
    }
}

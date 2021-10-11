package se.lexicon.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
 * ┃                        Exercise 2 Test                       ┃
 * ┃      title: Leap Year                                        ┃
 * ┃    version: 1.0                                              ┃
 * ┃     author: Federico Sanders <federico.sanders@hotmail.com>  ┃
 * ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
 */
public class LeapYearTest {

    @Test
    public void shouldBeLeapYear(){
        LeapYear year = LeapYear.init();
        assertEquals("Year 2000 is Leap Year", year.isLeapYear(2000));
    }

    @Test
    public void shouldBeNotLeapYear(){
        LeapYear year = LeapYear.init();
        assertEquals("Year 2001 is not a Leap Year", year.isLeapYear(2001));
    }
}

package se.lexicon;

import se.lexicon.utils.LeapYear;

/**
 * ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
 * ┃                            Exercise 2                        ┃
 * ┃      title: Leap Year                                        ┃
 * ┃    version: 1.0                                              ┃
 * ┃     author: Federico Sanders <federico.sanders@hotmail.com>  ┃
 * ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
 */
public class App {
    public static void main( String[] args ){
        LeapYear.init().run();
    }
}

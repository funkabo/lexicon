package se.lexicon;

import se.lexicon.entity.Student;

/**
 * ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
 * ┃                            Exercise 1                        ┃
 * ┃      title: Hello world!                                     ┃
 * ┃    version: 1.0                                              ┃
 * ┃     author: Federico Sanders <federico.sanders@hotmail.com>  ┃
 * ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
 */

public class App {

    public static void whoAmI(){
        System.out.println( new Student.StudentBuilder().withFirstName("Federico").withLastName("Sanders").build() );
    }
    public static void main( String[] args ) {
        System.out.println( "Hello" );
        whoAmI();
    }
}

package se.lexicon;


import se.lexicon.core.Calculator;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
 * ┃                            Exercise 1                        ┃
 * ┃      title: Calculator                                       ┃
 * ┃    version: 1.0                                              ┃
 * ┃     author: Federico Sanders <federico.sanders@hotmail.com>  ┃
 * ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
 */

public class App {

    public static void main( String[] args ) throws IOException {
        Calculator.init().run();
    }
}

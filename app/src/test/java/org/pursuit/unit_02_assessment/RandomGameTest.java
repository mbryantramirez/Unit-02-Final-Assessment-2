package org.pursuit.unit_02_assessment;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RandomGameTest {
    private RandomGame randomGame;

    @Before
    public void setUp(){
        randomGame = new RandomGame();
    }

    @Test
    public void test_get_random_number_method(){
        int number = randomGame.getRandomNumber();

        if(number <= 100 && number >= 1){
            assertTrue(true);
        }
        else{
            fail();
        }

    }
    @Test
    public void test_check_guess_method(){
        if(randomGame.checkGuess(55, 55)){
            assertTrue(true);
        }
        else{
            fail();
        }

    }
    @Test
    public void test_get_string_result(){
        String good = "You have guessed correctly!";
        String bad = "Wrong guess - please try again!";

        if(good.equals(randomGame.getStringResult(true))){
            assertTrue(true);
        }
        else{
            fail();
        }

        if(bad.equals(randomGame.getStringResult(false))){
            assertTrue(true);
        }
        else{
            fail();
        }
    }
    @Test
    public void test_string_to_int(){
        int number = 5;
        String input = "5";

        if(randomGame.stringToInt(input) == number){
            assertTrue(true);
        }
        else{
            fail();
        }
    }

    // TODO: Initialize any test variables with object values in a "setUp()"
    // method that runs before any of the unit tests.

    // TODO: Create a test method called "test_get_random_number_method()".
    // Add logic to confirm that the number returned from the getRandomNumber() method is between 1 and 100, including both 1 and 100.

    // TODO: Create a test method called "test_check_guess_method()".
    // Add logic to confirm that the boolean value returned is true if the numbers passed to the checkGuess() method are equal,
    // and false if they are not equal.

    // TODO: Create a test method called "test_get_string_result()".
    // Add logic to confirm that the String value returned from the getStringResult() method matches expected
    // output based on what boolean value is passed to the parameter.

    // TODO: Create a test method called "test_string_to_int()".
    // Add logic to confirm that the method stringToInt() returns a valid integer value based on
    // the String input provided.
}

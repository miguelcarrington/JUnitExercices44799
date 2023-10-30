package org.ws6Tests;

import org.ws6.Ws6_Ex6;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ws6_Ex6_Test {
    private Ws6_Ex6 ex6;
    private String number;

    private int count;

    @BeforeAll
    public static void onceExecutedBeforeAll () {
        System. out .println ( "Test Digit counter" ) ;
    }

    @BeforeEach
    public void setup(){
        ex6= new Ws6_Ex6();
        number = "0123456789";
        count = 10;
    }

    @Test
    public void countDigitsTest(){

        double test = ex6.countDigits(number);
        double expected = (double) (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) /count;
        assertEquals(test, expected, "Error counting digits");
    }
}

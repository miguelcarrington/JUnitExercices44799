package org.ws7Tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.ws7.Ws7_Ex2;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ws7_Ex2_Test {
    Ws7_Ex2 ex2 = new Ws7_Ex2();

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void isPrimeTest(int number){
        assertTrue(ex2.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void isEvenTest(int number){
        assertTrue(ex2.isEven(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"23,23", "46,23", "115,23", "184,23", "207,23", "230,23"})
    public void isMultipleTest(int number,int divisor){
        assertTrue(ex2.isMultiple(number, divisor));
    }

    @BeforeAll
    public static void beforeall(){
        System.out.println("Testing - isPrime(), isEven(), isMultiple()");
    }
}

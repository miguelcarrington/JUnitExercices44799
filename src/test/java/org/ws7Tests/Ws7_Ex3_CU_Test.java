package org.ws7Tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.ws7.Ws7_Ex3_CU;
import org.ws7.Ws7_Ex3_Mark;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Ws7_Ex3_CU_Test {


    Ws7_Ex3_CU testCU = new Ws7_Ex3_CU("", 0);

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Beginning tests for Ws7_Ex3_CU.java");
    }

    @BeforeEach
    public void beforeEach(){
        testCU.getMarks().clear();
    }

    @ParameterizedTest
    @ValueSource(strings = {"TestName1", "TesteName2", "Maths", "Software Quality"})
    public void getAndSetNameCUTest(String expected){
        testCU.setNameCU(expected);
        assertEquals(testCU.getNameCU(), expected, "Ws7_Ex3_CU method getNameCU() doesn't return CU name!");
    }

    @ParameterizedTest
    @CsvSource(value= {"44799, 13.5", "44356, 18.0", "42345, 9.0", "42934, 9,5", "42954, 8,0"})
    public void getAndSetMarksTest(int studentNumber, double mark){
        ArrayList<Ws7_Ex3_Mark> expected = new ArrayList<>();
        expected.add(new Ws7_Ex3_Mark(studentNumber, mark));
        testCU.setMarks(expected);
        assertSame(testCU.getMarks(), expected,  "Ws7_Ex3_CU method getMarks() doesn't return CU marks!");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,30,287,66,1234})
    public void getAndSetTotalStudentTest(int expected){
        testCU.setTotalStudents(expected);
        assertEquals(testCU.getTotalStudents(), expected, "Ws7_Ex3_CU method getTotalStudents() doesn't return CU total student number!");
    }

    @ParameterizedTest
    @CsvSource(value= {"44799, 13.5", "44356, 18.0", "42345, 9.0", "42934, 9,5", "42954, 8,0"})
    public void insertMarkCUTest(int studentNumber, double mark){
        ArrayList<Ws7_Ex3_Mark> expected = new ArrayList<>();
        expected.add(new Ws7_Ex3_Mark(studentNumber, mark));
        testCU.insertMarkCU(studentNumber, mark);
        assertEquals(testCU.getMarks().get(0).getNumStudent(), expected.get(0).getNumStudent(), "Ws7_Ex3_CU method insertMark() doesn't insert test mark!");
    }

    @ParameterizedTest
    @CsvSource(value= {"44799, 13.5", "44356, 18.0", "42345, 9.0", "42934, 9.5", "42954, 8.0"})
    public void searchStudentTest(int studentNumber, double mark){
        testCU.insertMarkCU(studentNumber, mark);
        assertEquals(testCU.searchStudent(studentNumber), mark, "Ws7_Ex3_CU method searchStudent() doesn't return correct mark!");
    }


    @Test
    public void averageCUTest(){
        testCU.insertMarkCU(44799, 13.5);
        testCU.insertMarkCU(44356, 18.0);
        testCU.insertMarkCU(42345, 9.0);
        testCU.insertMarkCU(42934, 9.5);
        testCU.insertMarkCU(42954, 8.0);
        assertEquals(testCU.averageCU(), 11.6, "Ws7_Ex3_CU method searchStudent() doesn't return correct mark!");
    }

    @ParameterizedTest
    @CsvSource(value= {"44799, 13.5", "44356, 18.0", "42345, 9.0", "42934, 9.5", "42954, 8.0"})
    public void isApprovedTest(int studentNumber, double mark){
        testCU.insertMarkCU(studentNumber, mark);
        if (mark >= 9.5)
            assertTrue(testCU.isApproved(studentNumber), "Ws7_Ex3_CU method isApproved() doesn't return correct mark assessment!");
        else
            assertFalse(testCU.isApproved(studentNumber), "Ws7_Ex3_CU method isApproved() doesn't return correct mark assessment!");
    }
}

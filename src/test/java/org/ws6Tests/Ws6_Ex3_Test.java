package org.ws6Tests;

import org.ws6.Ws6_Ex3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ws6_Ex3_Test {
    @Test
    public void calcAreaTest(){
        Ws6_Ex3 ws6ex3 = new Ws6_Ex3();
        int area = ws6ex3.calcArea(3, 5);
        int testArea = 15;
        assertEquals(area, testArea,"Error calculating the area!!");
    }

    @Test
    public void calcPerimeterTest() {
        Ws6_Ex3 ws6ex3 = new Ws6_Ex3();
        int perimeter = ws6ex3.calcPerimeter(3, 5);
        assertEquals(perimeter, 16, "Error calculating the perimeter!!");

    }
    @Test
    public void isTriangleTest(){
        Ws6_Ex3 ws6ex3 = new Ws6_Ex3();
        assertTrue(ws6ex3.isTriangle(5,5,5));
    }
}
